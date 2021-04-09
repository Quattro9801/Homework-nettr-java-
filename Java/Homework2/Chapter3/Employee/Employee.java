package exercise1Chapter3;

public class Employee implements Measurable {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }

    @Override
    public double getMeasure() {

        return salary ;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary + " $"+
                '}';
    }
}