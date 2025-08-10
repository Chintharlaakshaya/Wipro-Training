package collections;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

class EmployeeList {

    private int id;

    private String name;

    private String department;
 
    public EmployeeList(int id, String name, String department) {

        this.id = id;

        this.name = name;

        this.department = department;

    }
 
    public int getId() {

        return id;

    }
 
    public String getName() {

        return name;

    }
 
    public String getDepartment() {

        return department;

    }
 
    @Override

    public String toString() {

        return "Employee{" +

                "ID=" + id +

                ", Name='" + name + '\'' +

                ", Department='" + department + '\'' +

                '}';

    }

}
 
public class EmployeeListExample {

    public static void main(String[] args) {

        List<EmployeeList> employeeList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
 
        // Adding Employees

        employeeList.add(new EmployeeList(101, "Alice", "HR"));

        employeeList.add(new EmployeeList(102, "Bob", "IT"));

        employeeList.add(new EmployeeList(103, "Charlie", "Finance"));
 
        // Display All Employees

        System.out.println("All Employees:");

        for (EmployeeList emp : employeeList) {

            System.out.println(emp);

        }
 
        // Search by ID

        System.out.print("\nEnter Employee ID to search: ");

        int searchId = scanner.nextInt();

        boolean found = false;


		for (EmployeeList emp : employeeList) {

            if (emp.getId() == searchId) {

                System.out.println("Found: " + emp);

                found = true;

                break;

            }

        }

        if (!found) {

            System.out.println("Employee with ID " + searchId + " not found.");

        }
 
        // Remove by ID

        System.out.print("\nEnter Employee ID to remove: ");

        int removeId = scanner.nextInt();

        EmployeeList toRemove = null;	

        for (EmployeeList emp : employeeList) {

            if (emp.getId() == removeId) {

                toRemove = emp;

                break;

            }

        }
 
        if (toRemove != null) {

            employeeList.remove(toRemove);

            System.out.println("Employee removed.");

        } else {

            System.out.println("Employee with ID " + removeId + " not found.");

        }
 
        // Final List

        System.out.println("\nUpdated Employee List:");

        for (EmployeeList emp : employeeList) {

            System.out.println(emp);

        } 
        }
    }

 