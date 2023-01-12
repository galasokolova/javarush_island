package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.herbivore.Sheep;

public class SheepFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Sheep();
    }
}
