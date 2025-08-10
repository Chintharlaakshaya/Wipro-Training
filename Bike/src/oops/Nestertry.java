package oops;

public class Nestertry {

	public static void main(String[] args) {
		try {
			//outer try block
			int[] nums= {10,20,20};
			System.out.println("AM Outer try block");
			
			try {
				//inner try block
				System.out.println("inner try block");
				int result=nums[1]/0;
			
			}
			catch(ArithmeticException e) {
				System.out.println("Caught Arithmetic Exception");
				e.printStackTrace();
				System.out.println("default printing :"+e.getMessage());
			}
			
			System.out.println(nums[5]); //cause ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: "+e.getMessage());
		}
		finally {
			System.out.println("Hi am finally block excutes always");
		}
	
		



	}

}
