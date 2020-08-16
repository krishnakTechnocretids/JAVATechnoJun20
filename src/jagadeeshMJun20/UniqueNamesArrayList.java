/*Remove duplicate names from given String Array, print names in given format with its length.
 *  Input Order has to be maintained.
String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}

Output : Aashtha -> 7
              Kartikey -> 8
              Piyush -> 6
	      Raj -> 3
	      Suparna -> 7
	      Barkha -> 6
Total unique elements are :- 6
Note: Use set interface. */
package jagadeeshMJun20;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class UniqueNamesArrayList {
	void displayNames(String[] input) {
		LinkedHashSet<String> names = new LinkedHashSet<String>(Arrays.asList(input)); 
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			String temp = itr.next();
			System.out.println(temp +" --> "+temp.length());	
		}
		System.out.println("Total unique elements are :- "+names.size());
	}
	public static void main(String[] agrs) {
		String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"};
		new UniqueNamesArrayList().displayNames(input);
	}
}
