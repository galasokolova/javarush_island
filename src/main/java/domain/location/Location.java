package domain.location;

import domain.creatures.Creature;
import domain.factory.OrganismCreator;
import domain.settings.Randomizer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Location {
    OrganismCreator organismCreator = new OrganismCreator();
    private Map<String, Set<Creature>> inhabitants = new HashMap<>();
    private List<Location> areasForMove;
    private final Lock lock = new ReentrantLock(true);

    public Map<String, Set<Creature>> getInhabitants() {

        return inhabitants;
    }

    public void setInhabitants(Map<String, Set<Creature>> inhabitants) {
        this.inhabitants = inhabitants;
    }
    public List<Location> getAreasForMove() {
        return areasForMove;
    }

    public void setAreasForMove(List<Location> areasForMove) {
        this.areasForMove = areasForMove;
    }

    public Lock getLock() {
        return lock;
    }

    @Override
    public String toString() {
        HashMap<String, Integer> areaStatistics = new HashMap<>();
        inhabitants.forEach((key, value) -> {
            organismCreator = new OrganismCreator();

            String image = organismCreator.getImageByType().get(key);

            int count = value.size();

            areaStatistics.put(image, Randomizer.getRandom(0,count));

        });

        return areaStatistics.toString();
    }




    public void addInhabitant(String organismType, Creature newPlant) {
        inhabitants.get(organismType).add(newPlant);
    }

}
