package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.predators.Wolf;

public class WolfFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Wolf();
    }
}
