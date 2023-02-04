package ge.giga;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, symbol, input = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("შეიყვანეთ სპეციალური სიმბოლო: ");
        symbol = sc.nextInt();

        while (input != symbol) {
            System.out.print("შეიყვანეთ რიცხვი: ");
            input = sc.nextInt();

            if (input < min) {
                min = input;
            }
            if (input > max) {
                max = input;
            }
        }
        System.out.println("მინიმალური: " + min);
        System.out.println("მაქსიმალური: " + max);
    }
}
