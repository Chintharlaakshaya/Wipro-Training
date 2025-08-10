package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
	      Set<String> fruits = new HashSet<>();
	       fruits.add("Apple");
	       fruits.add("Banana");
	       fruits.add("Apple"); // Duplicate - won't be added
	       fruits.add("Orange");
	       fruits.add("Mango");
	       fruits.add("Pomegranate");
	       
	       fruits.add("Blueberry");
	        fruits.add("Grapes");
	        fruits.add("Guava");
	        fruits.add(null);
			fruits.add(null);
			fruits.add(null);
			fruits.add("Mango");
	        fruits.add("PineApple");
	        fruits.add("Papaya");
			fruits.add("Pomegranate");
			//No compilation error will be shown
			fruits.add("Apple"); // Duplicate - won't be added
	        fruits.add("Apple"); // Duplicate - won't be added
	        fruits.add("Apple"); // Duplicate - won't be added
	        fruits.add("Apple"); // Duplicate - won't be added
	        fruits.add("Apple"); // Duplicate - won't be added

	 
	       System.out.println("Fruits set: " + fruits);
	   }

}
