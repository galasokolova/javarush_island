package domain.location;

public class WorldCreator {
    public World createWorld() {
        Island island = new Island();
        return island.createIsland();
    }
}
