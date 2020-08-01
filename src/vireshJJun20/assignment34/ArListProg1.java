/*
Program 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove
*/

package vireshJJun20.assignment34;

import java.util.ArrayList;

public class ArListProg1 {

	void updateArrList(ArrayList<String> arrList, String name) {
		boolean flag = false;
		if (arrList.contains("" + name)) {
			for (int index = 0; index < arrList.size(); index++) {
				if (arrList.get(index) == name) {
					flag = true;
					arrList.remove(index);
				}
			}
		}
		if (flag) {
			System.out.println("The word: " + name + " is removed from ArrayList");
			System.out.println("Updated  ArrayList: " + arrList);
		} else
			System.out.println("ArrayList does not contain the word: " + "" + name);
	}

	public static void main(String[] args) {
		String[] Arr = { "Maulik", "Techno", "Krishna", "Techno", "Credits", "Techno" };
		ArrayList<String> arrList = new ArrayList<String>();
		for (int index = 0; index < Arr.length; index++) {
			arrList.add(index, Arr[index]);
		}
		System.out.println("Original ArrayList: " + arrList);
		new ArListProg1().updateArrList(arrList, "Techno");
	}
}
