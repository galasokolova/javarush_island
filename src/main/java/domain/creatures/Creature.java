package domain.creatures;

import domain.factory.OrganismCreator;
import domain.factory.SameTypeCreature;
import domain.location.Location;
import domain.settings.Randomizer;
import domain.settings.Settings;

public abstract class Creature {
    private final String type = this.getClass().getSimpleName();

    private double weight;

    public abstract void multiply(Location location);

    public abstract void growUp(Location area);

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    protected Creature() {
        double maxWeight = 0;
        for (SameTypeCreature typeCreature : new OrganismCreator().getTypeList()) {
            maxWeight= typeCreature.getMaxWeight();
        }
        this.weight = Randomizer.getRandom((int) (maxWeight / 2.0D), (int) maxWeight);
    }

    public int getChildQuantity(Location location) {
        Settings settings = Settings.get();
        Integer childrenQuantity = settings.getOrganismChildrenQuantity().get(getType());
        int maxQuantityInArea = settings.getSameTypeCreature().get(getType()).getMaxQuantityPerCell();
        int newBornQuantity = Randomizer.getRandom(0, Math.min(childrenQuantity, maxQuantityInArea));
        int sameOrganismTypeQuantity = location.getInhabitants().get(this.getType()).toArray().length;

        return Math.min(maxQuantityInArea - sameOrganismTypeQuantity, newBornQuantity);
    }

    public void starve(Location location) { safeStarve(location); }

    private void safeStarve(Location location) {
        location.getLock().lock();
        try {
            SameTypeCreature sameTypeCreature = Settings.get().getSameTypeCreature().get(this.getType());
            int weightLossPercent;
            if (this instanceof Animal) {
                weightLossPercent = 20;
            }
            else {
                weightLossPercent = 1;
            }

            double weightLoss = sameTypeCreature.getMaxWeight() * weightLossPercent / 100;
            this.setWeight(this.getWeight() - weightLoss);

            if (this.getWeight() < sameTypeCreature.getMaxWeight() * 0.3) {
                location.getInhabitants().get(this.getType()).remove(this);
            }
        } finally {
            location.getLock().unlock();
        }
    }
}
