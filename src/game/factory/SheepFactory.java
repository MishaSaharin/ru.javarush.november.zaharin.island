package game.factory;

import game.entities.Animal;
import game.entities.Sheep;

public class SheepFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Sheep();
    }
}
