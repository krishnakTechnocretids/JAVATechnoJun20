package vaishnaviVJun20_Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* Assignment 36 : 31st July 2020

Remove duplicate names from given String Array, print names in given format with its length. Input Order has to be maintained.
String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}

Output : Aashtha -> 7
              Kartikey -> 8
              Piyush -> 6
	      Raj -> 3
	      Suparna -> 7
	      Barkha -> 6
Total unique elements are :- 6

Note: Use set interface.  */

public class RemoveDuplicates {

	void removeDuplicates(String[] input) {
		Set<String> set = new LinkedHashSet<String>();
		for (String name : input) {
			set.add(name);
		}
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String temp = itr.next();
			System.out.println(temp + "--> " + temp.length());
		}
		System.out.println("Total Unique elements are: " + set.size());
	}

	public static void main(String[] args) {
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		new RemoveDuplicates().removeDuplicates(input);
	}

}
