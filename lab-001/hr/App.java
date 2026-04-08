package hr;

import java.util.*;

public class App {
    //Program entry point
    public static void main(String[] args) throws Exception {
        //Create a new employee
        Employee emp = new Employee("Alice");
        
        //Create a new department
        Department dept = new Department(1, "Marketing");
        dept.assignEmployee(emp);

        //Retrieve the specified department using the DepartmentFinder's find behavior.
        DepartmentFinder departmentFinder = new DepartmentFinder();
        departmentFinder.addDepartment(dept);

        //Print employee names
        List<Employee> employees = departmentFinder.getEmployees(1);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
