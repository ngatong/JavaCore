package employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    String getName() {
        return getFirstName() + getLastName();
    }

    int getAnnualSalary() {
        return getSalary() * 12;
    }

    int raiseSalary(int percent) {
        return getSalary() * percent;
    }

    public String toSing() {
        return +getId()+"  "+getName()+"           "+getSalary()+"      "+getAnnualSalary();
    }
}
