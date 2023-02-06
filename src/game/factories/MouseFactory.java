package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.herbivores.Mouse;

public class MouseFactory implements OrganismFactory {
    @Override
    public Organism createOrganism() {
        return new Mouse();
    }
}
