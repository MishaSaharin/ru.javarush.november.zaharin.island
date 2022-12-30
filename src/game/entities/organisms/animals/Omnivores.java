package game.entities.organisms.animals;

import game.entities.settings.Setting;
import game.entities.world.Location;
import game.util.Randomizer;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public interface Omnivores {
    default void eat(Location location) {
        location.getLock().lock();
        Animal omnivores = (Animal) this;
        boolean isAte = false;
        double startingWeightOmnivores = omnivores.weight;
        double maxWeightOmnivores = Setting.BASIC_PARAMETERS_OF_ANIMALS.get(omnivores.aClass)[0];
        double satiation = Setting.BASIC_PARAMETERS_OF_ANIMALS.get(omnivores.aClass)[3];
        double differentWeight = maxWeightOmnivores - startingWeightOmnivores;
        try {
            Map<Class<? extends Animal>, Integer> victimsMap = Setting.CHANCE_TO_EAT.get(omnivores.aClass);
            if (differentWeight > 0) {
                Iterator<Map.Entry<Class<? extends Animal>, Integer>> victimsMapIterator = victimsMap.entrySet().iterator();
                while (!isAte && victimsMapIterator.hasNext()) {
                    Map.Entry<Class<? extends Animal>, Integer> probabilityPair = victimsMapIterator.next();
                    Class<?> classVictim = probabilityPair.getKey();
                    Integer probability = probabilityPair.getValue();
                    Set<Animal> victims = location.getAnimals().get(classVictim);
                    Iterator<Animal> victimsIterator = victims.iterator();
                    if (Randomizer.getRandom(probability) && !victims.isEmpty() && victimsIterator.hasNext()) {
                        Animal victim = victimsIterator.next();
                        omnivores.weight = Math.min(omnivores.weight + victim.getCurrentWeight(), maxWeightOmnivores);
                        if (omnivores.weight >= startingWeightOmnivores + satiation || omnivores.weight == maxWeightOmnivores) {
                            isAte = true;
                        }
                        victimsIterator.remove();
                    }
                }
            }
            satiation = omnivores.weight - startingWeightOmnivores;
            if (location.getPlant() > satiation) {
                location.setPlant(Math.max(location.getPlant() - satiation, 0));
                omnivores.weight = Math.min(omnivores.getCurrentWeight() + satiation, Setting.BASIC_PARAMETERS_OF_ANIMALS.get(omnivores.aClass)[0]);
            } else {
                omnivores.weight = omnivores.weight + location.getPlant();
                location.setPlant(0);
            }
        } finally {
            location.getLock().unlock();
        }
    }
}
