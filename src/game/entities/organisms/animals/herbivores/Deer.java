package game.entities.organisms.animals.herbivores;

import game.entities.organisms.animals.Animal;
import game.entities.organisms.animals.Herbivorous;
import game.entities.settings.Setting;
import game.util.Randomizer;

public class Deer extends Animal implements Herbivorous {

    public Deer() {
        this.aClass = Deer.class;
        this.weight = Randomizer.getRandom(Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Deer.class)[0] / 2, Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Deer.class)[0]);
    }
}
