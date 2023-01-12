package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.predators.Boa;

public class BoaFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Boa();
    }
}
