package main.java;

public class StringPrograms {
	//1
	public String replaceVowel(String str) {
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if ("aeiouAEIOU".indexOf(ch) != -1) {
	            return str.substring(0, i) + '-' + str.substring(i + 1);
	        }
	    }
	    return str; 
	}
	
	//2
	public String concatenate(String a, String b) {
	    return a + b;
	}
	
	//3
	public String removeSpaces(String str) {
	    return str.replace(" ", "");
	}
	
	//4
	public int[] count(String str) {
	    int letters = 0, digits = 0, specials = 0;

	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if (Character.isLetter(ch)) {
	            letters++;
	        } else if (Character.isDigit(ch)) {
	            digits++;
	        } else {
	            specials++;
	        }
	    }

	    return new int[]{letters, digits, specials};
	}
	
	//5
	
	
	public  char HighestFreqChar(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int max = 0;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

	    
	}


	

	


	
	


	


