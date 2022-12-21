package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Duck extends Animal implements Omnivore {
    //eat plant and caterpillar

    public Duck() {
        super(GeneralBasicParameters.DUCK_BASIC_PARAMETER);
    }
}
