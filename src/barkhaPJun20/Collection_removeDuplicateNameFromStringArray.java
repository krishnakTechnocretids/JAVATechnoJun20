/*Remove duplicate names from given String Array, print names in given format with its length. Input Order has to be maintained.
String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}

Output : Aashtha -> 7
              Kartikey -> 8
              Piyush -> 6
	      Raj -> 3
	      Suparna -> 7
	      Barkha -> 6
Total unique elements are :- 6

Note: Use set interface. */
package barkhaPJun20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection_removeDuplicateNameFromStringArray {

	void removeDuplicateNames(String[] names) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		for (int index = 0; index < names.length; index++) {
			linkedHashSet.add(names[index]);
		}
		Iterator<String> iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();

			System.out.println(name + "--> " + name.length());
		}
	}
	public static void main(String[] args) {
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		System.out.println("Input Array is: " + Arrays.toString(input));
		new Collection_removeDuplicateNameFromStringArray().removeDuplicateNames(input);
	}
}