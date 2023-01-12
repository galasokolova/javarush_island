package domain.game;

import domain.creatures.Animal;
import domain.creatures.Creature;
import domain.location.Location;

public class Task {
    private final Creature creature;
    private final Location location;

    public Task(Creature creature, Location location) {
        this.creature = creature;
        this.location = location;
    }

    public void perform() {
        if (creature instanceof Animal animal) {
            if (animal.eat(location)) {
                animal.growUp(location);
                animal.multiply(location);
            }
            animal.move(location);
        }

        else {
            creature.growUp(location);
            creature.multiply(location);
        }
        creature.starve(location);
    }
}
