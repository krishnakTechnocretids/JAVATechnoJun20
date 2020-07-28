package anupSJun20;

import java.util.ArrayList;
import java.util.Arrays;

/*Assignment 35:  Retrieve all unique names from given array.

String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]

Note : use collection concepts here and raise PR. For more practice write a code in notepad without using collection. */

public class UniqueNames {
	void UniqueNamesandFormNewArrayList(ArrayList<String> List1,ArrayList<String> List2) {
		List2.removeAll(List1);                         
		List1.addAll(List2);
		System.out.println("Union of Arrays with Unique Values is: "+List1);
	}	
	
	public static void main(String[] args) {
		UniqueNames uniquenames =new UniqueNames();
		String[] name1= {"Palak", "Viresh", "Yash", "Aavruti"};
		String[] name2= {"Deavina","Palak","Viresh", "Nikhil"};

		ArrayList<String> nameList1=new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2=new ArrayList<String>(Arrays.asList(name2));

		System.out.println("First Array Values: "+nameList1);
		System.out.println("Second Array Values: "+nameList2);

		uniquenames.UniqueNamesandFormNewArrayList(nameList1,nameList2);
	}
}
