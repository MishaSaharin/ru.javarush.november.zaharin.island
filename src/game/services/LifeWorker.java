package game.services;

import game.creators.WorldGenerator;
import game.entities.settings.Setting;
import game.entities.world.Location;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class LifeWorker {

    private final WorldGenerator world;
    private final int stepDuration = Setting.STEP_DURATION;
    private final int numberOfSimulationSteps = Setting.NUMBER_OF_SIMULATION_STEPS;
    private final AtomicInteger simulationStepNumber = new AtomicInteger(0);
    private final ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

    public LifeWorker(WorldGenerator worldGenerator) {
        this.world = worldGenerator;
    }

    private void startingTheSimulation() {
        Location[][] locations = world.getGameField().getLocations();
        simulationStepNumber.incrementAndGet();
        world.getGameField().print();
        for (int y = 0; y < locations[y].length; y++) {
            for (int x = 0; x < locations.length; x++) {
                locations[x][y].start();
            }
        }
    }

    private final Runnable lifeTask = new Runnable() {
        @Override
        public void run() {
            Location[][] locations = world.getGameField().getLocations();
            startingTheSimulation();
            if (simulationStepNumber.get() >= numberOfSimulationSteps) {
                service.shutdown();
                for (int y = 0; y < locations[y].length; y++) {
                    for (int x = 0; x < locations.length; x++) {
                        locations[x][y].shutdown();
                    }
                }
                for (int y = 0; y < locations[y].length; y++) {
                    for (int x = 0; x < locations.length; x++) {
                        try {
                            locations[x][y].await(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                world.getGameField().print();
            }
        }
    };

    public void start() {
        service.scheduleAtFixedRate(lifeTask, 1, stepDuration, TimeUnit.MILLISECONDS);
    }
}
