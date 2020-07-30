/*
 * Assignment 35:  Retrieve all unique names from given array.
 * String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
 * String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
 * output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]
 * Note : use collection concepts here and raise PR.
 * For more practice write a code in notepad without using collection
 */
package aditiGJUN20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RetrieveUniqueElements {
	// Taken two separate ArrayList to compute and store result to retain original
	// lists as is.
	ArrayList<String> getUniqueElementFromList(String[] name1, String[] name2) {
		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));
		ArrayList<String> tempList = new ArrayList<String>(nameList1);
		ArrayList<String> uniqueElementList = new ArrayList<String>();
		System.out.println("Input List: \n" + nameList1 + "\n" + nameList2);
		tempList.addAll(nameList2);
		for (String currentName : tempList) {
			if (!uniqueElementList.contains(currentName)) {
				uniqueElementList.add(currentName);
			}
		}
		return uniqueElementList;
	}
	/*
	ArrayList<String> getUniqueElementFromList1(String[] name1, String[] name2) {
		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));
		ArrayList<String> uniqueElementList = new ArrayList<String>(nameList1);
		System.out.println("Input List: \n" + nameList1 + "\n" + nameList2);
		uniqueElementList.removeAll(nameList2);
		uniqueElementList.addAll(nameList2);
		return uniqueElementList;
	}*/

	public static void main(String[] args) {
		String[] name1 = { "Palak", "Viresh", "Yash", "Aavruti", "Yash", "Yash" };
		String[] name2 = { "Deavina", "Nikhil", "Palak", "Viresh", "Nikhil", "Nikhil", "Yash" };
		System.out.println(
				"\nUnique element list: \n" + new RetrieveUniqueElements().getUniqueElementFromList(name1, name2));
	}
}
