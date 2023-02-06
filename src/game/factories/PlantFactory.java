package game.factories;

import game.entities.organisms.Organism;
import game.entities.organisms.plants.Plant;

public class PlantFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Plant();
    }
}
