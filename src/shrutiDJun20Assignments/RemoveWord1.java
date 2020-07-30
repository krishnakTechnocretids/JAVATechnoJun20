package shrutiDJun20Assignments;

import java.util.ArrayList;

public class RemoveWord1 {

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
		System.out.println("New List--> " + nameArrList);
	}
	public static void main(String[] args) {
		RemoveWord1 removeWord = new RemoveWord1();
		removeWord.removeWordFromList();
	}
}
