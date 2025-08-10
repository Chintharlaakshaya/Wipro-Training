package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.CollectionsOperations;

class TestClass {
	CollectionsOperations opr=new CollectionsOperations();

	@Test
	public void testportion() {
		ArrayList<String> items = new ArrayList<>();
		items.add("PC");
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Adaptor");
        items.add("Table");
        items.add("Camera");
        items.add("pendrive");
        List<String> actual = opr.extractPortion(items);
        
        List<String> expected = List.of("Keyboard","Adaptor","Table");
        assertEquals(expected, actual);
		
	}

}
