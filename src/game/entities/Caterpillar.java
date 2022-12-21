package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Caterpillar extends Animal implements Herbivore {
    //eat plant

    public Caterpillar() {
        super(GeneralBasicParameters.CATERPILLAR_BASIC_PARAMETER);
    }
}
