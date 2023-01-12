package domain.settings;

import lombok.Getter;

import java.util.Objects;

@Getter
public class CreaturesParameters {
    String name;
    String image;
    double maxWeight;
    int maxQuantityPerCell;
    int speed;
    double satiety;

    public static final CreaturesParameters WOLF_BASIC_PARAMETERS = new CreaturesParameters("wolf","\uD83D\uDC3A",50,30, 3, 8);
    public static final CreaturesParameters RABBIT_BASIC_PARAMETERS = new CreaturesParameters("rabbit", "\uD83D\uDC07", 2,150, 2, 0.45);
    public static final CreaturesParameters BOA_BASIC_PARAMETERS = new CreaturesParameters("boa", "\uD83D\uDC0D", 15,30, 1, 3);
    public static final CreaturesParameters FOX_BASIC_PARAMETERS = new CreaturesParameters("fox", "\uD83E\uDD8A", 8,30, 2, 2);
    public static final CreaturesParameters BEAR_BASIC_PARAMETERS = new CreaturesParameters("bear", "\uD83D\uDC3B", 500,5, 2, 80);
    public static final CreaturesParameters EAGLE_BASIC_PARAMETERS = new CreaturesParameters("eagle", "\uD83E\uDD85", 6,20, 3, 1);
    public static final CreaturesParameters HORSE_BASIC_PARAMETERS = new CreaturesParameters("horse", "\uD83D\uDC0E", 400,20, 4, 60);
    public static final CreaturesParameters DEER_BASIC_PARAMETERS = new CreaturesParameters("deer", "\uD83E\uDD8C", 300,20, 4, 50);
    public static final CreaturesParameters MOUSE_BASIC_PARAMETERS = new CreaturesParameters("mouse", "\uD83D\uDC01", 0.05,500, 1, 0.01);
    public static final CreaturesParameters GOAT_BASIC_PARAMETERS = new CreaturesParameters("goat", "\uD83D\uDC10", 60,140, 3, 10);
    public static final CreaturesParameters SHEEP_BASIC_PARAMETERS = new CreaturesParameters("sheep", "\uD83D\uDC11", 70,140, 3, 15);
    public static final CreaturesParameters BOAR_BASIC_PARAMETERS = new CreaturesParameters("boar", "\uD83D\uDC17", 400,50, 2, 50);
    public static final CreaturesParameters BUFFALO_BASIC_PARAMETERS = new CreaturesParameters("buffalo", "\uD83D\uDC03", 700,10, 3, 100);
    public static final CreaturesParameters DUCK_BASIC_PARAMETERS = new CreaturesParameters("duck", "\uD83E\uDD86", 1,200, 4, 0.15);
    public static final CreaturesParameters CATERPILLAR_BASIC_PARAMETERS = new CreaturesParameters("caterpillar", "\uD83D\uDC1B", 0.01,1000, 0, 0);
    public static final CreaturesParameters PLANT_BASIC_PARAMETERS = new CreaturesParameters("plant", "☘", 1,200, 0, 0);
    public CreaturesParameters(String name, String image, double maxWeight, int maxQuantityPerCell, int speed, double satiety) {
        this.name = name;
        this.image = image;
        this.maxWeight = maxWeight;
        this.maxQuantityPerCell = maxQuantityPerCell;
        this.speed = speed;
        this.satiety = satiety;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreaturesParameters that = (CreaturesParameters) o;
        return Double.compare(that.maxWeight, maxWeight) == 0 && maxQuantityPerCell == that.maxQuantityPerCell && speed == that.speed && Double.compare(that.satiety, satiety) == 0 && Objects.equals(name, that.name) && Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, image, maxWeight, maxQuantityPerCell, speed, satiety);
    }

    @Override
    public String toString() {
        return "CreaturesParameters{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", maxWeight=" + maxWeight +
                ", maxQuantityPerCell=" + maxQuantityPerCell +
                ", speed=" + speed +
                ", satiety=" + satiety +
                '}';
    }
}

