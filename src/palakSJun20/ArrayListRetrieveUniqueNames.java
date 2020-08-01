/*Assignment 35:  Retrieve all unique names from given array.

String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]
*/
package palakSJun20;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRetrieveUniqueNames {

	void FindListOfUniqueName(String[] name1, String[] name2) {
		ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(name1));
		ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(name2));
		System.out.println("Input ArrayList 1 :   "+ arrayList1);
		System.out.println("Input ArrayList 2 :   "+ arrayList2);
		arrayList1.removeAll(arrayList2); // [Yash, Aavruti]

		arrayList2.addAll(arrayList1); // [Deavina, Palak, Viresh, Nikhil, Yash, Aavruti]
		System.out.println("Unique List of Names: "+arrayList2);
	}

	public static void main(String[] args) {
		String[] name1 = { "Palak", "Viresh", "Yash", "Aavruti" };
		String[] name2 = { "Deavina", "Palak", "Viresh", "Nikhil" };
		new ArrayListRetrieveUniqueNames().FindListOfUniqueName(name1, name2);
	}
}
