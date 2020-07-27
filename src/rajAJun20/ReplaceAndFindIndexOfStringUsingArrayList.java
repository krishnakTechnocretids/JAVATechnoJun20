/*Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4 */


package rajAJun20;

import java.util.ArrayList;

public class ReplaceAndFindIndexOfStringUsingArrayList {

	void replaceAndFindIndexOfStringFromArrayList(ArrayList<String> inputString , String previousStr , String replaceWithNewStr) {
		int count = 0 ;
		System.out.print("Index value of string " + previousStr + " in given ArrayList is : ");
		while(inputString.contains(previousStr)) {
			int position = inputString.indexOf(previousStr);
			System.out.print(position+ " ");
			inputString.set(position , replaceWithNewStr);
		}
		System.out.println("\nArrayList after string replacement is : " +inputString);
		for (int index = 0; index < inputString.size(); index++) {
			if (inputString.get(index).equals(replaceWithNewStr)) {
				count++ ;
			}
		}
		System.out.println("Total count of Credits word is: " + count);
	}

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Maulik");
		arrayList.add("Techno");
		arrayList.add("Krishna");
		arrayList.add("Techno");
		arrayList.add("Credits");
		arrayList.add("Techno");
		System.out.println("Given ArrayList of strings is : " +arrayList);
		String oldStr = "Techno";
		String newStr = "Credits";
		new ReplaceAndFindIndexOfStringUsingArrayList().replaceAndFindIndexOfStringFromArrayList(arrayList, oldStr, newStr);
	}
}
