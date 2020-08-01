/* Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove
*/
package palakSJun20;

import java.util.ArrayList;

public class ArrayListRemoveWord {
	void removeWord(ArrayList<String> arrayList) {
		System.out.println("Input : "+arrayList);
		for (int index = 0; index < arrayList.size(); index++) {
			if (arrayList.contains("Techno")) {
				arrayList.remove("Techno");
			}
		}
		System.out.println("Output: "+arrayList);
	}
	
	public static void main(String[] args) {
		ArrayListRemoveWord arrayListRemoveWord = new ArrayListRemoveWord();
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Maulik");
		arrayList.add("Techno");
		arrayList.add("Krishna");
		arrayList.add("Techno");
		arrayList.add("Credits");
		arrayList.add("Techno");	
		arrayListRemoveWord.removeWord(arrayList);
	}

}
