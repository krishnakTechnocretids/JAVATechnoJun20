/*Assi34 : Program 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove*/
package madhuraMJun20.assignment30Plus;

import java.util.ArrayList;

public class ArrayListRemove {
	void removeWord(ArrayList<String> names) {
		for (int index = 0; index < names.size(); index++) {
			if (names.get(index) == ("Techno")) {
				names.remove(index);
			}
		}
		System.out.println(names);
	}

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Maulik");
		names.add("Techno");
		names.add("Krishna");
		names.add("Techno");
		names.add("Credits");
		names.add("Techno");

		new ArrayListRemove().removeWord(names);
	}
}