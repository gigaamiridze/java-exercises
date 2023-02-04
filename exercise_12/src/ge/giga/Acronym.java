package ge.giga;

import java.util.Scanner;

public class Acronym {
    public static void main(String[] args) {
        String abbre, acronym = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter abbreviation: ");
        abbre = sc.nextLine();

        for (int i = 0; i < abbre.length(); i++) {
            char ch = abbre.charAt(i);
            if (Character.isUpperCase(ch)) {
                acronym += ch;
            }
        }
        System.out.println("The acronym is: " + acronym);
    }
}
