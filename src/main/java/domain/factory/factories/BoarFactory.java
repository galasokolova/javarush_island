package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.herbivore.Boar;

public class BoarFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Boar();
    }
}
