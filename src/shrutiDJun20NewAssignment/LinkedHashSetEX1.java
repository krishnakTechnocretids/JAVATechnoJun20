package shrutiDJun20NewAssignment;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEX1 {
	
	void removeDuplicate(LinkedHashSet<String> nameSet, String[] input ){
		for(int index=0;index<input.length;index++){
			nameSet.add(input[index]);
		}
		Iterator<String> tempName = nameSet.iterator();
		while(tempName.hasNext()){
			String tempName2 = tempName.next();
			System.out.println(tempName2 +" -> "+ tempName2.length());
		}
		System.out.println("Total unique elements are :- "+ nameSet.size());	
	}

	public static void main(String[] args) {
		String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"};
		LinkedHashSet<String> nameSet = new LinkedHashSet<String>();
		
		LinkedHashSetEX1 linkedHashSetEX1 = new LinkedHashSetEX1();
		linkedHashSetEX1.removeDuplicate(nameSet, input);	
	}
}
