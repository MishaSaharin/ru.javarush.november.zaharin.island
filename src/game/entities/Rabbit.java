package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Rabbit extends Animal implements Herbivore {
    //eat plant

    public Rabbit() {
        super(GeneralBasicParameters.RABBIT_BASIC_PARAMETER);
    }
}
