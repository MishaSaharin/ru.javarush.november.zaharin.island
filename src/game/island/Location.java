package game.island;

import game.entities.Carnivore;
import game.entities.Herbivore;
import game.entities.Plant;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Location {
    public List<Carnivore> carnivores;
    public List<Herbivore> herbivores;
    public List<Plant> plants;
    private int coordinateX;
    private int coordinateY;
    private List<Location> locationsNear;
    private final Lock lock = new ReentrantLock(true);

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public Lock getLock() {
        return lock;
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public List<Location> getLocationsNear() {
        return locationsNear;
    }
}
