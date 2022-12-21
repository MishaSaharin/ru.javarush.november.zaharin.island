package game.factory;

import game.entities.Animal;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Factory {

    private static volatile Factory Factory;
    private final Map<String, AnimalFactory> factoriesMap;

    private Factory() {
        factoriesMap = new HashMap<>();
        factoriesMap.put("Bear", new BearFactory());
        factoriesMap.put("Boa", new BoaFactory());
        factoriesMap.put("Eagle", new EagleFactory());
        factoriesMap.put("Fox", new FoxFactory());
        factoriesMap.put("Wolf", new WolfFactory());
        factoriesMap.put("Boar", new BoarFactory());
        factoriesMap.put("Buffalo", new BuffaloFactory());
        factoriesMap.put("Caterpillar", new CaterpillarFactory());
        factoriesMap.put("Deer", new DeerFactory());
        factoriesMap.put("Duck", new DuckFactory());
        factoriesMap.put("Goat", new GoatFactory());
        factoriesMap.put("Horse", new HorseFactory());
        factoriesMap.put("Mouse", new MouseFactory());
        factoriesMap.put("Rabbit", new RabbitFactory());
        factoriesMap.put("Sheep", new SheepFactory());
        factoriesMap.put("Plant", new PlantFactory());
    }

    private static Map<String, AnimalFactory> getFactoriesMap() {
        Factory factory = Factory;
        if (Objects.isNull(factory)) {
            synchronized (Factory.class) {
                if (Objects.isNull(factory = Factory)) {
                    factory = Factory = new Factory();
                }
            }
        }

        return factory.factoriesMap;
    }

    public static Animal createOrganismByType(String organismType) {
        return getFactoriesMap().get(organismType).createAnimal();
    }
}
