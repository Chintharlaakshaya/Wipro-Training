package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringPrograms sp = new StringPrograms();
        
        Scanner sc = new Scanner(System.in);

        // 1. Replace First Vowel with '-'
        System.out.print("Enter a string to replace first vowel with '-': ");
        String input1 = sc.nextLine();
        System.out.println("Result: " + sp.replaceVowel(input1));

        // 2. Concatenate two strings
        System.out.print("Enter first string to concatenate: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.println("Concatenated: " + sp.concatenate(str1, str2));

        // 3. Remove spaces
        System.out.print("Enter a string with spaces: ");
        String input3 = sc.nextLine();
        System.out.println("Without spaces: " + sp.removeSpaces(input3));

        // 4. Count letters, digits, and special characters
        System.out.print("Enter a string to count letters, digits, specials: ");
        String input4 = sc.nextLine();
        int[] result = sp.count(input4);
        System.out.println("Letters: " + result[0]);
        System.out.println("Digits: " + result[1]);
        System.out.println("Special Characters: " + result[2]);
        
        //5
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        char result1 = sp.HighestFreqChar(input);  // ✅ now works perfectly

        
        System.out.println("Highest frequency character: " + result1);
      
    }
}
