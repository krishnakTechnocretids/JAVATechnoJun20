package vaishnaviVJun20_Collection;

import java.util.ArrayList;
import java.util.Arrays;

/*Assignment 35:  Retrieve all unique names from given array.

String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil] */

public class Retrieve {
	
	void retrieveAllUniqueNames(ArrayList<String> name1, ArrayList<String> name2) {
		name2.removeAll(name1);
		name1.addAll(name2);
		System.out.println("Output: " +name1);
	}

	public static void main(String[] args) {
		String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
		String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
		ArrayList<String> arrList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> arrList2 = new ArrayList<String>(Arrays.asList(name2));
		new Retrieve().retrieveAllUniqueNames(arrList1,arrList2);

	}

}
