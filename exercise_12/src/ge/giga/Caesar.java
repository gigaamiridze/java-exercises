package ge.giga;

import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String text = sc.nextLine();
        encodeCaesar(text, 3);
    }

    public static void encodeCaesar(String text, int shift) {
        System.out.println(text);
        char [] chars = text.toCharArray();
        for (char ch : chars) {
            ch += shift;
            System.out.print(ch);
        }
    }
}
