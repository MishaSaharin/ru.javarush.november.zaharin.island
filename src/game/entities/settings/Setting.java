package game.entities.settings;

import game.entities.organisms.animals.Animal;
import game.entities.organisms.animals.carnivorous.*;
import game.entities.organisms.animals.herbivores.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Setting {
    public static final double MAX_AMOUNT_OF_PLANT_ON_ONE_CELL = 200;
    public static final double GROWTH_OF_PLANT = 20;
    public static final int SIZE_OF_GAME_FIELD_Y = 5;
    public static final int SIZE_OF_GAME_FIELD_X = 10;
    public static final int STEP_DURATION = 500;
    public static final int NUMBER_OF_SIMULATION_STEPS = 30;

    private Setting() {
        throw new IllegalStateException("Configuration class");
    }

    public static final Map<Class<? extends Animal>, double[]> BASIC_PARAMETERS_OF_ANIMALS = new HashMap<>();

    static {
        BASIC_PARAMETERS_OF_ANIMALS.put(Bear.class, new double[]{500, 5, 2, 80});
        BASIC_PARAMETERS_OF_ANIMALS.put(Boa.class, new double[]{15, 30, 1, 3});
        BASIC_PARAMETERS_OF_ANIMALS.put(Boar.class, new double[]{400, 50, 2, 50});
        BASIC_PARAMETERS_OF_ANIMALS.put(Buffalo.class, new double[]{700, 10, 3, 100});
        BASIC_PARAMETERS_OF_ANIMALS.put(Deer.class, new double[]{300, 20, 4, 50});
        BASIC_PARAMETERS_OF_ANIMALS.put(Fox.class, new double[]{8, 30, 2, 2});
        BASIC_PARAMETERS_OF_ANIMALS.put(Goat.class, new double[]{60, 140, 3, 10});
        BASIC_PARAMETERS_OF_ANIMALS.put(Horse.class, new double[]{400, 20, 4, 60});
        BASIC_PARAMETERS_OF_ANIMALS.put(Mouse.class, new double[]{0.05, 500, 1, 0.01});
        BASIC_PARAMETERS_OF_ANIMALS.put(Rabbit.class, new double[]{2, 150, 2, 0.45});
        BASIC_PARAMETERS_OF_ANIMALS.put(Sheep.class, new double[]{70, 140, 3, 15});
        BASIC_PARAMETERS_OF_ANIMALS.put(Wolf.class, new double[]{50, 30, 3, 8});
        BASIC_PARAMETERS_OF_ANIMALS.put(Duck.class, new double[]{1, 200, 4, 0.15});
        BASIC_PARAMETERS_OF_ANIMALS.put(Eagle.class, new double[]{6, 20, 3, 1});
        BASIC_PARAMETERS_OF_ANIMALS.put(Caterpillar.class, new double[]{0.01, 1000, 0, 0.001});
    }

    public static final Set<Class<? extends Animal>> ANIMAL_CLASSES = Set.of(Bear.class, Boa.class, Boar.class, Buffalo.class, Deer.class,
            Fox.class, Goat.class, Horse.class, Mouse.class, Rabbit.class, Sheep.class, Wolf.class, Caterpillar.class,
            Duck.class, Eagle.class);

    public static final Map<Class<? extends Animal>, Map<Class<? extends Animal>, Integer>> CHANCE_TO_EAT = new HashMap<>();

    private static final Map<Class<? extends Animal>, Integer> WOLF_CHANCE_TO_EAT = new HashMap<>();
    private static final Map<Class<? extends Animal>, Integer> BOA_CHANCE_TO_EAT = new HashMap<>();
    private static final Map<Class<? extends Animal>, Integer> FOX_CHANCE_TO_EAT = new HashMap<>();
    private static final Map<Class<? extends Animal>, Integer> BEAR_CHANCE_TO_EAT = new HashMap<>();
    private static final Map<Class<? extends Animal>, Integer> EAGLE_CHANCE_TO_EAT = new HashMap<>();
    private static final Map<Class<? extends Animal>, Integer> MOUSE_CHANCE_TO_EAT = new HashMap<>();
    private static final Map<Class<? extends Animal>, Integer> BOAR_CHANCE_TO_EAT = new HashMap<>();
    private static final Map<Class<? extends Animal>, Integer> DUCK_CHANCE_TO_EAT = new HashMap<>();

    static {
        WOLF_CHANCE_TO_EAT.put(Horse.class, 10);
        WOLF_CHANCE_TO_EAT.put(Deer.class, 15);
        WOLF_CHANCE_TO_EAT.put(Rabbit.class, 60);
        WOLF_CHANCE_TO_EAT.put(Mouse.class, 80);
        WOLF_CHANCE_TO_EAT.put(Goat.class, 60);
        WOLF_CHANCE_TO_EAT.put(Sheep.class, 70);
        WOLF_CHANCE_TO_EAT.put(Boar.class, 15);
        WOLF_CHANCE_TO_EAT.put(Buffalo.class, 10);
        WOLF_CHANCE_TO_EAT.put(Duck.class, 40);
        BOA_CHANCE_TO_EAT.put(Fox.class, 15);
        BOA_CHANCE_TO_EAT.put(Rabbit.class, 20);
        BOA_CHANCE_TO_EAT.put(Mouse.class, 40);
        BOA_CHANCE_TO_EAT.put(Duck.class, 10);
        FOX_CHANCE_TO_EAT.put(Rabbit.class, 70);
        FOX_CHANCE_TO_EAT.put(Mouse.class, 90);
        FOX_CHANCE_TO_EAT.put(Duck.class, 60);
        FOX_CHANCE_TO_EAT.put(Caterpillar.class, 40);
        BEAR_CHANCE_TO_EAT.put(Boa.class, 80);
        BEAR_CHANCE_TO_EAT.put(Horse.class, 40);
        BEAR_CHANCE_TO_EAT.put(Deer.class, 80);
        BEAR_CHANCE_TO_EAT.put(Rabbit.class, 80);
        BEAR_CHANCE_TO_EAT.put(Mouse.class, 90);
        BEAR_CHANCE_TO_EAT.put(Goat.class, 70);
        BEAR_CHANCE_TO_EAT.put(Sheep.class, 70);
        BEAR_CHANCE_TO_EAT.put(Boar.class, 50);
        BEAR_CHANCE_TO_EAT.put(Buffalo.class, 20);
        BEAR_CHANCE_TO_EAT.put(Duck.class, 10);
        EAGLE_CHANCE_TO_EAT.put(Fox.class, 10);
        EAGLE_CHANCE_TO_EAT.put(Rabbit.class, 90);
        EAGLE_CHANCE_TO_EAT.put(Mouse.class, 90);
        EAGLE_CHANCE_TO_EAT.put(Duck.class, 80);
        MOUSE_CHANCE_TO_EAT.put(Caterpillar.class, 90);
        BOAR_CHANCE_TO_EAT.put(Mouse.class, 50);
        BOAR_CHANCE_TO_EAT.put(Caterpillar.class, 90);
        DUCK_CHANCE_TO_EAT.put(Caterpillar.class, 90);
        CHANCE_TO_EAT.put(Wolf.class, WOLF_CHANCE_TO_EAT);
        CHANCE_TO_EAT.put(Boa.class, BOA_CHANCE_TO_EAT);
        CHANCE_TO_EAT.put(Fox.class, FOX_CHANCE_TO_EAT);
        CHANCE_TO_EAT.put(Bear.class, BEAR_CHANCE_TO_EAT);
        CHANCE_TO_EAT.put(Eagle.class, EAGLE_CHANCE_TO_EAT);
        CHANCE_TO_EAT.put(Mouse.class, MOUSE_CHANCE_TO_EAT);
        CHANCE_TO_EAT.put(Boar.class, BOAR_CHANCE_TO_EAT);
        CHANCE_TO_EAT.put(Duck.class, DUCK_CHANCE_TO_EAT);
    }
}
