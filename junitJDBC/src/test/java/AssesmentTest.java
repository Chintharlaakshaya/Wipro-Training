package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.sql.Connection;

import main.test.Assesment;


public class AssesmentTest {
	static Assesment assess;
    static Connection con;
 
    @BeforeEach
    public void setUp() throws Exception {
        assess = new Assesment();
        assess.connect();
        System.out.println("Connection created....");
    }
 
    @Test
    public void testInsertStudent() throws Exception {
        int result = assess.insertStudent(1, "Akshaya");
        assertEquals(1, result);
    }
 
    @Test
    public void testUpdateStudent() throws Exception {
        assess.insertStudent(2, "Ashwitha");
        int result = assess.updateStudent(2, "Appu");
        assertEquals(1, result);
    }
 
    @Test
    public void testDeleteStudent() throws Exception {
        assess.insertStudent(3, "Vanitha");
        int result = assess.deleteStudent(3);
        assertEquals(1, result);
    }
 
    @AfterEach
    public void closing() throws Exception {
        assess.closing();
    }


}
