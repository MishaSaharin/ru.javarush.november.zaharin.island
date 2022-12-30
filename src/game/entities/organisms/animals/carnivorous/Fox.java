package game.entities.organisms.animals.carnivorous;

import game.entities.organisms.animals.Animal;
import game.entities.organisms.animals.Carnivorous;
import game.entities.settings.Setting;
import game.util.Randomizer;

public class Fox extends Animal implements Carnivorous {

    public Fox() {
        this.aClass = Fox.class;
        this.weight = Randomizer.getRandom(Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Fox.class)[0] / 2, Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Fox.class)[0]);
    }
}
