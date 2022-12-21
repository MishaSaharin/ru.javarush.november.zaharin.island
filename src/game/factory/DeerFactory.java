package game.factory;

import game.entities.Animal;
import game.entities.Deer;

public class DeerFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Deer();
    }
}
