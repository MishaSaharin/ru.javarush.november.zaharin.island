package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Buffalo extends Animal implements Herbivore {
    //eat plant

    public Buffalo() {
        super(GeneralBasicParameters.BUFFALO_BASIC_PARAMETER);
    }
}
