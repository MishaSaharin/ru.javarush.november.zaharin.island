package game.factory;

import game.entities.Animal;
import game.entities.Eagle;

public class EagleFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Eagle();
    }
}
