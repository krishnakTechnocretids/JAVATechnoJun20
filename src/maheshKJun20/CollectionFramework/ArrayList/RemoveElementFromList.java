/*
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove
*/

package maheshKJun20.CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementFromList {
	
	void removeElement(ArrayList list, String elementToRemove) {
		while (list.contains(elementToRemove)) {
			list.remove(elementToRemove);
		}
		System.out.println("Elements in List after removing all " + elementToRemove + " are: " + list);
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList(Arrays.asList("Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"));
		new RemoveElementFromList().removeElement(list, "Techno");
	}

}
