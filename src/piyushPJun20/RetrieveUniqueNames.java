package piyushPJun20;

import java.util.ArrayList;
import java.util.Arrays;

public class RetrieveUniqueNames {

	static void retrieveNames(ArrayList<String> nameList1, ArrayList<String> nameList2) {
		nameList2.removeAll(nameList1);
		nameList1.addAll(nameList2);
		System.out.println(" Unique Names: " + nameList1);
	}

	public static void main(String[] args) {
		String[] name1 = { "Palak", "Viresh", "Yash", "Aavruti" };
		String[] name2 = { "Deavina", "Palak", "Viresh", "Nikhil" };

		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));
		RetrieveUniqueNames.retrieveNames(nameList1, nameList2);
	}
}