package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.herbivores.Goat;

public class GoatFactory implements OrganismFactory {
    @Override
    public Organism createOrganism() {
        return new Goat();
    }
}
