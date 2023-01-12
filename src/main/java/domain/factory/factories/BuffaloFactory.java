package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.herbivore.Buffalo;

public class BuffaloFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Buffalo();
    }
}
