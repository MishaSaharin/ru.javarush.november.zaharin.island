package game.entities.organisms.animals;

import game.entities.settings.Setting;
import game.entities.world.Location;

public interface Herbivorous {
    default void eat(Location location) {
        location.getLock().lock();
        Animal herbivorous = (Animal) this;
        double satiation = Setting.BASIC_PARAMETERS_OF_ANIMALS.get(herbivorous.aClass)[3];
        try {
            if (location.getPlant() > satiation) {
                location.setPlant(Math.max(location.getPlant() - satiation, 0));
                herbivorous.weight = Math.min(herbivorous.getCurrentWeight() + satiation, Setting.BASIC_PARAMETERS_OF_ANIMALS.get(herbivorous.aClass)[0]);
            } else {
                herbivorous.weight = herbivorous.weight + location.getPlant();
                location.setPlant(0);
            }
        } finally {
            location.getLock().unlock();
        }
    }
}
