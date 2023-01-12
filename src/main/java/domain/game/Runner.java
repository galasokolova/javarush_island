package domain.game;

import domain.location.World;
import domain.location.WorldCreator;

public class Runner {
    public static void main(String[] args) {
        WorldCreator worldCreator = new WorldCreator();
        World world = worldCreator.createWorld();
        Game game = new Game(world);
        GamePeriods gamePeriods = new GamePeriods(game);
        gamePeriods.start();

    }
}

