package game;

import game.creators.WorldGenerator;
import game.entities.settings.Setting;
import game.services.LifeWorker;

public class Runner {
    public static void main(String[] args) {
        WorldGenerator world = new WorldGenerator(Setting.SIZE_OF_GAME_FIELD_Y, Setting.SIZE_OF_GAME_FIELD_X);
        LifeWorker lifeWorker = new LifeWorker(world);
        lifeWorker.start();
    }
}
