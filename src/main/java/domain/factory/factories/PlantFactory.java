package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.plants.Plant;

public class PlantFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Plant();
    }
}
