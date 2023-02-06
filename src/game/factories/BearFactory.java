package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.predators.Bear;

public class BearFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Bear();
    }
}
