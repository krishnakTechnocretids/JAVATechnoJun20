package anshuKJun20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateBySet {

	void findUniqueElement(LinkedHashSet<String> setOfNames) {
		/*for (String name : names) {
			System.out.println(name + "---->" + name.length());
		}
		System.out.println("Total Unique Items:" + names.size());
	}*/
		Iterator<String> iterator = setOfNames.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name+ "--->"+name.length());
		}
		System.out.println("Total Unique Elements:" +setOfNames.size());
	}

	public static void main(String[] args) {
		String input[] = { "Aashtha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aashtha", "Barkha" };
		LinkedHashSet<String> setOfNames = new LinkedHashSet<String>(Arrays.asList(input));
		new RemoveDuplicateBySet().findUniqueElement(setOfNames);
	}
}
