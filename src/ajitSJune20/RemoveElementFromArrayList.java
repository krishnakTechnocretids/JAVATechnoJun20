/*Assignment - 34 :  25th July 2020
Program 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]*/
package ajitSJune20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveElementFromArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> namesList = new ArrayList<String>(
				Arrays.asList("Maulik", "Techno", "Krishna", "Techno", "Credits", "Techno"));
		System.out.println("Original ArrayList Size : " + namesList.size());
		System.out.println(namesList);

		namesList.removeIf(result -> result.equals("Techno"));
		//namesList.removeAll(Collections.singleton("Techno"));
		System.out.println("New ArrayList Size : " + namesList.size());
		System.out.println(namesList);

	}
}