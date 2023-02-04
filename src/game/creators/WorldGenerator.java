package game.creators;

import game.entities.organisms.animals.Animal;
import game.entities.settings.Setting;
import game.entities.world.GameField;
import game.entities.world.Location;
import game.util.Randomizer;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class WorldGenerator {
    private final GameField gameField;

    public WorldGenerator(int y, int x) {
        this.gameField = new GameField(y, x);
        initializeLocation();
        generateLocations();
    }

    public GameField getGameField() {
        return gameField;
    }

    private void initializeLocation() {
        Location[][] locations = this.gameField.getLocations();
        for (int y = 0; y < locations[y].length; y++) {
            for (int x = 0; x < locations.length; x++) {
                locations[x][y] = new Location(y, x);
            }
        }
    }

    private void generateLocations() {
        Location[][] locations = this.gameField.getLocations();
        for (int y = 0; y < locations[y].length; y++) {
            for (int x = 0; x < locations.length; x++) {
                setNeighboringLocations(locations[x][y]);
                initializeAnimalSet(locations[x][y]);
                generationAnimals(locations[x][y]);
                generationPlants(locations[x][y]);
            }
        }
    }

    private void setNeighboringLocations(Location location) {
        int yMin = Math.max(location.getPositionY() - 1, 0);
        int yMax = Math.min(location.getPositionY() + 1, Setting.SIZE_OF_GAME_FIELD_Y - 1);
        int xMin = Math.max(location.getPositionX() - 1, 0);
        int xMax = Math.min(location.getPositionX() + 1, Setting.SIZE_OF_GAME_FIELD_X - 1);
        for (int y = yMin; y <= yMax; y++) {
            for (int x = xMin; x <= xMax; x++) {
                if (!(location.getPositionY() == y && location.getPositionX() == x)) {
                    location.getNeighboringLocations().add(gameField.getLocation(y, x));
                }
            }
        }
    }

    private void generationAnimals(Location location) {
        for (Class<?> classAnimal : Setting.ANIMAL_CLASSES) {
            if (isCreateEntityType()) {
                int numberOfAnimalType = Randomizer.getRandom(0, (int) Setting.BASIC_PARAMETERS_OF_ANIMALS.get(classAnimal)[1]);
                for (int i = 0; i < numberOfAnimalType; i++) {
                    Animal animal = (Animal) tryCreateAnimal(classAnimal);
                    location.getAnimals().get(classAnimal).add(animal);
                }
            }
        }
    }

    private void generationPlants(Location location) {
        if (isCreateEntityType()) {
            location.setPlant(Randomizer.getRandom(0, (int) Setting.MAX_AMOUNT_OF_PLANT_ON_ONE_CELL));
        }
    }

    private <T> T tryCreateAnimal(Class<T> tClass) {
        try {
            return tClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private void initializeAnimalSet(Location location) {
        for (Class classAnimal : Setting.ANIMAL_CLASSES) {
            Set<Animal> set = ConcurrentHashMap.newKeySet();
            location.getAnimals().put(classAnimal, set);
        }
    }

    private boolean isCreateEntityType() {
        return Randomizer.getRandom();
    }
}
