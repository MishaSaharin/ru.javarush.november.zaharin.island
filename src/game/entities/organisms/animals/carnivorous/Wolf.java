package game.entities.organisms.animals.carnivorous;

import game.entities.organisms.animals.Animal;
import game.entities.organisms.animals.Carnivorous;
import game.entities.settings.Setting;
import game.util.Randomizer;

public class Wolf extends Animal implements Carnivorous {
    public Wolf() {
        this.aClass = Wolf.class;
        this.weight = Randomizer.getRandom(Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Wolf.class)[0] / 2, Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Wolf.class)[0]);
    }
}