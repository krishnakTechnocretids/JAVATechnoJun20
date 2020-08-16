package archanaNJun20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNames {
	void removeDuplicateNamesFromString(String[] input) {
		Set<String> nameString = new LinkedHashSet<>(Arrays.asList(input));
		Iterator<String> iterator = nameString.iterator();
		while (iterator.hasNext()) {
			String temp=iterator.next();
			System.out.println(temp+"->"+temp.length());
		}
		System.out.println("Total unique elements are :-" + nameString.size());
	}
	public static void main(String[] args) {
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		new RemoveDuplicateNames().removeDuplicateNamesFromString(input);
	}
}