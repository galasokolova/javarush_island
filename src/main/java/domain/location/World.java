package domain.location;

public class World {
    private final Location[][] cells;

    public World(Coordinates coordinates) {
        cells = new Location[coordinates.getX()][coordinates.getY()];
    }

    public Location[][] getLocation() {
        return cells;
    }
}
