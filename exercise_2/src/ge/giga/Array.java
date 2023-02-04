package ge.giga;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[] {16, 15, 4, 42, 8, 23};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
