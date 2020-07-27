/*Assi 34 : Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number 
of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4*/
package madhuraMJun20.assignment30Plus;

import java.util.ArrayList;

public class ArrayListMethods {
	void displayIndex(ArrayList<String> names) {
		System.out.print("Techno word index in given arrayList is ");
		for (int index=0;index<names.size();index++) { 
			if(names.get(index)=="Techno") {
				System.out.print(index+ " ");
			}
		}
	}
	
	void replaceWord(ArrayList<String> names) {
		System.out.println();
		for(int index=0;index<names.size();index++) {
			if(names.get(index)=="Techno")
				names.set(index, "Credits");
		}
		System.out.println(names);
	}
	
	void countWordOccurance(ArrayList<String> names) {
		int count=0;
		for(int index=0;index<names.size();index++) {
			if(names.get(index)=="Credits") {
				count++;
			}
		}
		System.out.println("Total Credit wors :- "+count);
	} 
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Maulik");
		names.add("Techno");
		names.add("Krishna");
		names.add("Techno");
		names.add("Credits");
		names.add("Techno");
		
		ArrayListMethods arrayListMethods = new ArrayListMethods();
		arrayListMethods.displayIndex(names);
		arrayListMethods.replaceWord(names);
		arrayListMethods.countWordOccurance(names);
	}
}
