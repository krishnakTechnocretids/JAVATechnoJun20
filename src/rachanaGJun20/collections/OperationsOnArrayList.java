/*names.remove(names.indexOf("Maulik"))

Assignment - 34 :  25th July 2020

Program 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove

Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4*/
package rachanaGJun20.collections;

import java.util.ArrayList;

public class OperationsOnArrayList {

	// method will remove all "Techno" present in givenArraylist
	void removeAllOccuranceOfString(ArrayList<String> list1) {

		ArrayList<String> templist = new ArrayList<String>(list1);
		if (templist.contains("Techno")) {
			for (int loopindex = 0; loopindex < templist.size(); loopindex++) {
				if (templist.get(loopindex) == "Techno") {
					templist.remove(loopindex);
				}
			}
		} else {
			System.out.println("Given ArrayList does not contained any Techno word");
		}
		System.out.println("Remove All Techo From given ArrayList");
		System.out.println(templist);
	}

	// Method will replace every techno word by credits and count total credits word
	void findAndReplaceString(ArrayList<String> list1) {
		int wordCount = 0;
		if (list1.contains("Techno")) {
			for (int loopindex = 0; loopindex < list1.size(); loopindex++) {
				if (list1.get(loopindex) == "Techno") {
					list1.set(loopindex, "Credits");
					wordCount++;
				} else if (list1.get(loopindex) == "Credits") {
					wordCount++;
				}
			}

		} else {
			System.out.println("Given ArrayList does not contained any Techno word");
		}
		System.out.println("Replace All Techno in given Arraylist by Credits");
		System.out.println(list1);
		System.out.println("Total credit Count = " + wordCount);
	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Maulik");
		list1.add("Techno");
		list1.add("Krishna");
		list1.add("Techno");
		list1.add("Credits");
		list1.add("Techno");
		System.out.println(list1);
		OperationsOnArrayList removeElefromArrayList = new OperationsOnArrayList();
		removeElefromArrayList.removeAllOccuranceOfString(list1);
		removeElefromArrayList.findAndReplaceString(list1);

	}

}
