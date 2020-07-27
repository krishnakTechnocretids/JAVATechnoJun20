package shrutiDJun20CollectionFramework;

import java.util.ArrayList;

public class Ex1 {

	void m1() {

		int[] nums = new int[10];

		ArrayList<Object> listOfElement = new ArrayList<Object>(); 
		listOfElement.add("1...");
		listOfElement.add("2...");
		listOfElement.add("3...");
		listOfElement.add("4...");
		listOfElement.add("5...");
		//listOfElement.add(new Ex1());
		System.out.println(listOfElement); //[1..., 2..., 3..., 4..., 5...]
		
		

		for(int index = 0; index< listOfElement.size(); index++){
			
		System.out.println(listOfElement.get(index));
		}
	}

	public static void main(String[] args) {
		Ex1 e = new Ex1();
		e.m1();
	}

}
