package hr;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + String.valueOf(getEmployeeId()) + " " + getName() + " " + String.valueOf(getSalary());
    }
}
