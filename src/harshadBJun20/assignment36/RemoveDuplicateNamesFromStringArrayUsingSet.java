package harshadBJun20.assignment36;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*Assignment 36 : 31st July 2020

Remove duplicate names from given String Array, print names in given format with its length. Input Order has to be maintained.
String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}

Output : Aashtha -> 7
              Kartikey -> 8
              Piyush -> 6
	      Raj -> 3
	      Suparna -> 7
	      Barkha -> 6
Total unique elements are :- 6

Note: Use set interface. */

public class RemoveDuplicateNamesFromStringArrayUsingSet {

	//To Print names in given format with its length using Iterator
	void removeDuplicateNamesUsingIterator(LinkedHashSet<String> uniqueNameList) {

		Iterator<String> itr= uniqueNameList.iterator();
		String name="";
		System.out.println("Unique names from given String Array with their lengths are:");
		while(itr.hasNext()) {
			name = itr.next();
			System.out.println(name+" -> "+name.length() );
		}
		System.out.println("Total unique elements are:"+uniqueNameList.size());
	}

	//To Print names in given format with its length using Enhanced for loop
	void removeDuplicateNamesUsingEnhancedForLoop(LinkedHashSet<String> uniqueNameList) {

		System.out.println("Unique names from given String Array with their lengths are:");
		for(String names : uniqueNameList) {
			System.out.println(names+" -> "+names.length() );
		}
		System.out.println("Total unique elements are:"+uniqueNameList.size());
	}
	
	public static void main(String[] args) {
		String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"};
		new RemoveDuplicateNamesFromStringArrayUsingSet().removeDuplicateNamesUsingIterator(new LinkedHashSet<String>(Arrays.asList(input)));
		//new RemoveDuplicateNamesFromStringArrayUsingSet().removeDuplicateNamesUsingEnhancedForLoop(new LinkedHashSet<String>(Arrays.asList(input)));
	}
}
