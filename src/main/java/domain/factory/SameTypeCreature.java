package domain.factory;

public class SameTypeCreature {
    String name;
    String image;
    double maxWeight;
    int maxQuantityPerCell;
    int speed;
    double satiety;

    public String getName() {
        return name;
    }
    public String getImage() {
        return image;
    }
    public double getMaxWeight() {
        return maxWeight;
    }
    public int getMaxQuantityPerCell() {
        return maxQuantityPerCell;
    }
    public int getSpeed() {
        return speed;
    }
    public double getSatiety() {
        return satiety;
    }

    public SameTypeCreature(String name, String image, double maxWeight, int maxQuantityPerCell, int speed, double satiety) {
        this.name = name;
        this.image = image;
        this.maxWeight = maxWeight;
        this.maxQuantityPerCell = maxQuantityPerCell;
        this.speed = speed;
        this.satiety = satiety;
    }
}
