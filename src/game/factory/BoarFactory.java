package game.factory;

import game.entities.Animal;
import game.entities.Boar;

public class BoarFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Boar();
    }
}
