package vaishnaviVJun20_Collection;

import java.util.ArrayList;

/*Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4 */

public class ReplaceString {

	void replaceGivenStringInArrayList(ArrayList<String> arrList, String strToReplace, String strReplaceWith) {
		int count = 0;
		System.out.print("Techno word is present in a given arrayList at index: ");
		while (arrList.contains(strToReplace)) {
			int strIndex = arrList.indexOf(strToReplace);
			System.out.print(strIndex + ",");
			arrList.set(strIndex, strReplaceWith);
		}
		System.out.println("\nOutput arrayList is: " + arrList);

		for (int index = 0; index < arrList.size(); index++) {
			if (arrList.get(index).equals(strReplaceWith)) {
				count++;
			}
		}
		System.out.println("Total count of Credits word is: " + count);
	}

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Maulik");
		arrList.add("Techno");
		arrList.add("Krishna");
		arrList.add("Techno");
		arrList.add("Credits");
		arrList.add("Techno");
		System.out.println("Input ArrayList: " + arrList);
		String strToReplace = "Techno", strReplaceWith = "Credits";
		new ReplaceString().replaceGivenStringInArrayList(arrList, strToReplace, strReplaceWith);

	}

}
