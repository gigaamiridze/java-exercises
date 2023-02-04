package ge.giga.subclasses;

import ge.giga.classes.SportEngine;
import ge.giga.classes.Vehicle;

public class Car extends Vehicle {

    public Car(int weight, int speed) {
        super(new SportEngine(), weight, speed);
    }
}
