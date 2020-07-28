/*Assignment 35:  Retrieve all unique names from given array.
String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]
Note : use collection concepts here and raise PR. For more practice write a code in notepad without using collection.*/
package amitaRJun20;

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
        System.out.println("\nThe final list after removing unique elements from Two arrays is :- \n"+newList);
	}
	public static void main(String[] args) {
		String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti","Palak","Yash"};
		String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
		ArrayList<String> namelist1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> namelist2 = new ArrayList<String>(Arrays.asList(name2));
		System.out.println("ArrayList name lis1 :- " + namelist1);
		System.out.println("ArrayList name lis2 :- " + namelist2);
		new RetriveUniqueNames().retrieveNames(namelist1, namelist2);
	}
}
