package game.entities.organisms.animals.herbivores;

import game.entities.organisms.animals.Animal;
import game.entities.organisms.animals.Herbivorous;
import game.entities.settings.Setting;
import game.entities.world.Location;
import game.util.Randomizer;

public class Caterpillar extends Animal implements Herbivorous {
    public Caterpillar() {
        this.aClass = Caterpillar.class;
        this.weight = Randomizer.getRandom(Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Caterpillar.class)[0] / 2, Setting.BASIC_PARAMETERS_OF_ANIMALS.get(Caterpillar.class)[0]);
    }

    @Override
    public void move(Location location) {

    }
}
