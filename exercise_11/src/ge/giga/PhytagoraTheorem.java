package ge.giga;

import java.util.Scanner;

public class PhytagoraTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("შემოიტანეთ a-ს მნიშვნელობა: ");
        int a = sc.nextInt();

        System.out.print("შემოიტანეთ b-ს მნიშვნელობა: ");
        int b = sc.nextInt();

        double c = Math.sqrt(a*a + b*b);
        System.out.println("პასუხი: " + c);
    }
}
