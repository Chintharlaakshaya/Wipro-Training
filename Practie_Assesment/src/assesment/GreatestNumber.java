package assesment;

import java.util.Scanner;

public class GreatestNumber {
	int greatest(int[] arr) {
		int maxNo=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxNo) {
				maxNo=arr[i];
			}
			
		}
		return maxNo;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array n");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements of Array");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		GreatestNumber great=new GreatestNumber();
		int maxNo=great.greatest(arr);
		System.out.println("The Greatest among 10 numbers is :"+maxNo);
	}

}
