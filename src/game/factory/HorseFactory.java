package game.factory;

import game.entities.Animal;
import game.entities.Horse;

public class HorseFactory implements AnimalFactory {
    @Override
    public Animal createAnimal()  {
        return new Horse();
    }
}
