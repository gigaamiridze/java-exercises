package ge.giga;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public void setAgeFromString(String strAge) {
        age = Integer.valueOf(strAge);
    }

    public String sayMyName(int nTimes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nTimes; i++) {
            sb.append(firstName).append(" ").append(lastName).append("\n");
        }
        return sb.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
