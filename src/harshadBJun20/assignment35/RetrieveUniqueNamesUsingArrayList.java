package harshadBJun20.assignment35;

import java.util.ArrayList;
import java.util.Arrays;

/*Assignment 35:  Retrieve all unique names from given array.

String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]

Note : use collection concepts here and raise PR.*/

public class RetrieveUniqueNamesUsingArrayList {
	
	void retrieveUniqueNames(ArrayList<String> firstList,ArrayList<String> secondList) {
		System.out.println("First ArrayList:");
		System.out.println(firstList);
		System.out.println();
		System.out.println("Second ArrayList:");
		System.out.println(secondList);

		secondList.removeAll(firstList);
		firstList.addAll(secondList);
		System.out.println();
		System.out.println("Unique names from given ArrayLists are:");
		System.out.println(firstList);
	}
	public static void main(String[] args) {
		String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
		String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
		//ArrayList<String> name1List = new ArrayList<String>(Arrays.asList(name1));
		//ArrayList<String> name2List = new ArrayList<String>(Arrays.asList(name2));
		
		new RetrieveUniqueNamesUsingArrayList().retrieveUniqueNames(new ArrayList<String>(Arrays.asList(name1)),new ArrayList<String>(Arrays.asList(name2)));
	}
}
