package game.factory;

import game.entities.Animal;
import game.entities.Plant;

public class PlantFactory implements AnimalFactory{
    @Override
    public Animal createAnimal()  {
        return new Plant();
    }
}
