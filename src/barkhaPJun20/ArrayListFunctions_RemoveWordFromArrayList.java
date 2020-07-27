/* 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove*/

package barkhaPJun20;

import java.util.ArrayList;

public class ArrayListFunctions_RemoveWordFromArrayList {
	//method 1
	void removeWordfromArrayList(ArrayList <String>arrayList, String removeWord) {
		while (arrayList.contains(removeWord)) {             			// will iterate loop on "Techno" itself (3 times)
			arrayList.remove(removeWord);
		}
		System.out.println("New ArrayList after remving "+removeWord+" is :"+arrayList);	
	}
	//method 2
	void removeWordfromArrayList1(ArrayList <String>arrayList, String removeWord) {
		for (int index=0; index<arrayList.size(); index++) {            // will iterate loop till arrayList.size() (6 times)
			if (arrayList.get(index)==removeWord) {
				arrayList.remove(removeWord);
			}
		}
		System.out.println("New ArrayList after remving "+removeWord+" is :"+arrayList);
	}
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Maulik");
		arrayList.add("Techno");
		arrayList.add("Krishna");
		arrayList.add("Techno");
		arrayList.add("Credits");
		arrayList.add("Techno");
		System.out.println("Input ArrayList is: "+arrayList);
		String removeWord="Techno";
		
		new ArrayListFunctions_RemoveWordFromArrayList().removeWordfromArrayList1(arrayList,removeWord);
	}
}