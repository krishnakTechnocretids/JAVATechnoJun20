package aavrutiDJun20.collectionPrgm;

import java.util.*;

public class RemoveDuplicateUsingSet {

	//Remove Duplicate, find length of inputs, total unique input
	void removeDuplicate(Set<String> inputSet) {
		Iterator<String> itrInput = inputSet.iterator();

		while(itrInput.hasNext()) {
			String name = itrInput.next();
			System.out.println(name + " --> " + name.length());
		}
		System.out.println("\nTotal unique elements are --> " + inputSet.size());
	}

	public static void main(String[] args) {
		RemoveDuplicateUsingSet removeDuplicateUsingSet = new RemoveDuplicateUsingSet();
		String[] input = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"};
		Set<String> inputSet = new LinkedHashSet<String>(Arrays.asList(input));
		removeDuplicateUsingSet.removeDuplicate(inputSet);
	}
}