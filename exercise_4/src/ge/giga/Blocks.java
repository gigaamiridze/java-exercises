package ge.giga;

public class Blocks {

    static {
        System.out.println("Static init block called");
    }

    {
        System.out.println("Init block called");
    }

    public Blocks() {
        System.out.println("Constructor called");
    }
}
