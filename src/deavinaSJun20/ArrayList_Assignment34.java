package deavinaSJun20;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Program 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove
 */
public class ArrayList_Assignment34 {

	void removeElements(ArrayList list) {
		System.out.println("list of input elements : " + list);
		for (int index = 0; index < list.size(); index++) {
			
			if (list.contains("Techno")) {
				list.remove("Techno");
			}
		}
		System.out.println("list of update elements : " + list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList listofinputelements = new ArrayList(
				Arrays.asList("Maulik", "Techno", "Krishna", "Techno", "Credits", "Techno"));
		new ArrayList_Assignment34().removeElements(listofinputelements);
	}
}
