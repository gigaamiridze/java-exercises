package ge.giga.helper;

import ge.giga.models.Car;

import java.util.Comparator;

public class CarWeightComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Car) || !(o2 instanceof Car)) {
            throw new IllegalArgumentException("Not Car!");
        }
        Car c1, c2;
        c1 = (Car) o1;
        c2 = (Car) o2;
        return Double.valueOf(c1.getWeight()).compareTo(c2.getWeight());
    }
}
