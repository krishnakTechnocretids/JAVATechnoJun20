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

package maheshKJun20.CollectionFramework.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNameFromArray {
	
	void displayLengthOfUniqueElements(String[] input) {
		System.out.println("Input: " + Arrays.asList(input));
		Set<String> names = new LinkedHashSet<String>(Arrays.asList(input));
		System.out.print("Output : ");
		for(String name: names) {
			System.out.println(name + " -> " + name.length());
		}
		System.out.println("Total unique elements are :- " + names.size());
	}
	
	public static void main(String[] args) {
		String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"};
		new RemoveDuplicateNameFromArray().displayLengthOfUniqueElements(input);
	}

}
