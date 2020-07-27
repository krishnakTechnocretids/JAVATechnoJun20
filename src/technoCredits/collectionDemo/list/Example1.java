package technoCredits.collectionDemo.list;

import java.util.ArrayList;

public class Example1 {

	void m1() {
		int[] nums = new int[10];
		
		ArrayList<Integer> listOfElements = new ArrayList<Integer>(); // 1.5 Java Generic
		listOfElements.add(10); // 0
		listOfElements.add(20); // 1
		listOfElements.add(12); // 2
		listOfElements.add(20);
		// true /// false
		
		//System.out.println(listOfElements.get(2));
		//System.out.println(listOfElements);
		
		System.out.println("Total number of elements " + listOfElements.size());
		
		for(int index=0;index<listOfElements.size();index++) {
			System.out.println(listOfElements.get(index));
		}
		
		
	}
	public static void main(String[] args) {
		new Example1().m1();
	}
}
