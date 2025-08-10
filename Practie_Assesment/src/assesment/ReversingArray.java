package assesment;

import java.util.Scanner;

public class ReversingArray {
	void reverseArray(int[] arr) {
		System.out.println("Reversed Array:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array n");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements of Array");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			//System.out.println("Array elements :" + arr[n]);
			arr[i] = sc.nextInt();
		}
		ReversingArray reverse=new ReversingArray();
		reverse.reverseArray(arr);
		
		//System.out.println("Reversed Array is :" + arr);
		
	}

}
