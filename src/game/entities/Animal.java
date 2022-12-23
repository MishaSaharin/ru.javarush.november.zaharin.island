package game.entities;

import game.entities.setting.ChanceToBeEat;
import game.entities.setting.GeneralBasicParameters;
import game.entities.setting.Setting;
import game.island.Location;
import game.utility.Randomizer;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class Animal extends Organism {
    private Class<? extends Animal> aClass;
    private GeneralBasicParameters generalBasicParameters;

    public Animal() {
        this.generalBasicParameters = Setting.get().getGeneralBasicParameters(this.aClass);
        this.weight = Randomizer.getRandom(generalBasicParameters.getMaxWeight() / 2, generalBasicParameters.getMaxWeight());
        this.aClass = generalBasicParameters.getaClass();
    }

    public void moveTo(Location location) {
        //check if there is a nearby location
        //check if there is a free place on location
    }

    public void reproduce(Location location) {
        // check numbers of animal

    }

    public GeneralBasicParameters getGeneralBasicParameters() {
        return generalBasicParameters;
    }

    public Class<? extends Animal> getaClass() {
        return aClass;
    }

    public void setForaClass(Class<? extends Animal> aClass) {
        this.aClass = aClass;
    }

    protected Map<Class<? extends Animal>, Integer> getVictimProbability() {

        return null;
    }

    protected Animal getVictim() {

        return null;
    }
}
