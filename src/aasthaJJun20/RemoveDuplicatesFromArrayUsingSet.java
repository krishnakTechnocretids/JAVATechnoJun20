package aasthaJJun20;
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

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayUsingSet {
	void displayLengthOfUniqueElementsInArray(String[] input) {
		System.out.println("\nOutput :");
		/*
		 * Below declaration with asList() method also results in unique set of elements
		 * in LinkedHashSet. But not sure if its right to use it for Sets:
		 * 
		 * Set<String> setOfNames = new LinkedHashSet<String>(Arrays.asList(input));
		 */
		Set<String> setOfNames = new LinkedHashSet<String>();
		for (String temp : input) {
			setOfNames.add(temp);
		}

		Iterator<String> iterator = setOfNames.iterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			System.out.println(temp + " --> " + temp.length());
		}
		System.out.println("\nTotal unique elements are :- " + setOfNames.size());
	}

	public static void main(String[] args) {
		String[] input = { "Aastha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aastha", "Barkha" };
		System.out.println("Input : " + Arrays.toString(input));
		new RemoveDuplicatesFromArrayUsingSet().displayLengthOfUniqueElementsInArray(input);
	}
}
