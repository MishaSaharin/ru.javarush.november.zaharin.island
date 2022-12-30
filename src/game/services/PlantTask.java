package game.services;

import game.entities.world.Location;

public class PlantTask implements Runnable {
    private final Location location;
    public PlantTask(Location location) {
        this.location = location;
    }

    public void growUp() {
        location.plantGrowth();
    }

    @Override
    public void run() {
        location.getLock().lock();
        try {
            growUp();
        } finally {
            location.getLock().unlock();
        }
    }
}
