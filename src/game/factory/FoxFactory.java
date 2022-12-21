package game.factory;

import game.entities.Animal;
import game.entities.Fox;

public class FoxFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Fox();
    }
}
