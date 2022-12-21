package game.factory;

import game.entities.Animal;
import game.entities.Goat;

public class GoatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Goat();
    }
}
