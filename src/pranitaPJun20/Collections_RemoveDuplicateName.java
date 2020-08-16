/*
 * /*Assignment 36 : 31st July 2020
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

package pranitaPJun20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collections_RemoveDuplicateName {
	void findUniqueElement(LinkedHashSet<String> setOfNames) {
		Iterator<String> iterator = setOfNames.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name+ "-->"+name.length());
		}
		System.out.println("\nTotal Unique Elements are:" +setOfNames.size());
	}

	public static void main(String[] args) {
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		LinkedHashSet<String> setOfNames = new LinkedHashSet<String>(Arrays.asList(input));
		new Collections_RemoveDuplicateName().findUniqueElement(setOfNames);
		
		/*
		 * Set<String> s1 = new LinkedHashSet<String>(Arrays.asList(input));
		for(String name : s1) {
			System.out.println(name +" -> "+name.length());
		}
		System.out.println("Total unique elements are :- "+s1.size());
		 */
	}

}
