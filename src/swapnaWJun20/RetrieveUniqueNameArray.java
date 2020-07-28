/*Assignment 35:  Retrieve all unique names from given array.

String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]*/

package swapnaWJun20;

import java.util.ArrayList;
import java.util.Arrays;

public class RetrieveUniqueNameArray {

	ArrayList<String> getUniqueElement(ArrayList<String> alName1, ArrayList<String> alName2) {
		ArrayList<String> tempList = new ArrayList<String>(alName1);
		ArrayList<String> outputList = new ArrayList<String>();
		outputList.addAll(alName2);
		for (String currentName : tempList) {
			if (!outputList.contains(currentName)) {
				outputList.add(currentName);
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		RetrieveUniqueNameArray retrieveUniqueNameArray = new RetrieveUniqueNameArray();
		String[] name1 = { "Palak", "Swapna", "Viresh", "Swapna", "Yash", "Aavruti" };
		String[] name2 = { "Deavina", "Palak", "Viresh", "Swapna", "Nikhil" };

		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));
		System.out.println("Input Array 1 : " + nameList1 + "\nInput Array 2 : " + nameList2);
		System.out.println("Output : " + retrieveUniqueNameArray.getUniqueElement(nameList1, nameList2));
	}
}
