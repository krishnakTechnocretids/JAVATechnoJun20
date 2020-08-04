package deavinaSJun20;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueStrings {

	public void getuniqueString(String[] input) {
		Set<String> set = new LinkedHashSet<String>(Arrays.asList(input));
		for (String name : set) {
			System.out.println(name + " -> " + name.length());
		}
		System.out.println("Total unique elements are :- " + set.size());
	}

	public static void main(String[] args) {

		String[] input = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		new UniqueStrings().getuniqueString(input);
	}
}
