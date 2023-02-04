package ge.giga.subclasses;

import ge.giga.models.Car;

import java.util.Objects;

public class Porsche extends Car {
    protected String model;

    public Porsche(double speed, double weight, String model) {
        super(speed, weight);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Porsche porsche = (Porsche) o;
        return Objects.equals(model, porsche.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }

    @Override
    public String toString() {
        return "Porsche{" +
                "speed=" + speed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }
}
