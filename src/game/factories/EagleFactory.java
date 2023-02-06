package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.predators.Eagle;

public class EagleFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Eagle();
    }
}
