package main.java;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		CollectionsOperations opr=new CollectionsOperations();
		ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Brinjal");
        items.add("kiwi");
        items.add("Grapes");
        items.add("Spinach");
        
        opr.shuffle(items);
        
        //2
        ArrayList<String> items2 = new ArrayList<>();
        items2.add("PC");
        items2.add("Mouse");
        items2.add("Keyboard");
        items2.add("Adaptor");
        items2.add("Table");
        items2.add("Camera");
        items2.add("pendrive");
        List<String> subList = opr.extractPortion(items);
        System.out.println("Original List: " + items);
        System.out.println("Extracted Sublist: " + subList);
        
        //3
        ArrayList<String> items3 = new ArrayList<>();
        items3.add("Apple");
        items3.add("Banana");
        items3.add("Cherry");
        System.out.println("Before replacing: " + items);
        
        opr.replace(items, "Orange");

        System.out.println("After replacing: " + items);
		

	}

}
