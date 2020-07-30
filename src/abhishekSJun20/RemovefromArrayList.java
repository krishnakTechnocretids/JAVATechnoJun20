package abhishekSJun20;

import java.util.ArrayList;

/*Assignment - 34 :  25th July 2020
Program 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove
*/
public class RemovefromArrayList {
	void removeString(ArrayList<String> name) {
		while (name.contains("Techno")) {
			name.remove("Techno");
		}
		System.out.println("Final Array List : " + name);
	}

	public static void main(String[] args) {
		RemovefromArrayList removeStringByArrayList = new RemovefromArrayList();
		ArrayList<String> name = new ArrayList<String>();
		name.add("Maulik");
		name.add("Techno");
		name.add("Krishna");
		name.add("Techno");
		name.add("Credits");
		name.add("Techno");

		System.out.println("Input ArrayList : " + name);
		removeStringByArrayList.removeString(name);
	}
}