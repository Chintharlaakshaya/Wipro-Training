package assesment;

import java.util.Scanner;

public class PrimeNumber {
	boolean checkingPrime(int n) {
		if(n<2) {
			//System.out.println("Not a Prime Number");
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false; 
            }
        }

        return true; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        PrimeNumber prime=new PrimeNumber();
        boolean result=prime.checkingPrime(number);
        if(result) {
        	System.out.println("The Number " +number+ " is a Prime Number");
        }
        else {
        	System.out.println("The Number " +number+ " is not a Prime Number");
        }
        
        
		
	}

}
