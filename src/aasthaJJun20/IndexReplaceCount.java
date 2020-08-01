package aasthaJJun20;
/*Assignment - 34 :  25th July 2020
Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4*/

import java.util.ArrayList;

public class IndexReplaceCount {
	void displayIndexReplaceCount(ArrayList<String> names, String indexName, String replacement) {
		int countReplacement = 0;
		System.out.println("\nInput ArrayList : " + names);
		if (names.contains(indexName)) {
			System.out.print("\"" + indexName + "\" word index in Input arrayList is : ");
			for (int index = 0; index < names.size(); index++) {
				if (names.get(index).equals(indexName)) {
					System.out.print(names.indexOf(indexName) + ",");
					names.set(names.indexOf(indexName), replacement);
					countReplacement++;
				} else if (names.get(index).equals(replacement)) {
					countReplacement++;
				}
			}
			System.out.println(
					"\nArrayList after replacing \"" + indexName + "\" with \"" + replacement + "\": " + names);
			System.out.println("\nTotal \"" + replacement + "\" words :- " + countReplacement);
		} else
			System.out.println("\"" + indexName + "\" is not present in Input arrayList");
	}

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Maulik");
		names.add("Techno");
		names.add("Krishna");
		names.add("Techno");
		names.add("Credits");
		names.add("Techno");
		new IndexReplaceCount().displayIndexReplaceCount(names, "Aastha", "Jaiswal");
		new IndexReplaceCount().displayIndexReplaceCount(names, "Techno", "Credits");
	}
}
