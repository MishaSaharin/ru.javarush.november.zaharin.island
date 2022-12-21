package game.entities.setting;

import game.entities.*;

public class GeneralBasicParameters {
    private Class<? extends Animal> aClass;
    private double maxWeight;
    private int maxQuantity;
    private int maxSpeed;
    private double maxFoodRequired;

    public final static GeneralBasicParameters WOLF_BASIC_PARAMETER = new GeneralBasicParameters(Wolf.class, 50d, 30, 3, 8d);
    public final static GeneralBasicParameters BOA_BASIC_PARAMETER = new GeneralBasicParameters(Boa.class, 15d, 30, 1, 3d);
    public final static GeneralBasicParameters FOX_BASIC_PARAMETER = new GeneralBasicParameters(Fox.class, 8d, 30, 2, 2d);
    public final static GeneralBasicParameters BEAR_BASIC_PARAMETER = new GeneralBasicParameters(Bear.class, 500d, 5, 2, 80d);
    public final static GeneralBasicParameters EAGLE_BASIC_PARAMETER = new GeneralBasicParameters(Eagle.class, 6d, 20, 3, 1d);
    public final static GeneralBasicParameters HORSE_BASIC_PARAMETER = new GeneralBasicParameters(Horse.class, 400d, 20, 4, 60d);
    public final static GeneralBasicParameters DEER_BASIC_PARAMETER = new GeneralBasicParameters(Deer.class, 300d, 20, 4, 50d);
    public final static GeneralBasicParameters RABBIT_BASIC_PARAMETER = new GeneralBasicParameters(Rabbit.class, 2d, 150, 2, 0.45d);
    public final static GeneralBasicParameters MOUSE_BASIC_PARAMETER = new GeneralBasicParameters(Mouse.class, 0.05d, 500, 1, 0.01d);
    public final static GeneralBasicParameters GOAT_BASIC_PARAMETER = new GeneralBasicParameters(Goat.class, 60d, 140, 3, 10d);
    public final static GeneralBasicParameters SHEEP_BASIC_PARAMETER = new GeneralBasicParameters(Sheep.class, 70d, 140, 3, 15d);
    public final static GeneralBasicParameters BOAR_BASIC_PARAMETER = new GeneralBasicParameters(Boar.class, 400d, 50, 2, 50d);
    public final static GeneralBasicParameters BUFFALO_BASIC_PARAMETER = new GeneralBasicParameters(Buffalo.class, 700d, 10, 3, 100d);
    public final static GeneralBasicParameters DUCK_BASIC_PARAMETER = new GeneralBasicParameters(Duck.class, 1d, 200, 4, 0.15d);
    public final static GeneralBasicParameters CATERPILLAR_BASIC_PARAMETER = new GeneralBasicParameters(Caterpillar.class, 0.01d, 1000, 0, 0d);
    public final static GeneralBasicParameters PLANT_BASIC_PARAMETER = new GeneralBasicParameters(Plant.class, 1d, 200, 0, 0d);

    public GeneralBasicParameters(Class<? extends Animal> aClass, double maxWeight, int maxQuantity, int maxSpeed, double maxFoodRequired) {
        this.aClass = aClass;
        this.maxWeight = maxWeight;
        this.maxQuantity = maxQuantity;
        this.maxSpeed = maxSpeed;
        this.maxFoodRequired = maxFoodRequired;
    }

    public Class<? extends Animal> getaClass() {
        return aClass;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxFoodRequired() {
        return maxFoodRequired;
    }

}
