package game.entities.organisms.animals.herbivores;

import game.entities.organisms.animals.Animal;
import game.entities.organisms.animals.Omnivores;
import game.entities.settings.Setting;
import game.util.Randomizer;

public class Mouse extends Animal implements Omnivores {

    public Mouse() {
        this.aClass = Mouse.class;
        this.weight = Randomizer.getRandom(Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Mouse.class)[0] / 2, Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Mouse.class)[0]);
    }
}
