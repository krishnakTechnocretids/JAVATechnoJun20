/*Assignment 36 : 31st July 2020

Remove duplicate names from given String Array, print names in given format with its length. Input Order has to be maintained.
String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}

Output : 	Aashtha -> 7
            Kartikey -> 8
            Piyush -> 6
	      	Raj -> 3
	      	Suparna -> 7
	      	Barkha -> 6
Total unique elements are :- 6

Note: Use set interface. */

package vireshJJun20.assignment36;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx1 {

	static Set<String> convertIntoLinkedHashSet(String input[]) {
		System.out.println("Input Array : " + Arrays.toString(input));
		Set<String> tempSet = new LinkedHashSet<String>(input.length);
		for (int index = 0; index < input.length; index++) {
			tempSet.add(input[index]);
		}
		System.out.println("Resultant LinkedHashSet: " + tempSet);
		return tempSet;
	}

	static void countElementLength(LinkedHashSet<String> linkedHSet) {
		for (String name : linkedHSet) {
			System.out.println(" - " + name + " -> " + name.length());
		}
	}

	public static void main(String[] args) {
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		Set<String> newSet = convertIntoLinkedHashSet(input);
		countElementLength((LinkedHashSet<String>)newSet);
		System.out.println("Total unique elements are :- " + newSet.size());
	}
}
