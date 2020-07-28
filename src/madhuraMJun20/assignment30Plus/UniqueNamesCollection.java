/*Assignment 35:  Retrieve all unique names from given array.

String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil] */
package madhuraMJun20.assignment30Plus;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueNamesCollection {

	static void retriveUniqueNames(ArrayList<String> nameList1, ArrayList<String> nameList2) {
		System.out.println("Array 1 : " + nameList1);
		System.out.println("Array 2 : " + nameList2);
		nameList2.removeAll(nameList1);
		nameList1.addAll(nameList2);
		System.out.println("Unique names ArrayList : " + nameList1);
	}

	public static void main(String[] args) {
		String[] name1 = { "Palak", "Viresh", "Yash", "Aavruti" };
		String[] name2 = { "Deavina", "Palak", "Viresh", "Nikhil" };

		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));
		UniqueNamesCollection.retriveUniqueNames(nameList1, nameList2);
	}
}