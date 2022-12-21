package game.factory;

import game.entities.Animal;
import game.entities.Bear;

public class BearFactory implements AnimalFactory {

    public Animal createAnimal() {
        return new Bear();
    }
}
