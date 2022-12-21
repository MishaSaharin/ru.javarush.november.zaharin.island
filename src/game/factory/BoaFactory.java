package game.factory;

import game.entities.Animal;
import game.entities.Boa;

public class BoaFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Boa();
    }
}
