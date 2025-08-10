package mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_Class {
	public Connection getConnection() {
		Connection con=null;
		try {
			String url = "jdbc:mysql://localhost:3306/world";    
	        String username = "root";
	         String password = "manager";
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         con = DriverManager.getConnection(url, username, password);
	         System.out.println("Connection Established Successfully");  
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
