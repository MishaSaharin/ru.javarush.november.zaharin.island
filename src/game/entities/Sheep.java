package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Sheep extends Animal implements Herbivore {
    //eat plant

    public Sheep() {
        super(GeneralBasicParameters.SHEEP_BASIC_PARAMETER);
    }
}
