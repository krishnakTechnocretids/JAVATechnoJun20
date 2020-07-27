/*Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4
*/

package aditiGJUN20;

import java.util.ArrayList;

public class ElementRemovalAndReplaceInArrayList {

	void removeAndReplaceElement(ArrayList<String> inputArrayList, String wordToBeReplaced, String replaceWith) {
		int wordToBeReplacedCount = 0;
		System.out.print(wordToBeReplaced + " word index in given ArrayList is: ");
		while (inputArrayList.contains(wordToBeReplaced)) {
			System.out.print(inputArrayList.indexOf(wordToBeReplaced) + " ");
			inputArrayList.set(inputArrayList.indexOf(wordToBeReplaced), replaceWith);
		}
		System.out.println("\n\nList after replacing " + wordToBeReplaced + " with " + replaceWith + " is: \n"
				+ inputArrayList);
		System.out.println(
				"\nReplaced word " + replaceWith + " count is:" + getElementCount(inputArrayList, replaceWith));
	}

	// Separate method to count occurrence of element in ArrayList - Method can be
	// called directly to count any element or can be called in
	// removeAndReplaceElement() method to count occurrence of replaced word in
	// list.
	int getElementCount(ArrayList<String> inputArrayList, String wordToBeSearched) {
		int wordCount = 0;
		for (int index = 0; index < inputArrayList.size(); index++) {
			if (inputArrayList.get(index).equals(wordToBeSearched)) {
				wordCount++;
			}
		}
		return wordCount;
	}

	public static void main(String[] args) {
		ElementRemovalAndReplaceInArrayList elementRemovalAndReplaceInArrayList = new ElementRemovalAndReplaceInArrayList();
		String[] inputArray = { "Maulik", "Techno", "Krishna", "Techno", "Credits", "Techno" };
		ArrayList<String> inputArrayList = new ArrayList<String>();
		for (int index = 0; index < inputArray.length; index++) {
			inputArrayList.add(inputArray[index]);
		}
		System.out.println("Input List: \n" + inputArrayList + "\n");
		String wordToBeReplace = "Techno", replaceWith = "Credits", wordToBeSearched = "Krishna";
		// String wordToBeReplace = "Maulik", replaceWith = "Krishna";
		elementRemovalAndReplaceInArrayList.removeAndReplaceElement(inputArrayList, wordToBeReplace, replaceWith);
		System.out.println("\nTotal " + wordToBeSearched + " words: "
				+ elementRemovalAndReplaceInArrayList.getElementCount(inputArrayList, wordToBeSearched));

	}
}
