package domain.creatures;

import domain.factory.Factories;
import domain.factory.SameTypeCreature;
import domain.location.Location;
import domain.settings.Randomizer;
import domain.settings.Settings;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Animal extends Creature {
    protected Animal() {
        super();
    }

    @Override
    public void multiply(Location location) {
        safeMultiply(location);
    }

    private void safeMultiply(Location location) {

        location.getLock().lock();
        try {
            Factories factories = new Factories();
            int sameAnimalTypeQuantity = location.getInhabitants().get(this.getType()).toArray().length;
            int childrenQuantity = this.getChildQuantity(location);

            if (childrenQuantity > 0 && sameAnimalTypeQuantity > 1 && Randomizer.getProbability(50)) {
                for (int i = 0; i < childrenQuantity; i++) {
                    if (Randomizer.getProbability(90)) {
                        Creature newAnimal = factories.createByType(this.getType());
                        location.addInhabitant(this.getType(), newAnimal);
                    }
                }
            }

        } finally {
            location.getLock().unlock();
        }

    }

    public boolean eat(Location location) {
        return safeEat(location);
    }

    private boolean safeEat(Location location) {
        location.getLock().lock();
        boolean ate = false;

        try {
            SameTypeCreature sameTypeCreature = Settings.get().getSameTypeCreature().get(this.getType());

            double weightDiff = sameTypeCreature.getMaxWeight() - this.getWeight();
            double foodRequired = Math.min(weightDiff, sameTypeCreature.getSatiety());
            if (foodRequired > 0) {
                Map<String, Integer> chanceToGetEatMap = Settings.get().getFoodMapProbability().get(this.getType());
                Iterator<Map.Entry<String, Integer>> chanceToGetEatIterator = chanceToGetEatMap.entrySet().iterator();
                while (foodRequired > 0 && chanceToGetEatIterator.hasNext()) {
                    Map.Entry<String, Integer> chanceToGetEat = chanceToGetEatIterator.next();
                    String foodType = chanceToGetEat.getKey();
                    Integer chanceToEat = chanceToGetEat.getValue();

                    Set<Creature> foodSet = location.getInhabitants().get(foodType);
                    if (Randomizer.getProbability(chanceToEat) && foodSet != null && !foodSet.isEmpty()) {
                        Iterator<Creature> foodIterator = foodSet.iterator();
                        if (foodIterator.hasNext()) {
                            Creature food = foodIterator.next();
                            double initialFoodWeight = food.getWeight();
                            double mealWeight = Math.min(foodRequired, initialFoodWeight);
                            foodRequired -= mealWeight;
                            setWeight(getWeight() + mealWeight);
                            food.setWeight(food.getWeight() - mealWeight);

                            double currentFoodWeight = food.getWeight();
                            if (currentFoodWeight < initialFoodWeight / Settings.get().getInitialWeightPercent()) {
                                foodIterator.remove();
                            }

                            ate = true;
                            if (foodRequired <= 0) {
                                break;
                            }
                        }
                    }
                }
            }
        } finally {
            location.getLock().unlock();
        }

        return ate;
    }

    public void growUp(Location location) {
        safeGrowUp(location);
    }

    private void safeGrowUp(Location location) {
        location.getLock().lock();
        try {
            int growUpPercent = Settings.get().getAnimalGrowUpPercent();
            double weightIncrement = this.getWeight() * growUpPercent / 100;
            this.setWeight(this.getWeight() + weightIncrement);
        } finally {
            location.getLock().unlock();
        }
    }

    public void move(Location location) {
        safeMove(location);
    }

    private void safeMove(Location currentArea) {
        currentArea.getLock().lock();
        try {
            int speed = getSpeed();
            if (speed > 0) {
                Location destinationArea = getNextArea(currentArea, speed);
                Set<Creature> currentAreaOrganisms = currentArea.getInhabitants().get(this.getType());
                currentAreaOrganisms.remove(this);

                Set<Creature> destinationAreaOrganisms = destinationArea.getInhabitants().get(this.getType());
                destinationAreaOrganisms.add(this);
            }
        } finally {
            currentArea.getLock().unlock();
        }
    }

    private int getSpeed() {
        int maxSpeed = Settings.get().getSameTypeCreature().get(this.getType()).getSpeed();
        return Randomizer.getRandom(0, maxSpeed);
    }

    private Location getNextArea(Location currentArea, int currentSpeed) {
        List<Location> nearestAreas = currentArea.getAreasForMove();
        if (currentSpeed > 0) {
            int nextAreaIndex = Randomizer.getRandom(0, nearestAreas.size());
            if (nextAreaIndex == 0) {
                return getNextArea(currentArea, currentSpeed - 1);
            } else {
                return getNextArea(nearestAreas.get(nextAreaIndex - 1), currentSpeed - 1);
            }
        } else {
            return currentArea;
        }
    }

}
