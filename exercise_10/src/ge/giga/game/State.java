package ge.giga.game;

import java.io.Serializable;
import java.util.Objects;

public class State implements Serializable {

    public static final long serialVersionUID = 1L;

    protected Coordinate<Integer> coordinate;
    protected int health;

    public State() {
    }

    public State(Coordinate<Integer> coordinate, int health) {
        this.coordinate = coordinate;
        this.health = health;
    }

    public Coordinate<Integer> getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate<Integer> coordinate) {
        this.coordinate = coordinate;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return health == state.health && Objects.equals(coordinate, state.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate, health);
    }

    @Override
    public String toString() {
        return "State{" +
                "coordinate=" + coordinate +
                ", health=" + health +
                '}';
    }
}
