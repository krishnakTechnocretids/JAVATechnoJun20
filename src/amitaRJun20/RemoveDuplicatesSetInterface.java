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

package amitaRJun20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesSetInterface {

	void displayLengthOfElements(String[] input) {
		Set<String> nameList = new LinkedHashSet<String>(Arrays.asList(input));
		System.out.println("\nOuput : Length of each element ");
		Iterator<String> itr = nameList.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name + " --> " + name.length());
		}
		System.out.println("\nTotal unique elements are : " + nameList.size());
	}

	public static void main(String[] args) {
		String[] input = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		System.out.println("Input List : " + Arrays.toString(input));
		new RemoveDuplicatesSetInterface().displayLengthOfElements(input);
	}
}