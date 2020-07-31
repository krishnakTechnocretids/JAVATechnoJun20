package archanaNJun20;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNames {
	void removeDuplicateNamesFromString(String[] input) {
		Set<String> nameString = new LinkedHashSet<>();
		for(String name:input) 
			nameString.add(name);
		Iterator<String> iterator = nameString.iterator();
		while (iterator.hasNext()) {
			String temp=iterator.next();
			System.out.println(temp+"->"+temp.length());
		}
	}
	public static void main(String[] args) {
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		new RemoveDuplicateNames().removeDuplicateNamesFromString(input);
	}
}