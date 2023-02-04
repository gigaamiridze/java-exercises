package ge.giga;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person johnBrown = new Person("John", "Brown", 35);

        try {
            ProcessModifyString.doProcess(johnBrown);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            System.out.println(johnBrown);
        }
    }
}
