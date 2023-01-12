package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.herbivore.Horse;

public class HorseFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Horse();
    }
}
