package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.StringPrograms;

class TestStrings {
	StringPrograms str=new StringPrograms();

	@Test
	public void testReplaceVowel() {
	    assertEquals("h-llo", str.replaceVowel("hello"));
	}
	
	@Test
	public void testConcatenate() {
	    assertEquals("HelloJava", str.concatenate("Ram", "Sitha"));
	}
	
	@Test
	public void testRemoveSpaces() {
	    assertEquals("HelloWorld", str.removeSpaces("Hello World"));
	}






}
