package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.herbivore.Goat;

public class GoatFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Goat();
    }
}
