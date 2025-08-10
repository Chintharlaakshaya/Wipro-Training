package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

class CustomerMain{
	public static void main(String[] args) {
		ArrayList<Customer> obj=new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		//adding the customer data
		obj.add(new Customer(1001,"Ram",9991237771L,"Hyderabad"));
		obj.add(new Customer(1002,"Laxman",9999999999L,"Banglore"));
		obj.add(new Customer(1003,"Sitha",9999999998L,"Mumbai"));
		obj.add(new Customer(1004,"Oormila",9999999978L,"Pune"));
		
		//Collections.sort(<obj>);
		
		Iterator<Customer> iterator = obj.iterator();
		System.out.println("Customers in the list:");
        while (iterator.hasNext()) {
            Customer list = iterator.next();
            System.out.println(list);
		}   
		
		/*obj.remove(3);
        
		System.out.println("\nAfter removing customer at index 3:");
		for (Customer list : obj) {
		    System.out.println(list);*/
        
        System.out.print("\nEnter customer ID to remove: ");
        int removeId = scanner.nextInt();

        boolean removeid = false;
        
        Iterator<Customer> iterator1 = obj.iterator();
        while (iterator1.hasNext()) {
            Customer c = iterator1.next();
            if (c.getId() == removeId) {
                iterator1.remove();  
                removeid = true;
                System.out.println("Customer with ID " + removeId + " removed successfully.");
                break;
            }
        }

        if (!removeid) {
            System.out.println("Customer with ID " + removeId + " not found.");
        }
        
        System.out.println("Updated customer list:");
        Iterator<Customer> updatedIterator = obj.iterator();
        while (updatedIterator.hasNext()) {
            System.out.println(updatedIterator.next());
            
	}
		
}
}


