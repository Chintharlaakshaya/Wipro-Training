package main.java;

public class JunitExamples { 
	
   //method 1
    public String[] reverseTable() {
        String[] table = new String[11];
        table[0] = "Reverse Table\n=========================";

        int index = 1;
        for (int i = 10; i >= 1; i--) {
            table[index] = "2 x " + i + " = " + (2 * i);
            index++;
        }

        return table;
    }
    
    //method 2
    public String[] alphabetsArray() {
    	String[] alphabets=new String[26];
    	char ch='a';
    	
    	for(int i=0;i<26;i++) {
    		alphabets[i]=String.valueOf(ch);
    		ch++;
    	}
    	return alphabets;
    	
    	
    }
    
    //method 3
    public String[] asciiArray() {
    	String[] asciiArray=new String[26];
    	for(int i=0;i<26;i++) {
    		int ascii=97+i;
    		asciiArray[i]=(char)ascii + "=" +ascii;
    	}
    	return asciiArray;
    	
    }
    
    //method 4
    public int factorial(int n) {
    	int fact=1;
    	for(int i=2;i<=n;i++){
    			fact=fact*i;
    }
    return fact;
    }
    
    
    //method 5
    public int[] countNumbers(int[] numbers) {
        int positive = 0, negative = 0, zero = 0;

        for (int num : numbers) {
            if (num > 0) positive++;
            else if (num < 0) negative++;
            else zero++;
        }

        return new int[]{positive, negative, zero};
    }
    
    //method 6
    public int[] findMinMax(int[] numbers) {
    	int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return new int[]{min, max};
    }
    
    //method 7
    public String onesComplement(String binary) {
        char[] chars = binary.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                chars[i] = '1';
            } else if (chars[i] == '1') {
                chars[i] = '0';
            }
        }
        return new String(chars);
    }
    
    //method 8
    public String twosComplement(String binary) {
        // 1s complement
        String onesComp = onesComplement(binary);

        // Add 1 to 1s complement
        char[] chars = onesComp.toCharArray();
        boolean carry = true;

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '1' && carry) {
                chars[i] = '0';  // 1 + 1 = 0 with carry
            } else if (chars[i] == '0' && carry) {
                chars[i] = '1';  // 0 + 1 = 1 → carry done
                carry = false;
            }
           
        }


        return new String(chars);
    }
    
    //method 9
    public int[] fibonacci(int n) {
        int[] fib = new int[n];
        if (n >= 1) fib[0] = 0;
        if (n >= 2) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }
    
    //method 10
    public int[] findDivisibleBy9() {
        int count = 0;
        int sum = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                count++;
                sum += i;
            }
        }

        return new int[]{count, sum}; 
    }
    


    

    
    
    //main
    public static void main(String[] args) {
        JunitExamples ex = new JunitExamples();  
        // Call reverseTable
        String[] table = ex.reverseTable();
        for (String line : table) {
            System.out.println(line);
        }
        
     // Call alphabetsArray
        String[] alphabets = ex.alphabetsArray();
        for (String letter : alphabets) {
            System.out.print(letter + " ");
        }
        System.out.println();
        
        //ascii
        String[] asciiArray=ex.asciiArray();
        for(String ascii : asciiArray) {
        	System.out.println(ascii + " ");
        	
        }
       
        
        //factorial
        System.out.println("Factorial of 5: " + ex.factorial(5));
        
     // 5. Count Numbers
        int[] sampleNums = {2, -3, 0, 4, -1, 0, 5};
        int[] counts = ex.countNumbers(sampleNums);
        System.out.println("\nPositive: " + counts[0] + ", Negative: " + counts[1] + ", Zero: " + counts[2]);

        // 6. Find Min and Max
        int[] numbers = {9, 3, 12, -4, 0, 5};
        int[] minMax = ex.findMinMax(numbers);
        System.out.println("\nMin: " + minMax[0] + ", Max: " + minMax[1]);

        // 7. One's Complement
        String binary1 = "1100";
        String onesComp = ex.onesComplement(binary1);
        System.out.println("\nOne's Complement of " + binary1 + " = " + onesComp);

        // 8. Two's Complement
        String binary2 = "1100";
        String twosComp = ex.twosComplement(binary2);
        System.out.println("Two's Complement of " + binary2 + " = " + twosComp);

        // 9. Fibonacci
        System.out.println("\nFibonacci Series (first 10 terms):");
        int[] fib = ex.fibonacci(10);
        for (int num : fib) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 10. Find Numbers Divisible by 9 (100 to 200)
        int[] result = ex.findDivisibleBy9();
        System.out.println("\nBetween 100 and 200:");
        System.out.println("Count divisible by 9 = " + result[0]);
        System.out.println("Sum = " + result[1]);
       
        
    }
}



