package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Deer extends Animal implements Herbivore {
    //eat plant

    public Deer() {
        super(GeneralBasicParameters.DEER_BASIC_PARAMETER);
    }
}
