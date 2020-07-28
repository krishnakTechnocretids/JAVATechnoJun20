/*
 Assignment 35:  Retrieve all unique names from given array.

String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]
 */
package shrutiDJun20Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class RetrieveUniqueValue {

	// First Method
	void retrieveUniqueName1(ArrayList<String> nameList1,ArrayList<String> nameList2) {

		nameList2.removeAll(nameList1);
		nameList1.addAll(nameList2);
		System.out.println("Unique List of names(without Loop)-->"+nameList1);
	}

	// Second Method
	void retrieveUniqueName2(ArrayList<String> nameList1,ArrayList<String> nameList2) {

		for (int index = 0; index < nameList2.size(); index++) {
			if (!nameList1.contains(nameList2.get(index))) {
				nameList1.add(nameList2.get(index));
			}
		}
		System.out.println("Unique List of names(with Loop)-->"+nameList1);
	}

	public static void main(String[] args) {
		String[] name1 = { "Palak", "Viresh", "Yash", "Aavruti" };
		String[] name2 = { "Deavina", "Palak", "Viresh", "Nikhil" };

		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));
		RetrieveUniqueValue RetrieveUniqueValue = new RetrieveUniqueValue();
		RetrieveUniqueValue.retrieveUniqueName2(nameList1, nameList2);
		RetrieveUniqueValue.retrieveUniqueName1(nameList1, nameList2);
	}
}
