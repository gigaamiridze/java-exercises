package ge.giga;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John", "Brown", 35, 1500.0, Profession.PROGRAMMER, Gender.MALE);
        System.out.println(john);

        Employee.Statistic statistic = john.new Statistic();
        statistic.checkSalary();
        System.out.print(john.getName() + "-ის წლიური ხელფასი არის " + statistic.annualSalary());
    }
}
