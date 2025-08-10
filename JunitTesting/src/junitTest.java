import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Calculator;

class junitTest {
	Calculator calc = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(30,calc.add(20,10));
	}
	@Test
	public void testSub() {
		assertEquals(20,calc.sub(50, 30));
	}
	@Test
	public void testMul() {
		assertEquals(100,calc.mul(10, 10));
	}
	@Test
	public void testDiv() {
		assertEquals(25,calc.div(100, 4));
	}

}
