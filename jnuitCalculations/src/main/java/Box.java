package main.java;

public class Box {
	public double circleArea(int r) {
		//return Math.PI*r*r;
		return 3.14*r*r;
	}
	public double triangleArea(int base, int height) {
		 return 0.5 * base * height;
	}
	public double squareArea(int side) {
        return side * side;
    }
	public double rectangleArea(int length, int width) {
        return length * width;
    }
	public double simpleInterest(int principal, int time, int rate) {
        return (principal * time * rate) / 100;
    }
	public double amount() {
		int p = 6000;     // You can customize default values
        int t = 3;
        int r = 2;
        
        double interest=simpleInterest(p,t,r);
        double calculate= p * Math.pow((1 + r / 100.0), t);
        return interest+calculate;
	}
	
	

}
