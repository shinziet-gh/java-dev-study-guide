package hr;

//Represents an employee in the system
public class Employee {
    private String employeeName;
    private Department department;

    //Constructor to initialize employee with employee name
    public Employee(String name) {
        employeeName = name;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    //Assigns an employee to a department
    public void assignDepartment(Department dept) {
        department = dept;
    }

    //Overriding toString() method of String class
    @Override
    public String toString() {
        return employeeName;
    }

}