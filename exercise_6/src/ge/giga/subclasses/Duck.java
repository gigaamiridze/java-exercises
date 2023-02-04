package ge.giga.subclasses;

import ge.giga.Animal;
import ge.giga.enums.AnimalType;
import ge.giga.enums.Gender;

public class Duck extends Animal {

    public Duck(String name, AnimalType animalType, double weight, int age, Gender gender) {
        super(name, animalType, weight, age, gender);
    }

    @Override
    public String eat() {
        return name + " eating.";
    }

    @Override
    public String makeSound() {
        return "Yva, Yva! :)";
    }
}
