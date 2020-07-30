package anupSJun20;
/*Program 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove*/

import java.util.ArrayList;

public class RemoveStringFromArrayList {
	void removewordFromArrayList(ArrayList<String> listofElements, String wordtoRemove ) {
		
		while(listofElements.contains(wordtoRemove)) {
			listofElements.remove(wordtoRemove);
		}
		System.out.println("The output ArrayList is :"+listofElements);
		
	}
	public static void main(String[] args) {
		RemoveStringFromArrayList removeStringFromArrayList = new RemoveStringFromArrayList();
		ArrayList<String> listofElements = new ArrayList<String>();
		listofElements.add("Maulik");
		listofElements.add("Techno");
		listofElements.add("Krishna");
		listofElements.add("Techno");
		listofElements.add("Credits");
		listofElements.add("Techno");
		String wordtoRemove = "Techno";
		System.out.println("The input arrayList is :" + listofElements);
		removeStringFromArrayList.removewordFromArrayList(listofElements, wordtoRemove);
		
	}

}
