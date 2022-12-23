package game.entities.setting;

import game.entities.*;

public class GeneralBasicParameters {
    private Class<? extends Animal> aClass;
    private double maxWeight;
    private int maxQuantity;
    private int maxSpeed;
    private double maxFoodRequired;

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
