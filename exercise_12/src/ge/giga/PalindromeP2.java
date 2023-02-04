package ge.giga;

import java.util.Scanner;

public class PalindromeP2 {
    public static void main(String[] args) {
        String original;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        original = sc.nextLine();
        System.out.println(isPalindrome(original));
    }

    public static boolean isPalindrome(String original) {
        String reverse = "";
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
            return true;
        } else {
            return false;
        }
    }
}
