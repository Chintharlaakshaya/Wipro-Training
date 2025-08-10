package main.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Assesment {
	public Connection con = null;
	 
    public void connect() throws SQLException {
    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "manager");
    }
 
    public int insertStudent(int id, String name) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("INSERT INTO student VALUES (?, ?)");
        stmt.setInt(1, id);
        stmt.setString(2, name);
        return stmt.executeUpdate();
    }
 
    public int updateStudent(int id, String newName) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("UPDATE student SET name=? WHERE id=?");
        stmt.setString(1, newName);
        stmt.setInt(2, id);
        return stmt.executeUpdate();
    }
 
    public int deleteStudent(int id) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("DELETE FROM student WHERE id=?");
        stmt.setInt(1, id);
        return stmt.executeUpdate();
    }
 
    public void closing() throws SQLException {
        if (con != null) con.close();
    }

}
