package ge.giga.game;

import java.io.*;
import java.util.Objects;

public class Game {

    protected State state;

    public Game() {
    }

    public Game(State state) {
        this.state = state;
    }

    public void save(File filePath) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(state);
        }
    }

    public void load(File filePath) throws IOException, ClassNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            state = (State) objectInputStream.readObject();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(state, game.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state);
    }

    @Override
    public String toString() {
        return "Game{" +
                "state=" + state +
                '}';
    }
}
