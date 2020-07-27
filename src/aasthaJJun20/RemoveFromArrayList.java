package aasthaJJun20;

/*Assignment - 34 :  25th July 2020
Program 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove
*/
import java.util.ArrayList;

public class RemoveFromArrayList {
	void removeGivenWordFromArrayList(ArrayList<String> names, String removeName) {
		System.out.println("\nInput ArrayList : " + names);
		if (names.contains(removeName)) {
			while (names.contains(removeName))
				names.remove(removeName);
			System.out.println("ArrayList After removing \"" + removeName + "\" : " + names);
		} else
			System.out.println("\"" + removeName + "\" is not present in input arrayList");
	}

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Maulik");
		names.add("Techno");
		names.add("Krishna");
		names.add("Techno");
		names.add("Credits");
		names.add("Techno");
		new RemoveFromArrayList().removeGivenWordFromArrayList(names, "Aastha");
		System.out.println();
		new RemoveFromArrayList().removeGivenWordFromArrayList(names, "Techno");
	}
}
