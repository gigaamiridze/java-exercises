package ge.giga;

import ge.giga.helper.CarHelper;
import ge.giga.models.Car;
import ge.giga.subclasses.BMW;
import ge.giga.subclasses.Mercedes;
import ge.giga.subclasses.Porsche;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new BMW(190.0, 1.1, "E60"),
                new Mercedes(170.0, 1.3, "AMG"),
                new Porsche(220.0, 1.0, "911")
        );

        System.out.println(CarHelper.sortCarsBySpeed(cars));
        System.out.println(CarHelper.sortCarsByWeight(cars));
        System.out.println(CarHelper.getMap(cars));
    }
}
