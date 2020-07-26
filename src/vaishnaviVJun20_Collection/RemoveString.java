package vaishnaviVJun20_Collection;

import java.util.ArrayList;

/* Program 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove */

public class RemoveString {

	void removeValueFromGivenArrayList(ArrayList<String> arrList, String strToRemove) {

		while (arrList.contains(strToRemove)) {
			arrList.remove(strToRemove);
		}

		System.out.println("Output Arraylist: " + arrList);
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
		String strToRemove = "Techno";
		new RemoveString().removeValueFromGivenArrayList(arrList, strToRemove);

	}

}
