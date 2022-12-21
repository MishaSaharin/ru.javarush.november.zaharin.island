package game.factory;

import game.entities.Animal;
import game.entities.Caterpillar;

public class CaterpillarFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Caterpillar();
    }
}
