package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Horse extends Animal implements Herbivore {
    //eat plant

    public Horse() {
        super(GeneralBasicParameters.HORSE_BASIC_PARAMETER);
    }
}
