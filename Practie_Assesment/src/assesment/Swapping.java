package assesment;

import java.util.Scanner;

public class Swapping {
	void swap(int x,int y) {
		System.out.println("Before swapping: x = " + x + ", y = " + y);
		/*x=x+1;
		y=y-1;
		x=y+1;*/
		
		
		x=x+y;
        y=x-y;
        x=x-y;
		
		//return(x,y);
		System.out.println("After swapping: x = " + x + ", y = " + y);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the X :");
		int x=sc.nextInt();
		System.out.println("Enter the y :");
		//int x=sc.nextInt();
		int y=sc.nextInt();
		
		Swapping swap=new Swapping();
		swap.swap(x, y);
		
		
	}
	

}
