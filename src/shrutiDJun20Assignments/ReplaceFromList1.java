package shrutiDJun20Assignments;

import java.util.ArrayList;

import shrutiDJun20_CollectionSFrameworkNew.ReplaceFromList;

public class ReplaceFromList1 {

	void replaceWord() {

		ArrayList<String> nameArrList = new ArrayList<>();

		nameArrList.add("Maulik");
		nameArrList.add("Techno");
		nameArrList.add("Krishna");
		nameArrList.add("Techno");
		nameArrList.add("Credits");
		nameArrList.add("Techno");
		int count = 0;
		System.out.print("Techno word index in given arrayList is ");
		for (int index = 0; index < nameArrList.size(); index++) {
			if (nameArrList.contains("Techno")) {
				System.out.print(nameArrList.indexOf("Techno") + " ");
				nameArrList.set(nameArrList.indexOf("Techno"), "Credits");
			}
		}
		for (int index = 0; index < nameArrList.size(); index++) {
			if (nameArrList.get(index) == "Credits") {
				count++;
			}
		}
		System.out.println();
		System.out.println("Required Output--> " + nameArrList);
		System.out.println("Total Credits words :-" + count);
	}
	public static void main(String[] args) {
		ReplaceFromList1 replaceFromList1 = new ReplaceFromList1();
		replaceFromList1.replaceWord();

	}
}
