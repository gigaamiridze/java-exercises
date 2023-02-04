package ge.giga;

import ge.giga.enums.AnimalType;
import ge.giga.enums.Gender;
import ge.giga.subclasses.Cat;
import ge.giga.subclasses.Dog;
import ge.giga.subclasses.Duck;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Max", AnimalType.DOMESTIC, 20.0, 5, Gender.MALE),
                new Cat("Pnopka", AnimalType.DOMESTIC, 5.0, 3, Gender.FEMALE),
                new Duck("Guffy", AnimalType.WILD, 11.0, 4, Gender.FEMALE)
        };

        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.eat());
            System.out.println(animal.makeSound());
        }
    }
}
