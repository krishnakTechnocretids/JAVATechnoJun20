/* Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4*/

package anshuKJun20;

import java.util.ArrayList;

public class DisplayIndexOfString {

	void findIndexOfGivenString(ArrayList<String> name) {
		int strCount = 0, strIndex = 0;
		while (name.contains("Techno")) {
			strIndex = name.indexOf("Techno");
			System.out.println(" Index of Techno in given ArrayList is = " + strIndex + ",");
			name.set(strIndex, "Credits");
			strCount++;
		}

		System.out.println(" Credits comes " + strCount + " times. ");
		System.out.println(" Final ArrayList = " + name);
	}

	public static void main(String[] args) {
		DisplayIndexOfString dispalyIndexOfString = new DisplayIndexOfString();
		ArrayList<String> name = new ArrayList<String>();
		name.add("Maulik");
		name.add("Techno");
		name.add("Krishna");
		name.add("Techno");
		name.add("Credits");
		name.add("Techno");

		System.out.println("Original ArrayList = " + name);
		dispalyIndexOfString.findIndexOfGivenString(name);
	}
}
