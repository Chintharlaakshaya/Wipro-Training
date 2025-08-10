package oops;

import java.util.Scanner;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		int num ,den,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numertaor :");
		num=sc.nextInt();
		
		System.out.println("Enter the denominator: ");
		den = sc.nextInt();
		try {
			result = num/den;
			System.out.println("Result is: "+result);
		}catch(Exception e) {
			System.out.println("Cannot divide the numerator by zero");
			e.printStackTrace();
		}
		//Optional block
		finally{
			result = num/30;
			System.out.println("Result is: "+result);
			System.out.println("Finally block will always be executed no matter exception occurs or not");
		}
		}
	 
	
		
		
		

	}



