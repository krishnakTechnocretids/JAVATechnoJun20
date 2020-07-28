package aasthaJJun20;

/*Assignment 35:  Retrieve all unique names from given array.
28th July 2020

String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]

Note : use collection concepts here and raise PR. For more practice write a code in notepad without using collection. */
import java.util.Arrays;
import java.util.ArrayList;

public class UniqueNamesFromArraysUsingArrayLists {
	void displayUniqueNamesFromArrays(String[] name1, String[] name2) {
		System.out.println("Input array - name1 : " + Arrays.toString(name1));
		System.out.println("Input array - name2 : " + Arrays.toString(name2));
		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));
		for (String currentName : nameList2) {
			if (!nameList1.contains(currentName))
				nameList1.add(currentName);
		}
		System.out.println("\nOutput ArrayList : " + nameList1);
	}

	// alternative display method using removeAll() and without using for loop
	void displayUniqueNamesFromArraysUsingRemoveAll(String[] name1, String[] name2){
		System.out.println("Input array - name1 : " + Arrays.toString(name1));
		System.out.println("Input array - name2 : " + Arrays.toString(name2));
		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));
		nameList1.removeAll(nameList2);
		nameList2.addAll(nameList1);
		System.out.println("\nOutput ArrayList : " + nameList2);
	}

	public static void main(String[] args) {
		String[] name1 = { "Palak", "Viresh", "Yash", "Aavruti" };
		String[] name2 = { "Deavina", "Palak", "Viresh", "Nikhil" };
		new UniqueNamesFromArraysUsingArrayLists().displayUniqueNamesFromArrays(name1, name2);
		System.out.println();
		new UniqueNamesFromArraysUsingArrayLists().displayUniqueNamesFromArraysUsingRemoveAll(name1, name2);
	}
}
