package technoCredits.collectionDemo.list;

import java.util.ArrayList;

public class Example2 {

	void removeOperation() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Maulik"); //0
		names.add("Krishna"); // 1
		names.add("Techno"); // 2
		names.add("Aavruti");// 3
		names.add("Anup");// 4


		System.out.println("Original :" + names);
		System.out.println(names.remove(2)); // Index // Techno
		System.out.println("New " + names); // 4
		
		System.out.println("Size is" + names.size());
		System.out.println("Original :" + names);
		names.remove("Maulik1"); // Object // 3
		System.out.println("New " + names);
		System.out.println("Size is" + names.size());
	
		System.out.println("-------------------");
		System.out.println(names.remove("Harsh"));
		
	
	}
	
	public static void main(String[] args) {
		new Example2().removeOperation();
	}
}
