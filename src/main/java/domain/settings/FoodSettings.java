package domain.settings;

import domain.creatures.Organisms;

import java.util.HashMap;
import java.util.Map;

public class FoodSettings {
    Map<String, Integer> getBearVictimsProbability(){
        Map<String, Integer> bearVictimsProbability = new HashMap<>();
        bearVictimsProbability.put(String.valueOf(Organisms.BOA), 80);
        bearVictimsProbability.put(String.valueOf(Organisms.BOAR), 50);
        bearVictimsProbability.put(String.valueOf(Organisms.BUFFALO), 20);
        bearVictimsProbability.put(String.valueOf(Organisms.DEER), 80);
        bearVictimsProbability.put(String.valueOf(Organisms.DUCK), 10);
        bearVictimsProbability.put(String.valueOf(Organisms.GOAT), 70);
        bearVictimsProbability.put(String.valueOf(Organisms.HORSE), 40);
        bearVictimsProbability.put(String.valueOf(Organisms.MOUSE), 90);
        bearVictimsProbability.put(String.valueOf(Organisms.RABBIT), 80);
        bearVictimsProbability.put(String.valueOf(Organisms.SHEEP), 70);

        return bearVictimsProbability;
    }
    Map<String, Integer> getBoaVictimsProbability(){
        Map<String, Integer> boaVictimsProbability = new HashMap<>();
        boaVictimsProbability.put(String.valueOf(Organisms.DUCK), 10);
        boaVictimsProbability.put(String.valueOf(Organisms.FOX), 15);
        boaVictimsProbability.put(String.valueOf(Organisms.MOUSE), 40);
        boaVictimsProbability.put(String.valueOf(Organisms.RABBIT), 20);

        return boaVictimsProbability;
    }
    Map<String,Integer> getBoarVictimsProbability(){
        Map<String, Integer> boarVictimsProbability = new HashMap<>();
        boarVictimsProbability.put(String.valueOf(Organisms.MOUSE), 90);
        boarVictimsProbability.put(String.valueOf(Organisms.CATERPILLAR), 90);
        boarVictimsProbability.put(String.valueOf(Organisms.PLANT), 100);
        return boarVictimsProbability;
    }
    Map<String,Integer> getBuffaloVictimsProbability(){
        Map<String, Integer> buffaloVictimsProbability = new HashMap<>();
        buffaloVictimsProbability.put(String.valueOf(Organisms.PLANT), 100);
        return buffaloVictimsProbability;
    }
    Map<String,Integer> getCaterpillarVictimsProbability(){
        Map<String, Integer> caterpillarVictimsProbability = new HashMap<>();
        caterpillarVictimsProbability.put(String.valueOf(Organisms.PLANT), 100);
        return caterpillarVictimsProbability;
    }

    public Map<String, Integer> getDeerVictimsProbability() {
        Map<String, Integer> deerVictimsProbability = new HashMap<>();
        deerVictimsProbability.put(String.valueOf(Organisms.PLANT), 100);
        return deerVictimsProbability;
    }

    public Map<String, Integer> getDuckVictimsProbability() {
        Map<String, Integer> duckVictimsProbability = new HashMap<>();
        duckVictimsProbability.put(String.valueOf(Organisms.CATERPILLAR), 90);
        duckVictimsProbability.put(String.valueOf(Organisms.PLANT), 100);
        return duckVictimsProbability;
    }

    public Map<String, Integer> getEagleVictimsProbability() {
        Map<String, Integer> eagleVictimsProbability = new HashMap<>();
        eagleVictimsProbability.put(String.valueOf(Organisms.FOX), 10);
        eagleVictimsProbability.put(String.valueOf(Organisms.RABBIT), 90);
        eagleVictimsProbability.put(String.valueOf(Organisms.MOUSE), 90);
        eagleVictimsProbability.put(String.valueOf(Organisms.DUCK), 80);
        return eagleVictimsProbability;
    }

    public Map<String, Integer> getFoxVictimsProbability() {
        Map<String, Integer> foxVictimsProbability = new HashMap<>();
        foxVictimsProbability.put(String.valueOf(Organisms.CATERPILLAR), 40);
        foxVictimsProbability.put(String.valueOf(Organisms.DUCK), 60);
        foxVictimsProbability.put(String.valueOf(Organisms.MOUSE), 90);
        foxVictimsProbability.put(String.valueOf(Organisms.RABBIT), 70);
        return foxVictimsProbability;
    }

    public Map<String, Integer> getGoatVictimsProbability() {
        Map<String, Integer> goatVictimsProbability = new HashMap<>();
        goatVictimsProbability.put(String.valueOf(Organisms.PLANT), 100);
        return goatVictimsProbability;
    }

    public Map<String, Integer> getHorseVictimsProbability() {
        Map<String, Integer> horseVictimsProbability = new HashMap<>();
        horseVictimsProbability.put(String.valueOf(Organisms.PLANT), 100);
        return horseVictimsProbability;
    }

    public Map<String, Integer> getMouseVictimsProbability() {
        Map<String, Integer> mouseVictimsProbability = new HashMap<>();
        mouseVictimsProbability.put(String.valueOf(Organisms.CATERPILLAR), 90);
        mouseVictimsProbability.put(String.valueOf(Organisms.PLANT), 100);
        return mouseVictimsProbability;
    }
    public Map<String, Integer> getRabbitVictimsProbability() {
        Map<String, Integer> rabbitVictimsProbability = new HashMap<>();
        rabbitVictimsProbability.put(String.valueOf(Organisms.PLANT), 100);
        return rabbitVictimsProbability;
    }

    public Map<String, Integer> getSheepVictimsProbability() {
        Map<String, Integer> sheepVictimsProbability = new HashMap<>();
        sheepVictimsProbability.put(String.valueOf(Organisms.PLANT), 100);
        return sheepVictimsProbability;
    }

    public Map<String, Integer> getWolfVictimsProbability() {
        Map<String, Integer> wolfVictimsProbability = new HashMap<>();
        wolfVictimsProbability.put(String.valueOf(Organisms.BOAR), 15);
        wolfVictimsProbability.put(String.valueOf(Organisms.BUFFALO), 10);
        wolfVictimsProbability.put(String.valueOf(Organisms.DEER), 15);
        wolfVictimsProbability.put(String.valueOf(Organisms.DUCK), 40);
        wolfVictimsProbability.put(String.valueOf(Organisms.GOAT), 60);
        wolfVictimsProbability.put(String.valueOf(Organisms.HORSE), 10);
        wolfVictimsProbability.put(String.valueOf(Organisms.MOUSE), 80);
        wolfVictimsProbability.put(String.valueOf(Organisms.RABBIT), 60);
        wolfVictimsProbability.put(String.valueOf(Organisms.SHEEP), 70);
        return wolfVictimsProbability;
    }
}
