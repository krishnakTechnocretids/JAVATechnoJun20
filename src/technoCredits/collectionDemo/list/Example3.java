package technoCredits.collectionDemo.list;

import java.util.ArrayList;

public class Example3 {

	void removeOnInt() {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>(); // 1.5 Java Generic
		listOfNumbers.add(100); 
		listOfNumbers.add(13);
		listOfNumbers.add(33);
		listOfNumbers.add(40);
		listOfNumbers.add(3);
		
		System.out.println("ORG list -> " + listOfNumbers);
		listOfNumbers.remove(3); // 40
		System.out.println("listOfNumbers.remove(3) list -> " + listOfNumbers);
		listOfNumbers.remove(new Integer(3)); // number 3
		System.out.println("Final list -> " + listOfNumbers);	
		
		listOfNumbers.add(6,1000); //0 -> 4, 0 -> 4 + 1
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Example3().removeOnInt();
	}
	
}
