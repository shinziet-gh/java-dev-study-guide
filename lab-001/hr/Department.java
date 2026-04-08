package hr;

import java.util.*;

//Represents a department containing employees
class Department {
    private int departmentNumber;
    private String departmentName;
    private List<Employee> employees;

    //Constructor to initialize department details and list of employees
    public Department(int number, String name) {
        departmentNumber = number;
        departmentName = name;
        employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    //Assigns an employee to this department
    public void assignEmployee(Employee employee) {
        employees.add(employee);
        employee.assignDepartment(this);
    }
}