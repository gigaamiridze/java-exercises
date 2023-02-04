package ge.giga;

import ge.giga.classes.Vehicle;
import ge.giga.subclasses.Bus;
import ge.giga.subclasses.Car;

public class Main {
    public static void main(String[] args) {
        Vehicle car, bus;
        car = new Car(2 * 1000, 0);
        bus = new Bus(5 * 1000, 0);

        System.out.println("Car test result: " + car.testAcceleration());
        System.out.println("Bus test result: " + bus.testAcceleration());
    }
}
