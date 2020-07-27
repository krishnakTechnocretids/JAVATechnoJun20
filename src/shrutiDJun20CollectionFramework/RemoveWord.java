package shrutiDJun20CollectionFramework;

import java.util.ArrayList;

//Remove all Techno from given ArrayList.
//["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
//Hint : contains & remove
public class RemoveWord {

	void removeWordFromList() {

		ArrayList<String> nameArrList = new ArrayList<>();

		nameArrList.add("Maulik");
		nameArrList.add("Techno");
		nameArrList.add("Krishna");
		nameArrList.add("Techno");
		nameArrList.add("Credits");
		nameArrList.add("Techno");
		System.out.println("Original List--> " + nameArrList);
		for (int index = 0; index < nameArrList.size(); index++) {
			nameArrList.remove(nameArrList.indexOf("Techno"));
		}
		System.out.println("new List--> " + nameArrList);
	}

	public static void main(String[] args) {
		RemoveWord removeWord = new RemoveWord();
		removeWord.removeWordFromList();
	}
}
