package game.factory;

import game.entities.Animal;
import game.entities.Duck;

public class DuckFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Duck();
    }
}
