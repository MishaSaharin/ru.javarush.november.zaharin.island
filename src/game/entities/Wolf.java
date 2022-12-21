package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Wolf extends Animal implements Carnivore {
    //eat herbivore

    public Wolf() {
        super(GeneralBasicParameters.WOLF_BASIC_PARAMETER);
    }
}
