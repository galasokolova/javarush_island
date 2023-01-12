package domain.location;

import domain.creatures.Creature;
import domain.factory.Factories;
import domain.settings.Randomizer;
import domain.settings.Settings;

import java.util.*;

public class Island{

    Coordinates coordinates = new Coordinates(Settings.get().getWidthOfIsland(), Settings.get().getLengthOfIsland());

    public World createIsland() {
        World world = new World(coordinates);
        createAreas(world);
        getCellsToMove(world);
        return world;
    }

    public void createAreas(World world) {
        Location[][] cells = world.getLocation();
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                cells[row][col] = createLocation();
            }
        }
    }

    private Location createLocation() {
        Map<String, Integer> organismsInitialQuantityMap = Settings.get().getCreatureInitialQuantity();
        int initialBirthPercent = Settings.get().getInitialBirthPercent();
        Map<String, Set<Creature>> inhabitants = new HashMap<>();

        for (Map.Entry<String, Integer> entry : organismsInitialQuantityMap.entrySet()) {
            String organismType = entry.getKey();
            Integer organismQuantity = entry.getValue();

            Set<Creature> organismSet = new HashSet<>();
            for (int i = 0; i < organismQuantity; i++) {
                if (Randomizer.getProbability(initialBirthPercent)) {
                    organismSet.add(new Factories().createByType(organismType));
                }
            }
            inhabitants.put(organismType, organismSet);
        }

        Location newArea = new Location();
        newArea.setInhabitants(inhabitants);

        return newArea;
    }
    private void getCellsToMove(World world){
        Location[][] areas = world.getLocation();

        for (int row = 0; row < areas.length; row++) {
            for (int col = 0; col < areas[row].length; col++) {
                List<Location> nearestAreas = new ArrayList<>();

                if (row > 0) {
                    nearestAreas.add(areas[row - 1][col]);
                }
                if (col > 0) {
                    nearestAreas.add(areas[row][col - 1]);
                }
                if (row < areas.length - 1) {
                    nearestAreas.add(areas[row + 1][col]);
                }
                if (col < areas[row].length - 1) {
                    nearestAreas.add(areas[row][col + 1]);
                }

                areas[row][col].setAreasForMove(nearestAreas);
            }
        }
    }
}
