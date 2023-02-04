package ge.giga.game;

import java.io.Serializable;
import java.util.Objects;

public class Coordinate<TYPE extends Number> implements Serializable {

    public static final long serialVersionUID = 1L;

    protected TYPE x;
    protected TYPE y;

    public Coordinate() {
    }

    public Coordinate(TYPE x, TYPE y) {
        this.x = x;
        this.y = y;
    }

    public TYPE getX() {
        return x;
    }

    public void setX(TYPE x) {
        this.x = x;
    }

    public TYPE getY() {
        return y;
    }

    public void setY(TYPE y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate<?> that = (Coordinate<?>) o;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
