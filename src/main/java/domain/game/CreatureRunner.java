package domain.game;

import domain.creatures.Creature;
import domain.location.Location;
import domain.location.World;

import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CreatureRunner implements Runnable {
    private final String organismType;
    private final World world;
    private final Queue<Task> tasks = new ConcurrentLinkedQueue<>();

    public CreatureRunner(String organismType, World world) {
        this.organismType = organismType;
        this.world = world;
    }

    @Override
    public void run() {
        Location[][] cells = world.getLocation();
        for (Location[] width : cells) {
            for (Location location : width) {
                createTasksForArea(location);
            }
        }
    }


    private void createTasksForArea(Location location) {
        Set<Creature> creatureSet = location.getInhabitants().get(organismType);
        if (creatureSet != null) {
            location.getLock().lock();
            try {
                for (Creature creature : creatureSet) {
                    tasks.add(new Task(creature, location));
                }
            } finally {
                location.getLock().unlock();
            }
        }

        tasks.forEach(Task::perform);
        tasks.clear();
    }
}
