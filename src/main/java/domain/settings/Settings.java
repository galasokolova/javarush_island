package domain.settings;

import domain.creatures.Organisms;
import domain.factory.OrganismCreator;
import domain.factory.SameTypeCreature;

import java.util.*;

public class Settings {
    private static Settings settings;
    public static final int WIDTH_OF_ISLAND = 2;
    public static final int LENGTH_OF_ISLAND = 2;
    public static final int PERIOD_DURATION = 100;
    public static final Boolean STOP_ON_TIMEOUT = true;
    public static final int GAME_PERIOD = 100;
    public static final int INITIAL_WEIGHT_PERCENT = 50;
    public static final int PLANT_GROW_UP_PERCENT = 5;
    public static final int ANIMAL_GROW_UP_PERCENT = 10;
    public static final int INITIAL_BIRTH_PERCENT = 5;
    public static List<String> creatureTypes;

    public Map<String, SameTypeCreature> getSameTypeCreature(){
        Map<String, SameTypeCreature> sameTypeCreature = new HashMap<>();
        sameTypeCreature.put(OrganismCreator.BEAR.getImage(), OrganismCreator.BEAR);
        sameTypeCreature.put(OrganismCreator.BOA.getImage(), OrganismCreator.BOA);
        sameTypeCreature.put(OrganismCreator.BOAR.getImage(), OrganismCreator.BOAR);
        sameTypeCreature.put(OrganismCreator.BUFFALO.getImage(), OrganismCreator.BUFFALO);
        sameTypeCreature.put(OrganismCreator.CATERPILLAR.getImage(), OrganismCreator.CATERPILLAR);
        sameTypeCreature.put(OrganismCreator.DEER.getImage(), OrganismCreator.DEER);
        sameTypeCreature.put(OrganismCreator.DUCK.getImage(), OrganismCreator.DUCK);
        sameTypeCreature.put(OrganismCreator.EAGLE.getImage(), OrganismCreator.EAGLE);
        sameTypeCreature.put(OrganismCreator.FOX.getImage(), OrganismCreator.FOX);
        sameTypeCreature.put(OrganismCreator.GOAT.getImage(), OrganismCreator.GOAT);
        sameTypeCreature.put(OrganismCreator.HORSE.getImage(), OrganismCreator.HORSE);
        sameTypeCreature.put(OrganismCreator.MOUSE.getImage(), OrganismCreator.MOUSE);
        sameTypeCreature.put(OrganismCreator.PLANT.getImage(), OrganismCreator.PLANT);
        sameTypeCreature.put(OrganismCreator.RABBIT.getImage(), OrganismCreator.RABBIT);
        sameTypeCreature.put(OrganismCreator.SHEEP.getImage(), OrganismCreator.SHEEP);
        sameTypeCreature.put(OrganismCreator.WOLF.getImage(), OrganismCreator.WOLF);
        return sameTypeCreature;
    }

    public Map<String, Map<String, Integer>> getFoodMapProbability() {
        FoodSettings foodSettings = new FoodSettings();
        Map<String, Map<String, Integer>> foodMapProbability = new HashMap<>();
        foodMapProbability.put(OrganismCreator.BEAR.getName(), foodSettings.getBearVictimsProbability());
        foodMapProbability.put(OrganismCreator.BOA.getName(), foodSettings.getBoaVictimsProbability());
        foodMapProbability.put(OrganismCreator.BOAR.getName(), foodSettings.getBoarVictimsProbability());
        foodMapProbability.put(OrganismCreator.BUFFALO.getName(), foodSettings.getBuffaloVictimsProbability());
        foodMapProbability.put(OrganismCreator.CATERPILLAR.getName(), foodSettings.getCaterpillarVictimsProbability());
        foodMapProbability.put(OrganismCreator.DEER.getName(), foodSettings.getDeerVictimsProbability());
        foodMapProbability.put(OrganismCreator.DUCK.getName(), foodSettings.getDuckVictimsProbability());
        foodMapProbability.put(OrganismCreator.EAGLE.getName(), foodSettings.getEagleVictimsProbability());
        foodMapProbability.put(OrganismCreator.FOX.getName(), foodSettings.getFoxVictimsProbability());
        foodMapProbability.put(OrganismCreator.GOAT.getName(), foodSettings.getGoatVictimsProbability());
        foodMapProbability.put(OrganismCreator.HORSE.getName(), foodSettings.getHorseVictimsProbability());
        foodMapProbability.put(OrganismCreator.MOUSE.getName(), foodSettings.getMouseVictimsProbability());
        foodMapProbability.put(OrganismCreator.RABBIT.getName(), foodSettings.getRabbitVictimsProbability());
        foodMapProbability.put(OrganismCreator.SHEEP.getName(), foodSettings.getSheepVictimsProbability());
        foodMapProbability.put(OrganismCreator.WOLF.getName(), foodSettings.getWolfVictimsProbability());
        return foodMapProbability;
    }
    public int getWidthOfIsland() {
        return WIDTH_OF_ISLAND;
    }

