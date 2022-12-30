package game.entities.organisms.animals.carnivorous;

import game.entities.organisms.animals.Animal;
import game.entities.organisms.animals.Omnivores;
import game.entities.settings.Setting;
import game.util.Randomizer;

public class Eagle extends Animal implements Omnivores {

    public Eagle() {
        this.aClass = Eagle.class;
        this.weight = Randomizer.getRandom(Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Eagle.class)[0] / 2, Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Eagle.class)[0]);
    }
}
