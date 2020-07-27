package aavrutiDJun20.collectionPrgm;

import java.util.ArrayList;
//import java.util.Collections;

public class ReplaceTechnoInList {
	
	//Replace Techno with Credits and get total count of Credits
	ArrayList<String> replaceTechno(ArrayList<String> input) {
		System.out.println("Input  --> " + input);
		System.out.print("\nTechno word index in given arrayList is ");
		for(;input.contains("Techno");) {
			System.out.print(input.indexOf("Techno") + ", ");
			input.set(input.indexOf("Techno"), "Credits");
		}
		System.out.println("\n\nOutput --> " + input);		
		return input;
	}
	
	//Total Count of Credits
	void countOfCredits(ArrayList<String> input) {
		int org_Size = input.size();
		for(;input.contains("Credits");) {
			input.remove("Credits");
		}
		int new_Size = input.size();
		System.out.println("Total Count of Credits --> " + (org_Size - new_Size));
	}

	/*void countOfCredits(ArrayList<String> input) {
		System.out.println("Total Count of Credits --> " + Collections.frequency(input, "Credits"));
	}*/
	
	public static void main(String[] args) {
		ReplaceTechnoInList replaceTechnoInList = new ReplaceTechnoInList();		
		replaceTechnoInList.countOfCredits(replaceTechnoInList.replaceTechno(AddValuesInArrayList.addValuesInList()));
	}
}
