/* Remove duplicate names from given String Array, print names in given format with its length. Input Order has to be maintained.
String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}
Output : Aashtha -> 7
         Kartikey -> 8
         Piyush -> 6
	     Raj -> 3
	     Suparna -> 7
	     Barkha -> 6
Total unique elements are :- 6
Note: Use set interface.  */

package rajAJun20;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNamesUsingSetInterface {

	void showLengthOfUniqueElementsOfArray(String[] inputArray) {
		Set<String> setOfNames = new LinkedHashSet<>();

		for (String temp : inputArray) {
			setOfNames.add(temp);
		}

		Iterator<String> iterator = setOfNames.iterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			System.out.println(temp + " --> " + temp.length());
		}
		System.out.println("\nTotal unique elements are :- " + setOfNames.size());
	}

	public static void main(String[] args) {
		String[] input = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		new RemoveDuplicateNamesUsingSetInterface().showLengthOfUniqueElementsOfArray(input);;
	}
}
