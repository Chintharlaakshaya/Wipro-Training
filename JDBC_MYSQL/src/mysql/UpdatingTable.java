package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatingTable {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/world";    
        String username = "root";
         String password = "manager";
         
         try {
        	 Class.forName("com.mysql.cj.jdbc.Driver");
        	 Connection con=DriverManager.getConnection(url, username, password);
        	 Statement st = con.createStatement();
        	 
        	 //table
        	 String createTable="CREATE TABLE student1(" +
        			 "name VARCHAR(30),"+
        			 "roll_no int,"+
        			 "age int,"+
        			 "class varchar(20),"+
        			 "address varchar(50))";
        	 st.executeUpdate(createTable);
        	 System.out.println("Tble Craeted Successfully");
        			 
        	//inserting 
        	 String insertQuery="insert into student values "+
        	         "('Ram',1,10,'5th','Hyd'),"+
        	         "('Laxman',2,10,'4th','Hyd'),"+
        	         "('Sita',3,15,'5th','Ayodhya'),"+
        	         "('Oormila',4,16,'8th','Delhi'),"+
        	         "('Ravan',5,19,'9th','Lanka')";
        	 
        	 int count=st.executeUpdate(insertQuery);
        	 System.out.println("Total " + count + " records inserted into the table student");
        	 
        	 //deleting
        	 String deleteQuery="delete from student where roll_no in(2,4)";
        	 int deleted=st.executeUpdate(deleteQuery);
        	 System.out.println("Deleted records: " + deleted);
        	 
        	 //updating
        	 String updateQuery="update student set name='Ayodhya Rama',address='Ayodhya' where roll_no=1";
        	 int updated_Query=st.executeUpdate(updateQuery);
        	 System.out.println("Updated records: " + updated_Query);
        	 
        	
         // 5. Display remaining records
         String selqry = "SELECT * FROM student";
         ResultSet rs = st.executeQuery(selqry);
         System.out.println("\n--- Student Table Data ---");
         while (rs.next()) {
             System.out.println(
                     rs.getInt("roll_no") + ", " +
                     rs.getString("name") + ", " +
                     rs.getInt("age") + ", " +
                     rs.getString("class") + ", " +
                     rs.getString("address"));
         }
         }
         
	     catch (ClassNotFoundException e) {
           System.err.println("JDBC Driver not found: " + e.getMessage());
        }  
         catch (SQLException e) {
        System.err.println("SQL Error: " + e.getMessage());
    }
	}

}

