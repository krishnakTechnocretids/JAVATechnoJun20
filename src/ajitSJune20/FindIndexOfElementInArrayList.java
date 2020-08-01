package ajitSJune20;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIndexOfElementInArrayList {

	void displayIndexAndReplaceElement(ArrayList<String> listOfElements, String ToBeReplaced, String replaceWith) {
		System.out.println("The Given ArrayList is : " + listOfElements);
		System.out.print("Index of word " + ToBeReplaced + " in Given Arraylist is : ");
		int count = 0;
		while (listOfElements.contains(ToBeReplaced)) {
			int indexOfString = listOfElements.indexOf(ToBeReplaced);
			System.out.print(indexOfString + " , ");
			listOfElements.set(indexOfString, replaceWith);
		}
		System.out.println("\nThe updated new Arraylist is : " + listOfElements);
		for (int index = 0; index < listOfElements.size(); index++) {
			if (listOfElements.get(index) == replaceWith) {
				count++;
			}
		}
		System.out.println("Total count of word " + replaceWith + " in ArrayList is : " + count);
	}

	public static void main(String[] args) {
		ArrayList<String> listOfElements = new ArrayList<String>(Arrays.asList("Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"));   
		String ToBeReplaced = "Techno";
		String replaceWith = "Credits";
		new FindIndexOfElementInArrayList().displayIndexAndReplaceElement(listOfElements, ToBeReplaced, replaceWith);
	}
}