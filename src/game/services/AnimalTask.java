package game.services;

import game.entities.organisms.animals.Animal;
import game.entities.organisms.animals.Carnivorous;
import game.entities.organisms.animals.Herbivorous;
import game.entities.organisms.animals.Omnivores;
import game.entities.world.Location;

public class AnimalTask implements Runnable{
    private final Animal animal;
    private final Location location;

    public AnimalTask(Animal animal, Location location) {
        this.animal = animal;
        this.location = location;
    }

    @Override
    public void run() {
        animal.getLock().lock();
        try {
            if(animal instanceof Carnivorous carnivorous) {
                carnivorous.eat(location);
            }
            if (animal instanceof Herbivorous herbivorous) {
                herbivorous.eat(location);
            }
            if (animal instanceof Omnivores omnivores) {
                omnivores.eat(location);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        animal.reproduction(location);
        animal.weightLoss(location);
        animal.timeToDie(location);
        try {
            animal.move(location);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            animal.getLock().unlock();
        }
    }
}
