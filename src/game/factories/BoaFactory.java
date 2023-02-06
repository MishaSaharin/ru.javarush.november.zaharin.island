package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.predators.Boa;

public class BoaFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Boa();
    }
}
