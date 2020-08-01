/*Assignment 35:  Retrieve all unique names from given array.
String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil] */

package rajAJun20;

import java.util.ArrayList;
import java.util.Arrays;

public class RetrieveUniqueElementsFromArraysUsingCollection {

	void unionOfArraysWithoutDuplicatesUsingCollection(ArrayList<String> nameArray1 , ArrayList<String> nameArray2 ) {
		System.out.println("Given arrays are : " +nameArray1+ " & " +nameArray2 );
		nameArray2.removeAll(nameArray1); //removes common elements from array2.
		nameArray1.addAll(nameArray2); //add all remaining elements of array2 to array1.
		System.out.println("Unique names list from given arrays is : " +nameArray1); //final unique name list stored in array1.	
	}

	public static void main(String[] args) {
		String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
		String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};		
		ArrayList<String> arrayList1 = new ArrayList<String>(Arrays.asList(name1)); //Providing String Arrays as list to ArrayList.
		ArrayList<String> arrayList2 = new ArrayList<String>(Arrays.asList(name2)); 

		new RetrieveUniqueElementsFromArraysUsingCollection().unionOfArraysWithoutDuplicatesUsingCollection(arrayList1, arrayList2);
	}
}
