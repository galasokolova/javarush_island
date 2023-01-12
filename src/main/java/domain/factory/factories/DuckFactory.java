package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.herbivore.Duck;

public class DuckFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Duck();
    }
}
