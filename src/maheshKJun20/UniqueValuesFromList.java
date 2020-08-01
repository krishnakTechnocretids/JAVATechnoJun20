package maheshKJun20;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueValuesFromList {
	
	//Method to get Unique Element from the 2 Arrays. This method will only work if individual arrays have unique elements
//	void displayUniqueValues(String[] name1, String[] name2) {
//		ArrayList<String> tempList1= new ArrayList<String>(Arrays.asList(name1));
//		ArrayList<String> tempList2= new ArrayList<String>(Arrays.asList(name2));
//		tempList2.removeAll(tempList1);
//		tempList1.addAll(tempList2);
//		System.out.println("Unique names in given array are: " + tempList1);
//	}
	
	
	//Method to get Unique Element from the 2 Arrays. This will work even if individual arrays don't have unique elements
	void displayUniqueValues(String[] name1, String[] name2) {
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(name2));
		ArrayList<String> templist = new ArrayList<String>(Arrays.asList(name1));
		templist.addAll(list2);
		System.out.println("Unique names in given array are: " + getUniqueElementInList(templist));
	}	
	
	//Method to find unique element in a ArrayList
	ArrayList getUniqueElementInList(ArrayList list) {
		int count = 0;
		while (count < list.size()) {
			if(list.indexOf(list.get(count)) != list.lastIndexOf(list.get(count))) {
				list.remove(list.lastIndexOf(list.get(count)));
			}else {
				count++;
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti", "Viresh"};
		String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
		new UniqueValuesFromList().displayUniqueValues(name1, name2);
	}
}
