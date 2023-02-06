package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.animals.herbivores.Horse;

public class HorseFactory implements OrganismFactory {
    @Override
    public Organism createOrganism() {
        return new Horse();
    }
}
