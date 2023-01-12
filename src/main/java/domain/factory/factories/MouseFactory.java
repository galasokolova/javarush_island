package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.herbivore.Mouse;

public class MouseFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Mouse();
    }
}
