package ge.giga.models;

import java.util.Objects;

public class Car {
    protected double speed;
    protected double weight;

    public Car(double speed, double weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.speed, speed) == 0 && Double.compare(car.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, weight);
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
