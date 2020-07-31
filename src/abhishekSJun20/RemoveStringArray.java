package abhishekSJun20;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

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

public class RemoveStringArray {
	void removeDuplictae(String input[]) {
		System.out.println("Input String: " + Arrays.asList(input));
		Set<String> setArray = new LinkedHashSet<>(Arrays.asList(input));
		System.out.print("Output : ");
		for (String name : setArray) {
			System.out.println(name + " -> " + name.length());
		}
		System.out.println("Total unique elements are :- " + setArray.size());
	}

	public static void main(String[] args) {
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		RemoveStringArray removeStringArray = new RemoveStringArray();
		removeStringArray.removeDuplictae(input);
	}
}
