package ge.giga;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private double salary;
    private Profession profession;
    private Gender gender;

    public Employee(String name, String surname, int age, double salary, Profession profession, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.profession = profession;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee { Name: " + name + ", " +
                "Surname: " + surname + ", " +
                "Age: " + age + ", " +
                "Salary: " + salary + ", " +
                profession + ", " +
                gender + " }";
    }

    class Statistic {

        public void checkSalary() {
            if (salary > profession.getAverageSalary()) {
                System.out.println(getName() + "-ს აქვს თავისივე პროფესიის საშუალოზე მეტი ხელფასი.");
            } else {
                System.out.println(getName() + "-ს არ აქვს თავისივე პროფესიის საშუალოზე მეტი ხელფასი.");
            }
        }

        public double annualSalary() {
            return 12 * salary;
        }
    }
}
