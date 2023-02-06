package game;

import game.entities.Game;
import game.entities.settings.Initializer;
import game.entities.world.World;
import game.services.GameWorker;

public class Runner {
    public static void main(String[] args) {
        Initializer initializer = new Initializer();
        World world = initializer.createWorld();
        Game game = new Game(world);
        GameWorker gameWorker = new GameWorker(game);
        gameWorker.start();
    }
}
