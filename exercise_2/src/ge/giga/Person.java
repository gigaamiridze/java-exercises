package ge.giga;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;

    public Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void print() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "cm");
        System.out.println("Weight: " + weight + "kg");
    }

    public void checkAge() {
        if (age > 21) {
            System.out.println("Age is over 21.");
        } else {
            System.out.println("Age less than 21.");
        }
    }
}
