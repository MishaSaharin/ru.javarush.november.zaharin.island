package game.entities;

import game.entities.setting.GeneralBasicParameters;

public class Fox extends Animal implements Carnivore {
    //eat herbivore

    public Fox() {
        super(GeneralBasicParameters.FOX_BASIC_PARAMETER);
    }
}
