package ge.giga;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", "Brown", 35, new Address("Georgia", "Mtskheta", "Chavchavadze N7"));
        System.out.println(john);

        // Set age to String
        john.setAgeFromString("33");
        System.out.println(john.getAge());

        // Say name 5 times
        System.out.print(john.sayMyName(5));

        // Generate 10 person
        Person[] people = Persons.generate(10);
        System.out.print(Arrays.toString(people));
    }
}
