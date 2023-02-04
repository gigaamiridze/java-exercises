package ge.giga;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number, remainder;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter Number: ");
        number = sc.nextInt();

        remainder = number % 2;

        if (remainder == 0) {
            System.out.print(number + " is an Even number.");
        } else {
            System.out.print(number + " is an Odd number.");
        }
    }
}
