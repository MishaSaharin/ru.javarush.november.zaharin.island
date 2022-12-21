package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Mouse extends Animal implements Omnivore {
    //eat plant and caterpillar

    public Mouse() {
        super(GeneralBasicParameters.MOUSE_BASIC_PARAMETER);
    }
}
