package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.herbivores.Sheep;

public class SheepFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Sheep();
    }
}
