package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.herbivore.Deer;

public class DeerFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Deer();
    }
}
