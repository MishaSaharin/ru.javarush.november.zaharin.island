package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.herbivores.Buffalo;

public class BuffaloFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Buffalo();
    }
}