    public int getLengthOfIsland() {
        return LENGTH_OF_ISLAND;
    }

    public int getPeriodDuration() {
        return PERIOD_DURATION;
    }

    public Boolean getStopOnTimeout() {
        return STOP_ON_TIMEOUT;
    }

    public int getGamePeriod() {
        return GAME_PERIOD;
    }
    public int getAnimalGrowUpPercent() {
        return ANIMAL_GROW_UP_PERCENT;
    }


    public int getInitialWeightPercent() {
        return INITIAL_WEIGHT_PERCENT;
    }
    public int getInitialBirthPercent() {
        return INITIAL_BIRTH_PERCENT;
    }


    public int getPlantGrowUpPercent() {
        return PLANT_GROW_UP_PERCENT;
    }

    public Map<String, Integer> getOrganismChildrenQuantity(){
        Map<String, Integer> organismsChildrenQuantity = new HashMap<>();
        organismsChildrenQuantity.put(OrganismCreator.BEAR.getName(), OrganismCreator.BEAR.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.BOA.getName(), OrganismCreator.BOA.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.BOAR.getName(), OrganismCreator.BOAR.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.BUFFALO.getName(), OrganismCreator.BUFFALO.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.CATERPILLAR.getName(), OrganismCreator.CATERPILLAR.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.DEER.getName(), OrganismCreator.DEER.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.DUCK.getName(), OrganismCreator.DUCK.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.EAGLE.getName(), OrganismCreator.EAGLE.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.FOX.getName(), OrganismCreator.FOX.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.GOAT.getName(), OrganismCreator.GOAT.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.HORSE.getName(), OrganismCreator.HORSE.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.MOUSE.getName(), OrganismCreator.MOUSE.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.PLANT.getName(), OrganismCreator.PLANT.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.RABBIT.getName(), OrganismCreator.RABBIT.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.SHEEP.getName(), OrganismCreator.SHEEP.getMaxQuantityPerCell()/2);
        organismsChildrenQuantity.put(OrganismCreator.WOLF.getName(), OrganismCreator.WOLF.getMaxQuantityPerCell()/2);
        return organismsChildrenQuantity;
    }

    public Map<String, Integer> getCreatureInitialQuantity(){
        Map<String, Integer> creatureInitialQuantity = new HashMap<>();
        creatureInitialQuantity.put(OrganismCreator.BEAR.getName(),Randomizer.getRandom(0, 5));
        creatureInitialQuantity.put(OrganismCreator.BOA.getName(), Randomizer.getRandom(0, 30));
        creatureInitialQuantity.put(OrganismCreator.BOAR.getName(), Randomizer.getRandom(0, 50));
        creatureInitialQuantity.put(OrganismCreator.BUFFALO.getName(), Randomizer.getRandom(0, 10));
        creatureInitialQuantity.put(OrganismCreator.CATERPILLAR.getName(), Randomizer.getRandom(0, 1000));
        creatureInitialQuantity.put(OrganismCreator.DEER.getName(), Randomizer.getRandom(0, 20));
        creatureInitialQuantity.put(OrganismCreator.DUCK.getName(), Randomizer.getRandom(0, 200));
        creatureInitialQuantity.put(OrganismCreator.EAGLE.getName(), Randomizer.getRandom(0, 20));
        creatureInitialQuantity.put(OrganismCreator.FOX.getName(), Randomizer.getRandom(0, 30));
        creatureInitialQuantity.put(OrganismCreator.GOAT.getName(), Randomizer.getRandom(0, 140));
        creatureInitialQuantity.put(OrganismCreator.HORSE.getName(), Randomizer.getRandom(0, 20));
        creatureInitialQuantity.put(OrganismCreator.MOUSE.getName(), Randomizer.getRandom(0, 500));
        creatureInitialQuantity.put(OrganismCreator.PLANT.getName(), Randomizer.getRandom(0, 200));
        creatureInitialQuantity.put(OrganismCreator.RABBIT.getName(), Randomizer.getRandom(0, 150));
        creatureInitialQuantity.put(OrganismCreator.SHEEP.getName(), Randomizer.getRandom(0, 140));
        creatureInitialQuantity.put(OrganismCreator.WOLF.getName(), Randomizer.getRandom(0, 30));
        return creatureInitialQuantity;
    }
    public List<String> getCreatureTypes() {

        creatureTypes = new ArrayList<>(getSameTypeCreature().keySet());
        return creatureTypes;
    }
    public static Settings get() {
        Settings settings = Settings.settings;

        if (Objects.isNull(settings)) {
            synchronized (Settings.class) {
                settings = Settings.settings;
                if (Objects.isNull(settings)) {
                    settings = Settings.settings = new Settings();
                }
            }
        }

        return settings;
    }

}
