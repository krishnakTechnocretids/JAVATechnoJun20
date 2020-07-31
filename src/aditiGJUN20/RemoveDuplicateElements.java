/*
 * Remove duplicate names from given String Array, print names in given format with its length. Input Order has to be maintained.
 * String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}
 * Output : 
 * Aashtha -> 7
 * Kartikey -> 8
 * Piyush -> 6
 * Raj -> 3
 * Suparna -> 7
 * Barkha -> 6
 * Total unique elements are :- 6
*/

package aditiGJUN20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElements {
	void printUniqueList(String[] inputArray) {
		LinkedHashSet<String> uniqueNameList = (LinkedHashSet<String>) removeDuplicates(inputArray);
		Iterator<String> iterateName = uniqueNameList.iterator();
		System.out.println("\n--------------------" + "\nUnique String elements for given String Array: ");
		while (iterateName.hasNext()) {
			String name = iterateName.next();
			System.out.println(name + " -> " + name.length());
		}
	}

	Set<String> removeDuplicates(String[] inputArray) {
		Set<String> uniqueNameList = new LinkedHashSet<String>();
		for (String name : inputArray) {
			uniqueNameList.add(name);
		}
		return uniqueNameList;
	}

	public static void main(String[] args) {
		RemoveDuplicateElements removeDuplicateElements = new RemoveDuplicateElements();
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		System.out.println("Input: " + Arrays.toString(input));
		removeDuplicateElements.printUniqueList(input);
		System.out.println("Total Unique Elements are: " + removeDuplicateElements.removeDuplicates(input).size());
	}
}
