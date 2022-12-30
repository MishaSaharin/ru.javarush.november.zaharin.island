package game.entities.organisms.animals.herbivores;

import game.entities.organisms.animals.Animal;
import game.entities.organisms.animals.Omnivores;
import game.entities.settings.Setting;
import game.util.Randomizer;

public class Boar extends Animal implements Omnivores {
    public Boar() {
        this.aClass = Boar.class;
        this.weight = Randomizer.getRandom(Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Boar.class)[0] / 2, Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Boar.class)[0]);
    }
}
