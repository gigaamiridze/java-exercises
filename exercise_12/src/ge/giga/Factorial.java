package ge.giga;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
        System.out.println(n + "-ის ფაქტორიალი არის " + result);
        return result;
    }
}
