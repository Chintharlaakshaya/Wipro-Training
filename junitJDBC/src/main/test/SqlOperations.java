/*package main.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class SqlOperations {
	public  void sqlOperations() {
	String url = "jdbc:mysql://localhost:3306/world";    
    String username = "root";
    String password = "manager";
     try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 Connection con=DriverManager.getConnection(url, username, password);
    	 System.out.println("Connection established.");
    	 //insert
    	 String insert="insert into pandavas(id,name,weapon,strength) values (?,?,?,?)";
    	 PreparedStatement pstmt = con.prepareStatement(insert);
    	 pstmt.setInt(1, 6);
    	 pstmt.setString(2, "Draupadi");
    	 pstmt.setString(3, "Bow");
    	 pstmt.setInt(4, 60);
    	 pstmt.executeUpdate();
    	 System.out.println("Inserted successfully");
    	 
    	 //update
    	 String update="update pandavas set strength=? where id=?";
    	 PreparedStatement pstmtupdate = con.prepareStatement(update);
    	 pstmtupdate.setInt(1, 90);
    	 pstmtupdate.setInt(2, 6);
    	 pstmtupdate.executeUpdate();
         System.out.println(" Updated successfully");
         
         //delete
         String delete = "DELETE FROM pandavs WHERE id = ?";
         PreparedStatement pstmtdelete = con.prepareStatement(delete);
         pstmtdelete.setInt(1, 6);
         pstmtdelete.executeUpdate();
         System.out.println("Deleted successfully");
    	 
    	 con.close();
    	 
     }
     catch(Exception e) {
    	 e.printStackTrace();
     }
	}

}*/


package main.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SqlOperations {
     public Connection con;

    public void connect() {
        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "manager";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established.");
        } catch (Exception e) {
            e.printStackTrace();  // only one try-catch
        }
    }

    public void insert() {
        String insert = "INSERT INTO pandavas(id, name, weapon, strength) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(insert)) {
            pstmt.setInt(1, 6);
            pstmt.setString(2, "Draupadi");
            pstmt.setString(3, "Bow");
            pstmt.setInt(4, 60);
            pstmt.executeUpdate();
            System.out.println("Inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
		
    }

    public void update() {
        String update = "UPDATE pandavas SET strength = ? WHERE id = ?";
        try (PreparedStatement pstmt = con.prepareStatement(update)) {
            pstmt.setInt(1, 90);
            pstmt.setInt(2, 6);
            pstmt.executeUpdate();
            System.out.println("Updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        String delete = "DELETE FROM pandavas WHERE id = ?";
        try (PreparedStatement pstmt = con.prepareStatement(delete)) {
            pstmt.setInt(1, 6);
            pstmt.executeUpdate();
            System.out.println("Deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (con != null) con.close();
            System.out.println("Connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


  
	    
	
	



