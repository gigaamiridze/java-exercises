package ge.giga.classes;

import ge.giga.interfaces.Engine;

public class SportEngine implements Engine {
    @Override
    public int accelerate(int weight, int oldSpeed) {
        return oldSpeed + (10000 / weight) * 10;
    }
}
