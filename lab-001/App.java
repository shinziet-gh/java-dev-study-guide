import java.util.*;

//Represents an employee in the system
class Employee {
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

//Represent HCM system to retrieve department and employees
class DepartmentFinder {
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
