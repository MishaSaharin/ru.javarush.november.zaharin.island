package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Boar extends Animal implements Omnivore {
    //eat plant and mouse, caterpillar

    public Boar() {
        super(GeneralBasicParameters.BOAR_BASIC_PARAMETER);
    }
}
