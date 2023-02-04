package ge.giga;

public enum Profession {
    PROGRAMMER("Programmer", 1000.0),
    TEACHER("Teacher", 700.0),
    ENGINEER("Engineer", 1200.0);

    private String readableProfession;
    private double averageSalary;

    Profession(String readableProfession, double averageSalary) {
        this.readableProfession = readableProfession;
        this.averageSalary = averageSalary;
    }

    public String getReadableProfession() {
        return readableProfession;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    @Override
    public String toString() {
        return "Profession: " + readableProfession + ", " + "Average salary: " + averageSalary;
    }
}
