package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.test.SqlOperations;

class TestOperations {
	SqlOperations s=new SqlOperations();
	
	/*@BeforeAll
	public void beforealltest() {
		System.out.println("Testing test cases before...");
		
	}*/
	@BeforeAll
    public static void beforealltest() {
        System.out.println("Testing test cases before...");
    }
	@BeforeEach
    public void setup() {
        s.connect(); 
    }
	

	

	@Test
	public void testinsert()  {
		s.insert();
		try {
			 String query = "SELECT * FROM pandavas WHERE id = ?";
			 PreparedStatement stmt = s.con.prepareStatement(query);
	            stmt.setInt(1, 99);
	            ResultSet rs = stmt.executeQuery();

	            assertTrue(rs.next());
	            assertEquals("Draupadi", rs.getString("name"));
	            assertEquals("Bow", rs.getString("weapon"));
	            assertEquals(60, rs.getInt("strength"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
    void testUpdate() {
        s.update();

        try {
            String query = "SELECT strength FROM pandavas WHERE id = ?";
            PreparedStatement stmt = s.con.prepareStatement(query);
            stmt.setInt(1, 6);
            ResultSet rs = stmt.executeQuery();

            assertTrue(rs.next());
            assertEquals(90, rs.getInt("strength"));
        }
        catch(Exception e) {
        	e.printStackTrace();
		}
        
	}
	@Test
    void testDelete() {
        s.delete();

        try {
            String query = "SELECT * FROM pandavas WHERE id = ?";
            PreparedStatement stmt = s.con.prepareStatement(query);
            stmt.setInt(1, 6);
            ResultSet rs = stmt.executeQuery();

            assertFalse(rs.next());
        }
        catch(Exception e) {
        	e.printStackTrace();
		}
        
		
		
	}
	

}
