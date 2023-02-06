package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.herbivores.Rabbit;

public class RabbitFactory implements OrganismFactory
{
    @Override
    public Organism createOrganism() {
        return new Rabbit();
    }
}
