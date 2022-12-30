package game.entities.organisms.animals.herbivores;

import game.entities.organisms.animals.Animal;
import game.entities.organisms.animals.Herbivorous;
import game.entities.settings.Setting;
import game.util.Randomizer;

public class Goat extends Animal implements Herbivorous {

    public Goat() {
        this.aClass = Goat.class;
        this.weight = Randomizer.getRandom(Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Goat.class)[0] / 2, Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Goat.class)[0]);
    }
}
