package game.entities.organisms.animals.herbivores;

import game.entities.organisms.animals.Animal;
import game.entities.organisms.animals.Herbivorous;
import game.entities.settings.Setting;
import game.util.Randomizer;

public class Sheep extends Animal implements Herbivorous {
    public Sheep() {
        super();
        this.aClass = Sheep.class;
        this.weight = Randomizer.getRandom(Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Sheep.class)[0] / 2, Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Sheep.class)[0]);
    }
}
