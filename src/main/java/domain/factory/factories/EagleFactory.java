package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.predators.Eagle;

public class EagleFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Eagle();
    }
}
