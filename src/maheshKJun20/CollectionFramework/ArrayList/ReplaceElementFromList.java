/*
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4
*/

package maheshKJun20.CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceElementFromList {
	
	void replaceElement(ArrayList list, String elementToReplace,String newElement) {
		int count = 0;
		for (int index=0;index<list.size();index++) {
			if (list.get(index).equals(elementToReplace)) {
				if (count == 0)
					System.out.print("Techno word index in given arrayList is: " + list.indexOf(elementToReplace));
				else
					System.out.print(", " + list.indexOf(elementToReplace));
				list.set(list.indexOf(elementToReplace), newElement);
				count++;
			}else if (list.get(index).equals(newElement)) {
				count++;
			}
		}
		System.out.println("\nNew list: " + list + "\nTotal " + newElement + " words: " + count);
	}
	
//	void replaceElement(ArrayList list, String elementToReplace,String newElement){
//		int count = 0;
//		while(list.contains(elementToReplace)) {
//			if (count == 0)
//				System.out.print("Techno word index in given arrayList is: " + list.indexOf(elementToReplace));
//			else
//				System.out.print(", " + list.indexOf(elementToReplace));
//			list.set(list.indexOf(elementToReplace), newElement);
//			count ++;
//		}
//		System.out.println("\nNew list: " + list + "\nTotal " + newElement + " words: " + countOfElement(list, newElement));
//	}
//	
//	int countOfElement(ArrayList list, String elementToCount) {
//		int count = 0;
//		for (int index=0;index<list.size();index++) {
//			if (list.get(index).equals(elementToCount)) {
//				count++;
//			}
//		}
//		return count;
//	}
//	
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList(Arrays.asList("Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"));
		new ReplaceElementFromList().replaceElement(list, "Techno", "Credits");
	}

}
