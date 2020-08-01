
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
package rachanaGJun20.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		String[] input = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"};
		Set<String> s1 = new LinkedHashSet<String>(Arrays.asList(input));
		for(String name : s1) {
			System.out.println(name +" -> "+name.length());
		}
		System.out.println("Total unique elements are :- "+s1.size());
	}
}
