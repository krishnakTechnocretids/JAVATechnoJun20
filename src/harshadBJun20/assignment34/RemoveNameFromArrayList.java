package harshadBJun20.assignment34;

import java.util.ArrayList;

/*Assignment - 34 :  25th July 2020

Program 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove */

public class RemoveNameFromArrayList {
	
	void removeName(String nameToRemove) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Maulik");
		names.add("Techno");
		names.add("Krishna");
		names.add("Techno");
		names.add("Credits");
		names.add("Techno");
		System.out.println("Given Array list:");
		System.out.println(names);
		System.out.println();
		for(int index = 0;index<names.size();index++) {
			if(names.contains(nameToRemove)) {
				names.remove(nameToRemove);
			}			
		}
		System.out.println("After removing all Techno"+" from Array list:");
		System.out.println(names);
	}
	public static void main(String[] args) {
		new RemoveNameFromArrayList().removeName("Techno");
	}
}
