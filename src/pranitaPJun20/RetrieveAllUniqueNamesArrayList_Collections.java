/*
 * Assignment 35:  Retrieve all unique names from given array.

String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]

Note : use collection concepts here and raise PR. For more practice write a code in notepad without using collection. 
 */
package pranitaPJun20;

import java.util.ArrayList;

public class RetrieveAllUniqueNamesArrayList_Collections {
	void findAllUniqueNamesArray(ArrayList<String> list1,ArrayList<String> list2) {
		list2.removeAll(list1);
		System.out.println("\nArray after removing common elements: "+list2);
		list1.addAll(list2);
		System.out.println("\nAll unique elements in Arrays are: "+list1);
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("Palak");
		name1.add("Viresh");
		name1.add("Yash");
		name1.add("Aavruti");
		System.out.println("\nFisrt Array is "+name1);
		
		ArrayList<String> name2 = new ArrayList<String>();
		name2.add("Deavina");
		name2.add("Palak");
		name2.add("Viresh");
		name2.add("Nikhil");
		System.out.println("\nSecond Array is "+name2);
		
		new RetrieveAllUniqueNamesArrayList_Collections().findAllUniqueNamesArray(name1,name2);
		
		
	}

}
