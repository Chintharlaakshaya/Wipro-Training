package assesment;
//import java.io.*;
import java.util.Scanner;

public class Palindrome {
	 boolean checkPalindrome(String s){
		s=s.toLowerCase();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return s.equals(rev);
		
	}
	
	//main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text to check : ");
		String s=sc.nextLine();
		
		Palindrome p=new Palindrome();
		boolean result=p.checkPalindrome(s);
		if(result) {
			System.out.println("The text is palindrome");
		}
		else {
			System.out.println("The text is not palindrome");
		}
		
		
		
		
	}
	

}
