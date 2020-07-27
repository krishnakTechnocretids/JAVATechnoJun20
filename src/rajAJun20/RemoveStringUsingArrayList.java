/* Program 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove */

package rajAJun20;

import java.util.ArrayList;

public class RemoveStringUsingArrayList {
	
	void removeStringFromArrayList(ArrayList<String> inputString , String removeStr) {
		while(inputString.contains(removeStr)) {
			inputString.remove(removeStr);
		}
		System.out.println("ArrayList after string removal is : \n" +inputString);
	}
	
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Maulik");
		arrayList.add("Techno");
		arrayList.add("Krishna");
		arrayList.add("Techno");
		arrayList.add("Credits");
		arrayList.add("Techno");
		System.out.println("Given ArrayList of strings is : \n" +arrayList);
		String removeStr = "Techno";
		new RemoveStringUsingArrayList().removeStringFromArrayList(arrayList, removeStr);	
	}
}
