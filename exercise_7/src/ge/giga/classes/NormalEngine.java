package ge.giga.classes;

import ge.giga.interfaces.Engine;

public class NormalEngine implements Engine {
    @Override
    public int accelerate(int weight, int oldSpeed) {
        return oldSpeed + (10000 / weight) * 5;
    }
}
