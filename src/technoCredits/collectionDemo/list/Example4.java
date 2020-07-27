package technoCredits.collectionDemo.list;

import java.util.ArrayList;

public class Example4 {

	void addOperationAtSpecitIndex() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Maulik"); //0
		names.add("Krishna"); // 1
		names.add("Techno"); // 2
		names.add("Aavruti");// 3
		names.add("Anup");// 4

		System.out.println(names.size() + ":" + names);
		names.add(3, "Amita");
		System.out.println(names.size() + ":" + names);
		System.out.println("Return value of set method : " + names.set(3, "Yash"));
		System.out.println(names.size() + ":" + names);
		
		System.out.println(names.set(6, "Viresh"));
	}
	
	
	public static void main(String[] args) {
		new Example4().addOperationAtSpecitIndex();
	}
}
