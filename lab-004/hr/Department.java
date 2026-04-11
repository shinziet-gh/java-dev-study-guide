package hr;

import java.util.*;

public class Department {
    private String name;
    private List<Employee> employees;
    private final int MAX_EMPLOYEE_SIZE = 10;

    public Department(String name) {
        this.employees = new ArrayList<>();
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public String getName() {
        return this.name;
    }

    public void setEmployees(List<Employee> employee) {
        this.employees = employee;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void assignEmployee(Employee employee) {
        //Add new employee to the list, consider the size of the array.
        //Stop adding employees once array capacity is reached.
        if (getEmployees().size() < MAX_EMPLOYEE_SIZE) {
            this.employees.add(employee);
        }
    }

    public Employee findEmployee(int id) {
        try {
            for (Employee emp : getEmployees()) {
                if (emp.getEmployeeId() == id) {
                    return emp;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("No matching employee found.");
        }

        return null;
    }

    public double getTotalSalary() {
        //Calculate the total salary and return the result.
        double totalSalary = 0.0;
        for (Employee emp : getEmployees()) {
            totalSalary += emp.getSalary();
        }

        return totalSalary;
    }

    public double getAverageSalary() {
        //Calculate the average salary by dividing the total salary by the number of elements.
        double averageSalary = 0.0;
        double totalSalary = getTotalSalary();
        averageSalary = totalSalary/getEmployees().size();

        return averageSalary;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
