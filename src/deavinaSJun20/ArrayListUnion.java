package deavinaSJun20;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Assignment 35: Retrieve all unique names from given array.
String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]
 */

public class ArrayListUnion {

	void uniqueName(ArrayList<String> arraylist1, ArrayList<String> arraylist2) {
		for(String Name : arraylist2){
			if(!arraylist1.contains(Name))
				arraylist1.add(Name);
		}
		
		System.out.println("\nOutput ArrayList : " + arraylist1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
		String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		System.out.println("Input ArrayList1 " + nameList1);
		
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));
		System.out.println("Input ArrayList2 " + nameList2);
		
		new ArrayListUnion().uniqueName(nameList1,nameList2);
	}

}
