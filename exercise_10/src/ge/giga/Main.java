package ge.giga;

import ge.giga.game.Coordinate;
import ge.giga.game.Game;
import ge.giga.game.State;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String... args) throws IOException, ClassNotFoundException {
        Game game = new Game();
        game.setState(new State(new Coordinate<Integer>(0, 7), 93));

        File filePath = new File("save.state");

        // Save state
        game.save(filePath);
        System.out.println(game);

        // Load state
        game.load(filePath);
        System.out.println(game);
    }
}
