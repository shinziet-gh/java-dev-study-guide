package hr;

public class HRApp {

    public static void main(String[] args) {
        //Declare variables to create new employees
        Employee emp1 = new Employee(1, "Alice", 1500.0);
        Employee emp2 = new Employee(2, "Bob", 1250.0);
        Employee emp3 = new Employee(3, "Charlotte", 800.0);

        Department dept = new Department("Education");

        //Add employees to the department
        dept.assignEmployee(emp1);
        dept.assignEmployee(emp2);
        dept.assignEmployee(emp3);

        //Print information about the Department
        System.out.println("Department: Department " + dept.toString());

        //Print the total salary of the Department
        double totalSalary = dept.getTotalSalary();
        System.out.println("Total Salary: " + totalSalary);
        
        //Print the average salary of the Department
        double averageSalary = dept.getAverageSalary();
        System.out.println("Average Salary: " + averageSalary);    
    }
}
