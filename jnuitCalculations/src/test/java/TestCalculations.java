package test.java;

import static org.junit.jupiter.api.Assertions.*;

import main.java.Box;

import org.junit.jupiter.api.Test;

class TestCalculations {
	Box b= new Box();

	@Test
	public void circleArea() {
		assertEquals(12.56,b.circleArea(2));
		
	}
	
	@Test
	public void squareArea() {
		assertEquals(100.0,b.squareArea(10));
		
	}
	
	 @Test
	    public void rectangleArea() {
	        assertEquals(100.0, b.rectangleArea(10, 10));
	    }
	 @Test
	 public void simpleInterest() {
		 assertEquals(360.0, b.simpleInterest(6000, 3, 2));
	 }
	 @Test
	 public void amount() {
		 double calc=360.0 + 6000 * Math.pow(1.02, 3);
		 assertEquals(calc, b.amount());
	 }
	 
	
	

}
