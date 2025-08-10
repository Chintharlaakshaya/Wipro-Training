package mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementExample {
	static Connection con=null;

	public static void main(String[] args) throws Exception {
		try {
			String url = "jdbc:mysql://localhost:3306/world";    
	        String username = "root";
	         String password = "manager";
	         
	      // Load MySQL Type-4 driver class
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         
	         // Establish connection
	         con=DriverManager.getConnection(url, username, password);
	         
	         //Preparing a CallableStateement
	         CallableStatement cstmt=con.prepareCall("{call myProcedure(?,?,?)}");
	         
	         cstmt.setString(1,"Bhim");
	         cstmt.setInt(2, 30000);
	         cstmt.setInt(3, 102);
	         cstmt.execute();
	         
	         cstmt.setString(1,"Arjun");
	         cstmt.setInt(2, 35000);
	         cstmt.setInt(3, 103);
	         cstmt.execute();
	         
	         cstmt.setString(1,"Nakul");
	         cstmt.setInt(2, 39000);
	         cstmt.setInt(3, 104);
	         cstmt.execute();
	         
	        /* cstmt.setString(1,"Sahadev");
	         cstmt.setInt(2, 40000);
	         cstmt.setInt(3, 1004);*/
	         
	        // cstmt.execute();
	         System.out.println("Rows inserted ....");
	         
	   	}
		catch(SQLException se) {
			se.printStackTrace();
	   	}
	         
	         
		
		
		

	}

}
