/*Assignment 35:  Retrieve all unique names from given array.

String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]

Note : use collection concepts here and raise PR. For more practice write a code in notepad without using collection. */
package rachanaGJun20;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueNameFinder {

	//method will find unique names from a given arraylist and display new list of unique name
	void findUniqueName(String[] name1, String[] name2) {
		ArrayList<String> namelist1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> namelist2 = new ArrayList<String>(Arrays.asList(name2));
		System.out.println(namelist1);
		System.out.println(namelist2);
		namelist2.removeAll(namelist1);
		//System.out.println(list2);
		namelist1.addAll(namelist2);
		System.out.println(namelist1);
	}

	public static void main(String[] args) {
		String[] name1 = { "Palak", "Viresh", "Yash", "Aavruti" };
		String[] name2 = { "Deavina", "Palak", "Viresh", "Nikhil" };
		new UniqueNameFinder().findUniqueName(name1, name2);
	}
}
