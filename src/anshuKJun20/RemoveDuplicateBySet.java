package anshuKJun20;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateBySet {

	void findUniqueElement(LinkedHashSet<String> names) {
		for (String name : names) {
			System.out.println(name + "---->" + name.length());
		}
		System.out.println("Total Unique Items:" + names.size());
	}

	public static void main(String[] args) {
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		LinkedHashSet<String> names = new LinkedHashSet<String>(Arrays.asList(input));
		new RemoveDuplicateBySet().findUniqueElement(names);
	}
}
