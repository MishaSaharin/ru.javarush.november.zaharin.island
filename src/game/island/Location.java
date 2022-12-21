package game.island;

import game.entities.Carnivore;
import game.entities.Herbivore;
import game.entities.Plant;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Location {
    public List<Carnivore> carnivores = new ArrayList<>();
    public List<Herbivore> herbivores = new ArrayList<>();
    public List<Plant> plants = new ArrayList<>();
    private int coordinateX;
    private int coordinateY;
    private List<Location> locationsNear;
    private final Lock lock = new ReentrantLock(true);

}
