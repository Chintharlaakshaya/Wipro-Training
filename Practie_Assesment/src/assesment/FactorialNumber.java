package assesment;

import java.util.Scanner;

public class FactorialNumber {

    
    int factorial(int n) {
        int result = 1;
        for (int i = n; i>=1; i--) {
            result *= i;
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int s = sc.nextInt();

        // Create object of the class
        FactorialNumber fact = new FactorialNumber();

        // Call method using object
        int result = fact.factorial(s);

        System.out.println("Factorial of " + s + " is: " + result);
    }
}
