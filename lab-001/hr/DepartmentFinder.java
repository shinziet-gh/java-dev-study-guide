package hr;

import java.util.*;

//Represent HCM system to retrieve department and employees
public class DepartmentFinder {
    private Map<Integer, Department> departments = new HashMap<>();

    //Store a department to the collection
    public void addDepartment(Department department) {
        departments.put(department.getDepartmentNumber(), department);
    }

    //Finds a department by its number
    public Department find(int departmentNumber) {
        //Use HashMap search with O(1)
        return departments.get(departmentNumber);
    }

    //Retrieves employees of a specified department
    public List<Employee> getEmployees(int departmentNumber) {
        Department dept = find(departmentNumber);

        if (dept != null){
            return dept.getEmployees();

        }
        return Collections.emptyList();
    }
}