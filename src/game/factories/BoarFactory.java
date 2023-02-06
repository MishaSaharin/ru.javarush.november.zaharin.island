package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.herbivores.Boar;

public class BoarFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Boar();
    }
}
