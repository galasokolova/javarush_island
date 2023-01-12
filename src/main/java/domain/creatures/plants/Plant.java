package domain.creatures.plants;

import domain.creatures.Creature;
import domain.factory.Factories;
import domain.location.Location;
import domain.settings.Randomizer;
import domain.settings.Settings;

public class Plant extends Creature {
    public Plant() {
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
            int newPlantsQuantity = this.getChildQuantity(location);
            if (newPlantsQuantity > 0) {
                for (int i = 0; i < newPlantsQuantity; i++) {
                    if (Randomizer.getProbability(5)) {
                        Creature newPlant = factories.createByType(this.getType());
                        location.addInhabitant(this.getType(), newPlant);
                    }
                }
            }
        } finally {
            location.getLock().unlock();
        }
    }

    public void growUp(Location location) {
        safeGrowUp(location);
    }

    private void safeGrowUp(Location location) {
        location.getLock().lock();
        try {
            int growUpPercent = Settings.get().getPlantGrowUpPercent();
            double weightIncrement = this.getWeight() * growUpPercent / 100;
            this.setWeight(this.getWeight() + weightIncrement);
        } finally {
            location.getLock().unlock();
        }
    }
}
