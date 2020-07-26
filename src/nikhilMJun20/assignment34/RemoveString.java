/*
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove
*/

package nikhilMJun20.assignment34;

import java.util.ArrayList;

public class RemoveString {
	void remove(ArrayList strArrayList, String toBeRemoved) {
		while(strArrayList.contains(toBeRemoved)) {
			strArrayList.remove(toBeRemoved);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> strArrayList = new ArrayList<String> () {
			{
				add("Maulik");
				add("Techno");
				add("Krishna");
				add("Techno");
				add("Credits");
				add("Techno");
			}
		};
		String toBeRemoved = "Techno";
		System.out.println("The original ArrayList :-\n"+strArrayList.toString());
		new RemoveString().remove(strArrayList, toBeRemoved);
		System.out.println("\nThe ArrayList after removing "+toBeRemoved+":-\n"+strArrayList.toString());
	}
}
