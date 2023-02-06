package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.predators.Fox;

public class FoxFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Fox();
    }
}
