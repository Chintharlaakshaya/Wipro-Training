package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsOperations {
	//1
	public void shuffle(ArrayList<String>list) {
		System.out.println("Original List: " + list);
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
	}
	
	//2
	public List<String> extractPortion(ArrayList<String> list){
		return list.subList(2, 5);
	}
	
	//3
	public void replace(ArrayList<String>list,String element) {
		if(list.size()>=2) {
			list.set(1, element);
		}
		else
			System.out.println("Invalid list size");
	}

}
