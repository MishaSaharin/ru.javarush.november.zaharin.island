package game.entities;

public abstract class Animal extends Organism {
    private Class<? extends Animal> aClass;

    public void moveTo(){

    }

    public void reproduce(){

    }

    public Class<? extends Animal> getaClass() {
        return aClass;
    }
}
