package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.java.JunitExamples;

class TestClass {
	JunitExamples ex = new JunitExamples();

	@Test
	public void testTable() {
		
		String[] expected = {
	            "Reverse Table\n=========================",
	            "2 x 10 = 20",
	            "2 x 9 = 18",
	            "2 x 8 = 16",
	            "2 x 7 = 14",
	            "2 x 6 = 12",
	            "2 x 5 = 10",
	            "2 x 4 = 8",
	            "2 x 3 = 6",
	            "2 x 2 = 4",
	            "2 x 1 = 2"
	        };
		  String[] actual = ex.reverseTable();

	        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
	    }
	@Test
	public void testAlphabets() {
		
		String[] expected= {
				"a", "b", "c", "d", "e", "f", "g",
	            "h", "i", "j", "k", "l", "m", "n",
	            "o", "p", "q", "r", "s", "t", "u",
	            "v", "w", "x", "y", "z"};
		String[] actual = ex.alphabetsArray();
	
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));
	}
	
	@Test
	public void testAscii() {
		String[] actual = ex.asciiArray();

        String[] expected = new String[26];
        for (int i = 0; i < 26; i++) {
            int ascii = 97 + i;
            expected[i] = (char) ascii + "=" + ascii;

        }

        assertEquals(Arrays.toString(expected),  Arrays.toString(actual));
    }
		
	
	
	@Test
	public void testFactorial() {
		assertEquals(120, ex.factorial(5));
	}
	
	@Test
	public void testCountNumbers() {
		int[] input = {1, -3, 0, 4, -2, 0, 5};
        int[] expected = {3, 2, 2}; 
        int[] actual = ex.countNumbers(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
        
    
	}
	
	@Test
	public void testFindMinMax() {
	    int[] input = {10, -5, 3, 20, 0};
	    int[] expected = {-5, 20}; 
	    int[] actual = ex.findMinMax(input);
	    assertEquals(Arrays.toString(expected), Arrays.toString(actual));
	}

	@Test
	public void testOnesComplement() {
	    assertEquals("1100", ex.onesComplement("0011"));
	   
	}
	
	@Test
	public void testTwosComplement() {
		assertEquals("1101", ex.twosComplement("0011")); 
	   
	}
	
	@Test
	public void testFibonacci() {
        int[] expected = {0, 1, 1, 2, 3};
        assertEquals(Arrays.toString(expected), Arrays.toString(ex.fibonacci(5)));

	}
	
	 @Test
	    public void testFindDivisibleBy9() {
		 int[] actual = ex.findDivisibleBy9();

		    assertEquals(11, actual[0]);   // count
		    assertEquals(1683, actual[1]); // sum
		
	    }
}
	
	
	
		
		
	


