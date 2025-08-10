package oops;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter number of students: ");
            int count = scanner.nextInt();

            for (int i = 1; i <= count; i++) {
                System.out.print("\nEnter student name: ");
                String name = scanner.next();

                System.out.print("Enter grade (0-100): ");
                int grade = scanner.nextInt();

                if (grade < 0 || grade > 100) {
                    throw new InvalidGradeException("Invalid grade! Must be between 0 and 100.");
                }

                System.out.println("Student: " + name + ", Grade: " + grade);
            }

        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}


