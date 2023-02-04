package ge.giga;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import java.util.Random;
import java.util.Scanner;

public class Persons {
    public static Person createFromConsole() {
        Person newPerson = new Person();
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter person's first name: ");
        newPerson.setFirstName(sc.nextLine());

        System.out.print("Please enter last name: ");
        newPerson.setLastName(sc.nextLine());

        System.out.println("Please enter age: ");
        newPerson.setAge(sc.nextInt());

        return newPerson;
    }

    public static Person[] generate(int amount) {
        Person[] people = new Person[amount];
        Random rnd = new Random();
        Faker faker = new Faker();
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
            Name fakeName = faker.name();
            people[i].setFirstName(fakeName.firstName());
            people[i].setLastName(fakeName.lastName());
            people[i].setAge(rnd.nextInt(77) + 18);

            Address fakeAddress = faker.address();
            people[i].setAddress(new ge.giga.Address(fakeAddress.country(), fakeAddress.city(), fakeAddress.streetAddress()));
        }
        return people;
    }
}
