package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementImpl {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/your_database"; // Replace with your DB URL
	    String user = "root";
	    String password = "manager";
	    
	    try {
	    	Connection con=DriverManager.getConnection(url, user, password);
	    	System.out.println("Connection established.");
	    	
	    	//insert
	    	String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement pstmtInsert = con.prepareStatement(insertSQL);
            //1
            pstmtInsert.setString(1, "Bheem");
            pstmtInsert.setString(2, "bheem@example.com");
            int rows1 = pstmtInsert.executeUpdate();
            
            //2
            pstmtInsert.setString(1, "Nakul");
            pstmtInsert.setString(2, "nakul@example.com");
            int rows2 = pstmtInsert.executeUpdate();
            
            System.out.println((rows1 + rows2) + " row(s) inserted.");
            
            // UPDATE
            String updateSQL = "UPDATE users SET name = ? WHERE email = ?";
            PreparedStatement pstmtUpdate = con.prepareStatement(updateSQL);
            pstmtUpdate.setString(1, "Bheem ");
            pstmtUpdate.setString(2, "alice@example.com");
            int rowsUpdated = pstmtUpdate.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");
            
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
            
            
            
            
	    
	       
	       
	       
	    

	}

}
