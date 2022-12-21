package game.factory;

import game.entities.Animal;
import game.entities.Mouse;

public class MouseFactory implements AnimalFactory {
    @Override
    public Animal createAnimal()  {
        return new Mouse();
    }
}
