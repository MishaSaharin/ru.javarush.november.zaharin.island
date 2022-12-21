package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Goat extends Animal implements Herbivore {
    //eat plant

    public Goat() {
        super(GeneralBasicParameters.GOAT_BASIC_PARAMETER);
    }
}
