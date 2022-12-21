package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Bear extends Animal implements Carnivore {
    //eat herbivore and boa

    public Bear() {
        super(GeneralBasicParameters.BEAR_BASIC_PARAMETER);
    }
}
