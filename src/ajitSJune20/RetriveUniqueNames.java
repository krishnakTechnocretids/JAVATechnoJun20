/*Retrieve all unique names from given array.

String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]    */
package ajitSJune20;

import java.util.ArrayList;
import java.util.Arrays;

public class RetriveUniqueNames {

	void retrieveNames(ArrayList<String> namelist1, ArrayList<String> namelist2) {
		namelist2.removeAll(namelist1);
		namelist1.addAll(namelist2);
		ArrayList<String> newList = new ArrayList<String>();

		for (String elements : namelist1) {
			if (!newList.contains(elements)) {
				newList.add(elements);
			}
		}
		System.out.println("\nThe final list which contains unique elements from Two arrays is : \n" + newList);
	}

	public static void main(String[] args) {
		ArrayList<String> namelist1 = new ArrayList<String>(Arrays.asList("Palak", "Viresh", "Yash", "Aavruti", "Palak"));
		ArrayList<String> namelist2 = new ArrayList<String>(Arrays.asList("Deavina", "Palak", "Viresh", "Nikhil"));
		System.out.println("ArrayList1 :  " + namelist1);
		System.out.println("ArrayList2 :  " + namelist2);
		new RetriveUniqueNames().retrieveNames(namelist1, namelist2);
	}
}