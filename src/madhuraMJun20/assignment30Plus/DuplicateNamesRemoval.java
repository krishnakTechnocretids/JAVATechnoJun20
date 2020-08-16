/*Assignment 36 : 31st July 2020
Remove duplicate names from given String Array, print names in given format with its length. Input Order has to be 
maintained.
String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}

Output : Aashtha -> 7
              Kartikey -> 8
              Piyush -> 6
	      Raj -> 3
	      Suparna -> 7
	      Barkha -> 6
Total unique elements are :- 6

Note: Use set interface. */
package madhuraMJun20.assignment30Plus;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNamesRemoval {
	void removeDuplicate(Set<String> inputSet) {
		// System.out.println(inputSet);
		Iterator<String> itr = inputSet.iterator();
		int count = 0;
		while (itr.hasNext()) {
			count++;
			String temp = itr.next();
			System.out.println(temp + " -> " + temp.length());
		}
		System.out.println("Total unique elements are :- " + count);

	}

	public static void main(String[] agrs) {
		DuplicateNamesRemoval duplicateNamesRemoval = new DuplicateNamesRemoval();
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };

		Set<String> inputSet = new LinkedHashSet<String>(Arrays.asList(input));
		duplicateNamesRemoval.removeDuplicate(inputSet);
	}
}