package domain.game;

import domain.location.Location;
import domain.location.World;
import domain.settings.Settings;

public class Game {
    Settings settings = new Settings();
    private final World world;

    public Game(World world) {
        this.world = world;
    }

    public World getWorld() {
        return world;
    }

    public void showStatistics() {
        Location[][] areas = world.getLocation();
        for (int i = 0; i < areas.length; i++) {
            for (int j = 0; j < areas[i].length; j++) {
                int rowNumber = String.valueOf(settings.getWidthOfIsland()).length();
                int colNumber = String.valueOf(settings.getLengthOfIsland()).length();
                System.out.printf("%0" + rowNumber + "d/%0" + colNumber + "d    %s\n", i + 1, j + 1, areas[i][j]);
            }
        }
        System.out.println("☘".repeat(100));
    }
}
