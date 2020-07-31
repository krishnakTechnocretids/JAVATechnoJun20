/*Remove duplicate names from given String Array, print names in given format with its length. Input Order has to be maintained.
	String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}

	Output :  Aashtha -> 7
	          Kartikey -> 8
	          Piyush -> 6
		      Raj -> 3
		      Suparna -> 7
		      Barkha -> 6
	Total unique elements are :- 6*/

package palakSJun20;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterfaceRemoveDuplicateFromString {

	void removeDuplicateString(String[] input) {
		Set<String> setArray = new LinkedHashSet<>(Arrays.asList(input));
		int count = 0;
		System.out.println("Input : "+setArray);

		Iterator<String> it = setArray.iterator();
		System.out.println	("Output: ");
		while (it.hasNext()) {
			String string = it.next();
			System.out.print(string);
			System.out.println("-> " + string.length());
			count++;
		}
		System.out.println("Total Unique Elements are -> " + count);
	}

	public static void main(String[] args) {
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		new SetInterfaceRemoveDuplicateFromString().removeDuplicateString(input);
	}

}
