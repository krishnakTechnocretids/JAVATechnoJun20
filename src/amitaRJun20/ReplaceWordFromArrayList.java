/*Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4*/

package amitaRJun20;

import java.util.ArrayList;

public class ReplaceWordFromArrayList {

	void displayIndexAndReplace(ArrayList<String> listOfElements, String wordToReplace, String replaceWordWith) {
		System.out.println("The Given ArrayList is : " + listOfElements);
		System.out.print("\nIndex of word " + wordToReplace + " in Given Arraylist is : ");
		int count = 0;
		while (listOfElements.contains(wordToReplace)) {
			int indexOfWord = listOfElements.indexOf(wordToReplace);
			System.out.print(indexOfWord + " , ");
			listOfElements.set(indexOfWord, replaceWordWith);
		}
		System.out.println("\n\nThe updated new Arraylist is : " + listOfElements);

		for (int index = 0; index < listOfElements.size(); index++) {
			if (listOfElements.get(index) == replaceWordWith) {
				count++;
			}
		}
		System.out.println("\nTotal count of word " + replaceWordWith + " in ArrayList is : " + count);
	}

	public static void main(String[] args) {
		ArrayList<String> listOfElements = new ArrayList<String>();
		listOfElements.add("Maulik");
		listOfElements.add("Techno");
		listOfElements.add("Krishna");
		listOfElements.add("Techno");
		listOfElements.add("Credits");
		listOfElements.add("Techno");
		String wordToReplace = "Techno";
		String replaceWordWith = "Credits";
		new ReplaceWordFromArrayList().displayIndexAndReplace(listOfElements, wordToReplace, replaceWordWith);
	}
}
