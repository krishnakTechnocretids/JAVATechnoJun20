/*
Assignment 36 : 31st July 2020

Remove duplicate names from given String Array, print names in given format with its length. Input Order has to be maintained.
String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}

Output : Aashtha -> 7
Kartikey -> 8
Piyush -> 6
Raj -> 3
Suparna -> 7
Barkha -> 6
Total unique elements are :- 6

Note: Use set interface.
*/

package nikhilMJun20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateStrings {
	Set<String> getUniqueElements(String[] input) {
		Set<String> uniqueSet = new LinkedHashSet<String>();
		for(String name: input) {
			uniqueSet.add(name);
		}
		return uniqueSet;
	}
	
	static void display(Set<String> uniqueSet) {
		Iterator<String> itr = uniqueSet.iterator();
		String name = "";
		System.out.println("\nUnique string elements - along with their lengths - from the given array of strings are:-");
		while(itr.hasNext()) {
			name = itr.next();
			System.out.println(name+" --> "+name.length());
		}
		System.out.println("Total No. of unique elements : "+uniqueSet.size());
	}
	
	public static void main(String[] args) {
		String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"};
		System.out.println("Given input array is:-\n"+Arrays.toString(input));
		Set<String> uniqueSet = new LinkedHashSet<String>(new RemoveDuplicateStrings().getUniqueElements(input));
		display(uniqueSet);
	}
}
