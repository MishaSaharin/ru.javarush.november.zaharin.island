package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.herbivores.Deer;

public class DeerFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Deer();
    }
}
