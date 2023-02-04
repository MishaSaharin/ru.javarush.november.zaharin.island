package game.entities.organisms.animals.herbivores;

import game.entities.organisms.animals.Animal;
import game.entities.organisms.animals.Herbivorous;
import game.entities.settings.Setting;
import game.util.Randomizer;

public class Buffalo extends Animal implements Herbivorous {

    public Buffalo() {
        this.aClass = Buffalo.class;
        this.weight = Randomizer.getRandom(Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Buffalo.class)[0] / 2, Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Buffalo.class)[0]);
    }
}
