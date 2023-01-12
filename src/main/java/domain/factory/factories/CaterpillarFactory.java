package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.herbivore.Caterpillar;

public class CaterpillarFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Caterpillar();
    }
}
