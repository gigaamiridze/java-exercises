package ge.giga.subclasses;

import ge.giga.classes.NormalEngine;
import ge.giga.classes.Vehicle;

public class Bus extends Vehicle {

    public Bus(int weight, int speed) {
        super(new NormalEngine(), weight, speed);
    }
}
