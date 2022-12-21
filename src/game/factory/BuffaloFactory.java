package game.factory;

import game.entities.Animal;
import game.entities.Buffalo;

public class BuffaloFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Buffalo();
    }
}
