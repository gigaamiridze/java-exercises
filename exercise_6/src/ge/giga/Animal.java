package ge.giga;

import ge.giga.enums.AnimalType;
import ge.giga.enums.Gender;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected AnimalType animalType;
    protected double weight;
    protected int age;
    protected Gender gender;

    public Animal(String name, AnimalType animalType, double weight, int age, Gender gender) {
        this.name = name;
        this.animalType = animalType;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public abstract String eat();

    public abstract String makeSound();

    public AnimalType getAnimalType() {
        return animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.weight, weight) == 0 && age == animal.age && Objects.equals(name, animal.name) && animalType == animal.animalType && gender == animal.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, animalType, weight, age, gender);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", animalType=" + animalType +
                ", weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
