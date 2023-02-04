package ge.giga;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        original = sc.nextLine();

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        boolean palindrome = true;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }

        if (palindrome) {
            System.out.println("This is a Palindrome!");
        } else {
            System.out.println("Not a Palindrome!");
        }
    }
}
