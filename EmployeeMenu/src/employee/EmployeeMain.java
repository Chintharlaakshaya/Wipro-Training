/*package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EmployeeMenu> employeeList = new ArrayList<>();

        // Employee 1
        EmployeeMenu emp1 = new EmployeeMenu(
            new EmployeePersonalDetails("Draupadi", 30, "Female", 9999997892L, "Hyderabad"),
            new EmployeeProfessionalDetails("IT", "Software Engineer", 5, "Infosys", "Hyderabad"),
            new EmployeeSalaryDetails(350000, 28000, 3000, 2000, 1000),
            new EmployeeLeavesDetails(30, 15, 5, 2),
            new EmployeeProjects(new String[] {"Billing System", "E-commerce Portal"})
        );

        // Employee 2
        EmployeeMenu emp2 = new EmployeeMenu(
            new EmployeePersonalDetails("Arjun", 28, "Male", 9999991234L, "Bangalore"),
            new EmployeeProfessionalDetails("HR", "Manager", 6, "TCS", "Bangalore"),
            new EmployeeSalaryDetails(450000, 37000, 3500, 2500, 1200),
            new EmployeeLeavesDetails(30, 10, 6, 3),
            new EmployeeProjects(new String[] {"Recruitment Portal", "HR Dashboard"})
        );

        // Adding employees to list
        employeeList.add(emp1);
        employeeList.add(emp2);

        System.out.println("Enter Employee Index to View Details (0 to " + (employeeList.size() - 1) + "):");
        int choice = sc.nextInt();

        if (choice >= 0 && choice < employeeList.size()) {
            EmployeeMenu emp = employeeList.get(choice);

            while (true) {
                System.out.println("\nEnter which part of employee details you want to display:");
                System.out.println("1. Personal Details");
                System.out.println("2. Professional Details");
                System.out.println("3. Salary Details");
                System.out.println("4. Leave Details");
                System.out.println("5. Project Details");
                System.out.println("6. Exit");

                int n = sc.nextInt();

                if (n == 1) {
                    emp.displayEmployeePersonalDetails();
                } else if (n == 2) {
                    emp.displayEmployeeProfessionalDetails();
                } else if (n == 3) {
                    emp.displayEmployeeSalaryDetais();
                } else if (n == 4) {
                    emp.displayEmployeeLeavesDetails();
                } else if (n == 5) {
                    emp.displayEmployeeProjects();
                } else if (n == 6) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice.");
                }
            }
        } else {
            System.out.println("Invalid employee index.");
        }

        sc.close();
    }
}*/

package employee;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EmployeeMenu> employeeList = new ArrayList<>();

        // Adding multiple employees  to list
        employeeList.add(new EmployeeMenu(
            new EmployeePersonalDetails("Draupadi", 30, "Female", 9999997892L, "Hyderabad"),
            new EmployeeProfessionalDetails("IT", "Software Engineer", 5, "Infosys", "Hyderabad"),
            new EmployeeSalaryDetails(350000, 28000, 3000, 2000, 1000),
            new EmployeeLeavesDetails(30, 15, 5, 2),
            new EmployeeProjects(new String[] {"Billing System", "E-commerce Portal"})
        ));

        employeeList.add(new EmployeeMenu(
            new EmployeePersonalDetails("Arjun", 28, "Male", 9999991234L, "Bangalore"),
            new EmployeeProfessionalDetails("HR", "Manager", 6, "TCS", "Bangalore"),
            new EmployeeSalaryDetails(450000, 37000, 3500, 2500, 1200),
            new EmployeeLeavesDetails(30, 10, 6, 3),
            new EmployeeProjects(new String[] {"Recruitment Portal", "HR Dashboard"})
        ));

        //  menu
        System.out.print("Enter employee index (0 or 1): ");
        int choice = sc.nextInt();

        if (choice >= 0 && choice < employeeList.size()) {
            EmployeeMenu emp = employeeList.get(choice);

            while (true) {
                System.out.println("\n1. Personal Details");
                System.out.println("2. Professional Details");
                System.out.println("3. Salary Details");
                System.out.println("4. Leave Details");
                System.out.println("5. Project Details");
                System.out.println("6. Exit");

                int option = sc.nextInt();

                if (option == 1) emp.displayEmployeePersonalDetails();
                else if (option == 2) emp.displayEmployeeProfessionalDetails();
                else if (option == 3) emp.displayEmployeeSalaryDetais();
                else if (option == 4) emp.displayEmployeeLeavesDetails();
                else if (option == 5) emp.displayEmployeeProjects();
                else if (option == 6) break;
                else System.out.println("Invalid choice");
            }
        } else {
            System.out.println("Invalid index");
        }

        sc.close();
    }
}

