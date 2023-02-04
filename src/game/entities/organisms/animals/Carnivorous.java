package game.entities.organisms.animals;

import game.entities.settings.Setting;
import game.entities.world.Location;
import game.util.Randomizer;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public interface Carnivorous {
    default void eat(Location location) {
        location.getLock().lock();
        Animal carnivorous = (Animal) this;
        boolean isAte = false;
        double startingWeightCarnivorous = carnivorous.weight;
        double maxWeightCarnivorous = Setting.BASIC_PARAMETERS_OF_ANIMALS.get(carnivorous.aClass)[0];
        double satiation = Setting.BASIC_PARAMETERS_OF_ANIMALS.get(carnivorous.aClass)[3];
        double differentWeight = maxWeightCarnivorous - startingWeightCarnivorous;
        try {
            Map<Class<?extends Animal>, Integer> victimsMap = Setting.CHANCE_TO_EAT.get(carnivorous.aClass);
            if (differentWeight > 0) {
                Iterator<Map.Entry<Class<?extends Animal>, Integer>> victimsMapIterator = victimsMap.entrySet().iterator();
                while (!isAte && victimsMapIterator.hasNext()) {
                    Map.Entry<Class<?extends Animal>, Integer> probabilityPair = victimsMapIterator.next();
                    Class<?> classVictim = probabilityPair.getKey();
                    Integer probability = probabilityPair.getValue();
                    Set<Animal> victims = location.getAnimals().get(classVictim);
                    Iterator<Animal> victimsIterator = victims.iterator();
                    if (Randomizer.getRandom(probability) && !victims.isEmpty() && victimsIterator.hasNext()) {
                        Animal victim = victimsIterator.next();
                        carnivorous.weight = Math.min(carnivorous.weight + victim.getCurrentWeight(), maxWeightCarnivorous);
                        if (carnivorous.weight >= startingWeightCarnivorous + satiation || carnivorous.weight == maxWeightCarnivorous) {
                            isAte = true;
                        }
                        victimsIterator.remove();
                    }
                }
            }
        } finally {
            location.getLock().unlock();
        }
    }
}
