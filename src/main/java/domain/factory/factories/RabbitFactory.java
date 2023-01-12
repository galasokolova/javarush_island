package domain.factory.factories;

import domain.creatures.Creature;
import domain.creatures.herbivore.Rabbit;

public class RabbitFactory implements Creatable {
    @Override
    public Creature createOrganism() {
        return new Rabbit();
    }
}
