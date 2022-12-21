package game.factory;

import game.entities.Animal;
import game.entities.Wolf;

public class WolfFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Wolf();
    }
}
