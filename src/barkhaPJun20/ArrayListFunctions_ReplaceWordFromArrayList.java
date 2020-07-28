/*Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4*/

package barkhaPJun20;

import java.util.ArrayList;

public class ArrayListFunctions_ReplaceWordFromArrayList {
	int count=0;
	
	void replaceWordInArrayList(ArrayList<String> arrayList, String removeWord, String replaceWith) {
		System.out.print("Index of "+removeWord+" in given ArrayList is:");
		for (int index=0; index<arrayList.size(); index++) {
			if (arrayList.get(index).equals(removeWord)) {         
				System.out.print(index+",");
			}	
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------");
		
		for (int index=0; index<arrayList.size(); index++) {
		if (arrayList.get(index).equals(removeWord)) {
			arrayList.set(arrayList.indexOf(removeWord), replaceWith);
			count++;
		}else if (arrayList.get(index).equals(replaceWith)) {
			count++;
			}
		}
		System.out.println("ArrayList after replacing "+removeWord+" with "+replaceWith +" is:"+arrayList);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Count of "+replaceWith+" in new ArrayList is: "+count);
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
		String replaceWith="Credits";
		new ArrayListFunctions_ReplaceWordFromArrayList().replaceWordInArrayList(arrayList, removeWord, replaceWith);
	}
}				