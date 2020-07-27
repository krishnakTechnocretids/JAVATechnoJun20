/*
 * Assignment - 34 :  25th July 2020
 * Program 1 : 
 * Remove all Techno from given ArrayList.
 * ["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
 * Hint : contains & remove
 */

package aditiGJUN20;

import java.util.ArrayList;

// Method to remove given element from String 
public class RemoveElementFromArrayList {
	ArrayList<String> removeElementFromArrayList(ArrayList<String> inputList, String removeElement) {
		while (inputList.contains(removeElement)) {
			inputList.remove(removeElement);
		}
		return inputList;
	}

	public static void main(String[] args) {

		// ArrayList initialization and value assignment
		ArrayList<String> inputArrayList = new ArrayList<String>() {
			{
				add("Maulik");
				add("Techno");
				add("Krishna");
				add("Techno");
				add("Credits");
				add("Techno");
			}
		};
		String removeElement = "Techno";
		System.out.println("Input List: \n" + inputArrayList);
		System.out.println("\nAfter removing " + removeElement + " from List: \n"
				+ new RemoveElementFromArrayList().removeElementFromArrayList(inputArrayList, removeElement));
	}
}

// Another option to assign value to an ArrayList without multiple calling of
// add() method:
// String[] inputArray= {"Maulik","Techno" ,"Krishna", "Techno", "Credits",
// "Techno"};
// ArrayList<String> inputArrayList = new ArrayList<String>();
// for(int index=0;index<inputArray.length;index++) {
// inputArrayList.add(index,inputArray[index]);}
