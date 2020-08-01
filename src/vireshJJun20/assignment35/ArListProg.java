/*
Assignment 35:  Retrieve all unique names from given array.
String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};

output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]
Note : use collection concepts here and raise PR. For more practice write a code in notepad without using collection. 
*/

package vireshJJun20.assignment35;

import java.util.ArrayList;
import java.util.Arrays;

public class ArListProg {

	void combineArLists(String[] name1, String[] name2) {
		ArrayList<String> arList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> arList2 = new ArrayList<String>(Arrays.asList(name2));
		arList2.addAll(arList1);
		arList2.removeAll(arList1);
		arList1.addAll(arList2);
		System.out.println(" name 1: " + Arrays.toString(name1));
		System.out.println(" name 2: " + Arrays.toString(name2));
		System.out.println("Combined ArrayList: " + arList1);
	}

	public static void main(String[] args) {
		String[] name1 = { "Palak", "Viresh", "Yash", "Aavruti" };
		String[] name2 = { "Deavina", "Palak", "Viresh", "Nikhil" };

		new ArListProg().combineArLists(name1, name2);
	}
}
