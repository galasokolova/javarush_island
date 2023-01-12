package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.predators.Bear;

public class BearFactory implements Creatable {

    @Override
    public Creature createOrganism() {
        return new Bear();
    }
}
