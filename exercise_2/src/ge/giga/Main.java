package ge.giga;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array Sorter
        int[] array = {16, 15, 4, 42, 8, 23};
        int[] sortedArray = new ArraySorter().sort(array);
        System.out.println(Arrays.toString(sortedArray));

        // Person
        Person john = new Person("John", "Brown", 35, 1.77, 65.5);
        john.print();
        john.checkAge();

        // Symbol Counter
        System.out.print("The number of symbol: " + SymbolCounter.counterSymbol("hip-hop", 'h'));
    }
}
