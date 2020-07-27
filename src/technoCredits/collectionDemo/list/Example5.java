package technoCredits.collectionDemo.list;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Example5 {

	void addOperationAtSpecitIndex() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Maulik"); //0
		names.add("Krishna"); // 1
		names.add("Techno"); // 2
		names.add("Aavruti");// 3
		names.add("Anup");// 4

		System.out.println(names.indexOf("Raj")); // -1
	    System.out.println(names.contains("Abhishek"));
	    
	    System.out.println(names);
	    names.clear();
	    System.out.println(names);
	}
	
	
	public static void main(String[] args) {
		new Example5().addOperationAtSpecitIndex();
	}
}
