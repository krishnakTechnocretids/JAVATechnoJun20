/*
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output :
Techno word index in given arrayList is 1,3,5
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4
*/

package nikhilMJun20.assignment34;

import java.util.ArrayList;

public class ReplaceAndDisplay {
	void displayIndex(ArrayList strArrayList, String opString) {
		System.out.println("Given ArrayList has "+opString+" on following indexes:-");
		for(int index=0; index < strArrayList.size(); index++) {
			if(strArrayList.get(index) == opString) {
				System.out.print(index+" ");
			}
		}
	}
	
	void replace(ArrayList strArrayList, String opString, String replacementString) {
		int index = 0;
		while(strArrayList.contains(opString)) {
			index = strArrayList.indexOf(opString);
			strArrayList.set(index, replacementString);
		}
	}
	
	void displayOccurrenceCount(ArrayList strArrayList, String replacementString) {
		int count = 0;
		for(int index=0; index < strArrayList.size(); index++) {
			if(strArrayList.get(index) == replacementString) {
				count++;
			}
		}
		System.out.println("\nArrayList contains "+replacementString+"--> "+count+" times");
	}
	
	public static void main(String[] args) {
		ReplaceAndDisplay replaceAndDisplay = new ReplaceAndDisplay();
		ArrayList<String> strArrayList = new ArrayList<String> () {
			{
				add("Maulik");
				add("Techno");
				add("Krishna");
				add("Techno");
				add("Credits");
				add("Techno");
			}
		};
		String opString = "Techno";
		String replacementString = "Credits";
		//Displaying indices of "Techno"
		replaceAndDisplay.displayIndex(strArrayList, opString);
		System.out.println("\n\nOriginal ArrayList is:-\n"+strArrayList.toString());
		//Replacing "Techno" with "Credits"
		replaceAndDisplay.replace(strArrayList, opString, replacementString);
		System.out.println("\nArrayList after replacing "+opString+" with "+replacementString+":-\n"+strArrayList.toString());
		//Displaying number of occurrences of "Credits"
		replaceAndDisplay.displayOccurrenceCount(strArrayList, replacementString);
	}
}
