package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Eagle extends Animal implements Omnivore {
    //eat herbivore and fox

    public Eagle() {
        super(GeneralBasicParameters.EAGLE_BASIC_PARAMETER);
    }
}
