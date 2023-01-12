package domain.factory;

import domain.creatures.Creature;
import domain.factory.factories.*;

import java.util.HashMap;
import java.util.Map;

public class Factories {

    private Map<String, Creatable> getFactoriesMap() {
        Map<String, Creatable> factoriesMap = new HashMap<>();
        factoriesMap.put("Bear", new BearFactory());
        factoriesMap.put("Boa", new BoaFactory());
        factoriesMap.put("Boar", new BoarFactory());
        factoriesMap.put("Buffalo", new BuffaloFactory());
        factoriesMap.put("Caterpillar", new CaterpillarFactory());
        factoriesMap.put("Deer", new DeerFactory());
        factoriesMap.put("Duck", new DuckFactory());
        factoriesMap.put("Eagle", new EagleFactory());
        factoriesMap.put("Fox", new FoxFactory());
        factoriesMap.put("Goat", new GoatFactory());
        factoriesMap.put("Horse", new HorseFactory());
        factoriesMap.put("Mouse", new MouseFactory());
        factoriesMap.put("Plant", new PlantFactory());
        factoriesMap.put("Rabbit", new RabbitFactory());
        factoriesMap.put("Sheep", new SheepFactory());
        factoriesMap.put("Wolf", new WolfFactory());
        return factoriesMap;
    }
    public synchronized Creature createByType(String creatureType) {
        for(Map.Entry<String, Creatable> item : getFactoriesMap().entrySet()){
            creatureType = item.getKey();
        }
        return getFactoriesMap().get(creatureType).createOrganism();
    }
}
