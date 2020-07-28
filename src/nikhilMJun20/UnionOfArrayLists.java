/*
Assignment 35:  Retrieve all unique names from given array.

String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]
*/

package nikhilMJun20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class UnionOfArrayLists {
	ArrayList<String> createUnion(ArrayList<String> arrList1, ArrayList<String> arrList2) {
		//Below method will not work correctly if duplicate entries exist
		arrList1.removeAll(arrList2);
		arrList2.addAll(arrList1);
		return arrList2;
		
		//2nd approach - This is a better approach as it will take care of duplicate entries as well
		/*arrList1.addAll(arrList2);
		ArrayList<String> unionOfArrayLists = new ArrayList<String> ();
		for(String currentName : arrList1) {
			if(!unionOfArrayLists.contains(currentName)) {
				unionOfArrayLists.add(currentName);
			}
		}
		return unionOfArrayLists;*/
	}
	
	public static void main(String[] args) {
		ArrayList<String> arrList1 = new ArrayList<String> (Arrays.asList("Palak", "Viresh", "Yash", "Aavruti"));
		ArrayList<String> arrList2 = new ArrayList<String> (Arrays.asList("Deavina","Palak","Viresh", "Nikhil"));
		
		System.out.println("ArrayList 1 elements:-\n"+arrList1);
		System.out.println("\nArrayList 2 elements:-\n"+arrList2);
		System.out.println("\nUnion of ArrayList 1 and ArrayList 2:-\n"+new UnionOfArrayLists().createUnion(arrList1, arrList2));
	}
}
