package ge.giga;

import java.util.Scanner;

public class EasyMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter value of y: ");
        int y = sc.nextInt();

        System.out.print("Enter value of z: ");
        int z = sc.nextInt();

        int result = x + y - z;
        System.out.print(String.format("Result: %d", result));
    }
}
