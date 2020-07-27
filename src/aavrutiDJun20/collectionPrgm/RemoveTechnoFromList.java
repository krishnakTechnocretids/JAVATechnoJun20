package aavrutiDJun20.collectionPrgm;

import java.util.ArrayList;

public class RemoveTechnoFromList {

	/*Remove Techno from ArrayList using "continue"
	void removeTechno(ArrayList<String> input) {
		System.out.println("Input  --> " + input);
		for(; ;) {
			if(input.contains("Techno")) {
				input.remove("Techno");
				continue;
			}
			else {
				break;
			}
		}
		System.out.println("Output --> " +input);
	}*/

	/*Remove Techno from ArrayList using "while loop"
	void removeTechno(ArrayList<String> input) {
		System.out.println("Input  --> " + input);
		while(input.contains("Techno")) {
			input.remove("Techno");
		}
		System.out.println("Output --> " +input);
	}*/

	//Remove Techno from ArrayList using "For Loop"
	void removeTechno(ArrayList<String> input) {
		System.out.println("Input  --> " + input);
		for(;input.contains("Techno");) {
			input.remove("Techno");
		}
		System.out.println("Output --> " +input);
	}

	public static void main(String[] args) {
		RemoveTechnoFromList removeTechnoFromList = new RemoveTechnoFromList();
		removeTechnoFromList.removeTechno(AddValuesInArrayList.addValuesInList());
	}
}