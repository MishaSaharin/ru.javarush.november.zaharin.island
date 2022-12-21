package game.entities.setting;

import game.entities.*;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    private final Map<Class<? extends Animal>, Map<Class<? extends Animal>, Integer>> chanceToEatAnimal = new HashMap<>();

    {
        Map<Class<? extends Animal>, Integer> wolfChanceToEat = new HashMap<>();
        wolfChanceToEat.put(Horse.class, 10);
        wolfChanceToEat.put(Deer.class, 10);
        wolfChanceToEat.put(Rabbit.class, 10);
        wolfChanceToEat.put(Mouse.class, 10);
        wolfChanceToEat.put(Goat.class, 10);
        wolfChanceToEat.put(Sheep.class, 10);
        wolfChanceToEat.put(Boar.class, 10);
        wolfChanceToEat.put(Buffalo.class, 10);
        wolfChanceToEat.put(Duck.class, 10);
        chanceToEatAnimal.put(Wolf.class, wolfChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> boaChanceToEat = new HashMap<>();
        boaChanceToEat.put(Fox.class, 15);
        boaChanceToEat.put(Rabbit.class, 20);
        boaChanceToEat.put(Mouse.class, 40);
        boaChanceToEat.put(Duck.class, 10);
        chanceToEatAnimal.put(Boa.class, boaChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> foxChanceToEat = new HashMap<>();
        foxChanceToEat.put(Rabbit.class, 70);
        foxChanceToEat.put(Mouse.class, 90);
        foxChanceToEat.put(Duck.class, 60);
        foxChanceToEat.put(Caterpillar.class, 40);
        chanceToEatAnimal.put(Fox.class, foxChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> bearChanceToEat = new HashMap<>();
        bearChanceToEat.put(Boa.class, 80);
        bearChanceToEat.put(Horse.class, 40);
        bearChanceToEat.put(Deer.class, 80);
        bearChanceToEat.put(Rabbit.class, 80);
        bearChanceToEat.put(Mouse.class, 90);
        bearChanceToEat.put(Goat.class, 70);
        bearChanceToEat.put(Sheep.class, 70);
        bearChanceToEat.put(Boar.class, 50);
        bearChanceToEat.put(Buffalo.class, 20);
        bearChanceToEat.put(Duck.class, 10);
        chanceToEatAnimal.put(Bear.class, bearChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> eagleChanceToEat = new HashMap<>();
        eagleChanceToEat.put(Fox.class, 10);
        eagleChanceToEat.put(Rabbit.class, 90);
        eagleChanceToEat.put(Mouse.class, 90);
        eagleChanceToEat.put(Duck.class, 80);
        chanceToEatAnimal.put(Eagle.class, eagleChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> horseChanceToEat = new HashMap<>();
        horseChanceToEat.put(Plant.class, 100);
        chanceToEatAnimal.put(Horse.class, horseChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> deepChanceToEat = new HashMap<>();
        deepChanceToEat.put(Plant.class, 100);
        chanceToEatAnimal.put(Deer.class, deepChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> rabbitChanceToEat = new HashMap<>();
        rabbitChanceToEat.put(Plant.class, 100);
        chanceToEatAnimal.put(Rabbit.class, rabbitChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> mouseChanceToEat = new HashMap<>();
        mouseChanceToEat.put(Caterpillar.class, 90);
        mouseChanceToEat.put(Plant.class, 100);
        chanceToEatAnimal.put(Mouse.class, mouseChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> goatChanceToEat = new HashMap<>();
        goatChanceToEat.put(Plant.class, 100);
        chanceToEatAnimal.put(Goat.class, goatChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> sheepChanceToEat = new HashMap<>();
        sheepChanceToEat.put(Plant.class, 100);
        chanceToEatAnimal.put(Sheep.class, sheepChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> boarChanceToEat = new HashMap<>();
        boarChanceToEat.put(Mouse.class, 50);
        boarChanceToEat.put(Caterpillar.class, 90);
        boarChanceToEat.put(Plant.class, 100);
        chanceToEatAnimal.put(Boar.class, boarChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> buffaloChanceToEat = new HashMap<>();
        buffaloChanceToEat.put(Plant.class, 100);
        chanceToEatAnimal.put(Buffalo.class, buffaloChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> duckChanceToEat = new HashMap<>();
        duckChanceToEat.put(Caterpillar.class, 90);
        duckChanceToEat.put(Plant.class, 100);
        chanceToEatAnimal.put(Duck.class, duckChanceToEat);
    }

    {
        Map<Class<? extends Animal>, Integer> caterpillarChanceToEat = new HashMap<>();
        caterpillarChanceToEat.put(Plant.class, 100);
        chanceToEatAnimal.put(Caterpillar.class, caterpillarChanceToEat);
    }

    public int getChanceToEatAnimal(Animal attack, Animal victim) {
        return chanceToEatAnimal.get(attack).get(victim);
    }

//    public static final Map<Class<?>, double[]> CONFIGURATIONS_ANIMALS = new HashMap<>();
//
//    static {
//        CONFIGURATIONS_ANIMALS.put(Bear.class, new double[]{500, 5, 2, 80});
//        CONFIGURATIONS_ANIMALS.put(Boa.class, new double[]{15, 30, 1, 3});
//        CONFIGURATIONS_ANIMALS.put(Boar.class, new double[]{400, 50, 2, 50});
//        CONFIGURATIONS_ANIMALS.put(Buffalo.class, new double[]{700, 10, 3, 100});
//        CONFIGURATIONS_ANIMALS.put(Deer.class, new double[]{300, 20, 4, 50});
//        CONFIGURATIONS_ANIMALS.put(Fox.class, new double[]{8, 30, 2, 2});
//        CONFIGURATIONS_ANIMALS.put(Goat.class, new double[]{60, 140, 3, 10});
//        CONFIGURATIONS_ANIMALS.put(Horse.class, new double[]{400, 20, 4, 60});
//        CONFIGURATIONS_ANIMALS.put(Mouse.class, new double[]{0.05, 500, 1, 0.01});
//        CONFIGURATIONS_ANIMALS.put(Rabbit.class, new double[]{2, 150, 2, 0.45});
//        CONFIGURATIONS_ANIMALS.put(Sheep.class, new double[]{70, 140, 3, 15});
//        CONFIGURATIONS_ANIMALS.put(Wolf.class, new double[]{50, 30, 3, 8});
//        CONFIGURATIONS_ANIMALS.put(Duck.class, new double[]{1, 200, 4, 0.15});
//        CONFIGURATIONS_ANIMALS.put(Eagle.class, new double[]{6, 20, 3, 1});
//        CONFIGURATIONS_ANIMALS.put(Caterpillar.class, new double[]{0.01, 1000, 0, 0.001});
//    }
}
