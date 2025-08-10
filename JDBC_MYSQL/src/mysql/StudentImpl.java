package mysql;

import java.util.Scanner;

public class StudentImpl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter");
		
		
		InsertingRecord inserting = new InsertingRecord();
        DeletingRecord deleting = new DeletingRecord();
        UpdatingRecord updating = new UpdatingRecord();
        DisplayRecords displaying = new DisplayRecords();
        
        int choice;

        do {
            System.out.println("\nEmployee Menu");
            System.out.println("==================");
            System.out.println("1. Insert a new Record");
            System.out.println("2. Delete a record");
            System.out.println("3. Update the record");
            System.out.println("4. Display all the records");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inserting.insertData();
                    break;
                case 2:
                    deleting.deleteRecord();
                    break;
                case 3:
                    updating.updateRecord();
                    break;
                case 4:
                    displaying.displayAllMethods();  // needs to be implemented
                    break;
                case 5:
                    System.out.println("!!!!!Exiting... From the DATABASE!!!!!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-5.");
            }

        } while (choice != 5);

        sc.close();
        
		
	}

}
