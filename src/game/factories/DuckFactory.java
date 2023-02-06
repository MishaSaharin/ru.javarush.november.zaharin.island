package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.herbivores.Duck;

public class DuckFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Duck();
    }
}
