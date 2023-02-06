package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.herbivores.Caterpillar;

public class CaterpillarFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Caterpillar();
    }
}
