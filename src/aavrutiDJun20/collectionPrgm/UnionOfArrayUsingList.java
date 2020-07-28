package aavrutiDJun20.collectionPrgm;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfArrayUsingList {

	/*Union of two Array
	void findUnionOfArray(ArrayList<String> nameList1, ArrayList<String> nameList2) {
		ArrayList<String> list1 = new ArrayList<String>(nameList1);
		list1.retainAll(nameList2);

		ArrayList<String> list2 = new ArrayList<String>(nameList1);
		list2.removeAll(nameList2);

		ArrayList<String> list3 = new ArrayList<String>(nameList2);
		list3.removeAll(nameList1);

		ArrayList<String> unionArray = new ArrayList<String>(list1);
		unionArray.addAll(list2);
		unionArray.addAll(list3);		
		System.out.println("Union Array is --> " + unionArray);
	}*/

	//Union of two Arrays
	void findUnionOfArray(ArrayList<String> nameList1, ArrayList<String> nameList2) {
		ArrayList<String> list1 = new ArrayList<String>(nameList1);
		list1.addAll(nameList2);

		for(int index=0;index<list1.size();index++) {
			if(list1.indexOf(list1.get(index)) != list1.lastIndexOf(list1.get(index))) {
				list1.remove(list1.get(index));
			}
		}
		System.out.println(list1);
	}

	public static void main(String[] args) {
		UnionOfArrayUsingList unionOfArrayUsingList = new UnionOfArrayUsingList();
		String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti", "Viresh"};
		String[] name2 = {"Deavina","Palak","Viresh", "Nikhil", "Nikhil"};		
		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));		
		unionOfArrayUsingList.findUnionOfArray(nameList1,nameList2);	
	}
}
