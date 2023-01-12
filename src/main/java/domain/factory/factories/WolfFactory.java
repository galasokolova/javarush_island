package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.predators.Wolf;

public class WolfFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Wolf();
    }
}
