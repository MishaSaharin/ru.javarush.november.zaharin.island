package game.entities;

import game.entities.setting.GeneralBasicParameters;
import game.utility.Randomizer;

public abstract class Animal extends Organism {
    private Class<? extends Animal> aClass;

    private final GeneralBasicParameters generalBasicParameters;

    public Animal(GeneralBasicParameters generalBasicParameters) {
        this.weight = Randomizer.getRandom(generalBasicParameters.getMaxWeight() / 2, generalBasicParameters.getMaxWeight());
        this.aClass = generalBasicParameters.getaClass();
        this.generalBasicParameters = generalBasicParameters;
    }

    public void moveTo() {

    }

    public void reproduce() {

    }

    public Class<? extends Animal> getaClass() {
        return aClass;
    }

    public void setaClass(Class<? extends Animal> aClass) {
        this.aClass = aClass;
    }

    public GeneralBasicParameters getGeneralBasicParameters() {
        return generalBasicParameters;
    }
}
