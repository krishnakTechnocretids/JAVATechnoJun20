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

Note: Use set interface.*/

package swapnaWJun20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateSet {

	void removeDuplicate(String input[]) {
		LinkedHashSet<String> nameSet = new LinkedHashSet<String>(Arrays.asList(input));

		Iterator<String> itr = nameSet.iterator();
		while (itr.hasNext()) {
			String temp = itr.next();
			System.out.println(temp + " --> " + temp.length());
		}
		System.out.println("\nTotal Unique elements are :- " + nameSet.size());
	}

	public static void main(String[] args) {
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		new RemoveDuplicateSet().removeDuplicate(input);
	}
}
