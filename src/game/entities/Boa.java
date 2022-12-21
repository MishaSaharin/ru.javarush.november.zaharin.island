package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Boa extends Animal implements Omnivore {
    //eat herbivore and fox

    public Boa() {
        super(GeneralBasicParameters.BOA_BASIC_PARAMETER);
    }
}
