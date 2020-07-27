/*
Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4
 */
package shrutiDJun20_CollectionFramework;

import java.util.ArrayList;

public class ReplaceFromList {

	void replaceWord() {

		ArrayList<String> nameArrList = new ArrayList<>();

		nameArrList.add("Maulik");
		nameArrList.add("Techno");
		nameArrList.add("Krishna");
		nameArrList.add("Techno");
		nameArrList.add("Credits");
		nameArrList.add("Techno");
		int count = 0;
		System.out.print("Techno word index in given arrayList is ");
		for (int index = 0; index < nameArrList.size(); index++) {
			if (nameArrList.contains("Techno")) {
				System.out.print(nameArrList.indexOf("Techno") + " ");
				nameArrList.set(nameArrList.indexOf("Techno"), "Credits");
			}
		}

		for (int index = 0; index < nameArrList.size(); index++) {
			if (nameArrList.get(index) == "Credits") {
				count++;
			}
		}
		System.out.println();
		System.out.println("Required Output--> " + nameArrList);
		System.out.println("Total Credits words :-" + count);
	}

	public static void main(String[] args) {
		ReplaceFromList replaceFromList = new ReplaceFromList();
		replaceFromList.replaceWord();

	}

}