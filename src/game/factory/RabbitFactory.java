package game.factory;

import game.entities.Animal;
import game.entities.Rabbit;

public class RabbitFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Rabbit();
    }
}
