package game.entities.settings;

import game.creators.WorldCreator;
import game.entities.world.World;

public class Initializer {

    public World createWorld() {
        WorldCreator worldCreator = new WorldCreator();
        return worldCreator.createWorld();
    }
}
