package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.predators.Fox;

public class FoxFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Fox();
    }
}
