package anupSJun20;
/*Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4*/

import java.util.ArrayList;

public class ReplaceWordwithaStringArrayList {
	
	void replacewordwithArrayList(ArrayList<String> listofElements, String wordtoRemove, String wordtobereplaced) {
		int count = 0;
		System.out.print("The index of " + wordtoRemove + " is : ");
		while(listofElements.contains(wordtoRemove)) {
			listofElements.contains(wordtoRemove);
				System.out.print(listofElements.indexOf(wordtoRemove) + " ");
				listofElements.set(listofElements.indexOf(wordtoRemove), wordtobereplaced);
		}
		for(int index = 0;index<listofElements.size();index++) {
			if(listofElements.get(index).equals(wordtobereplaced)) {
				count++;
			}
		}
		System.out.println("\nThe number of " + wordtobereplaced + " is " + count);
		
		
	}
	public static void main(String[] args) {
		ReplaceWordwithaStringArrayList replaceWordwithaStringArrayList = new ReplaceWordwithaStringArrayList();
		ArrayList<String> listofElements = new ArrayList<String>();
		listofElements.add("Maulik");
		listofElements.add("Techno");
		listofElements.add("Krishna");
		listofElements.add("Techno");
		listofElements.add("Credits");
		listofElements.add("Techno");
		String wordtoRemove = "Techno";
		String wordtobereplaced = "Credits";
		System.out.println("The input arrayList is :" + listofElements);
		replaceWordwithaStringArrayList.replacewordwithArrayList(listofElements, wordtoRemove, wordtobereplaced);
	}

}
