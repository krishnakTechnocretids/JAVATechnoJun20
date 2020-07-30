/*Assignment - 34 :  25th July 2020
Program 1 : 
Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove*/

package amitaRJun20;

import java.util.ArrayList;

public class RemoveWordFromArrayList {
	
	void removeElement(ArrayList<String> listOfElements){
		System.out.println("The ArrayList Input is : "+listOfElements);
		while(listOfElements.contains("Techno")){
			listOfElements.remove("Techno");
		}
		System.out.println("\nUpdated ArrayList after removing Techno is : "+ listOfElements);
		}

	public static void main(String[] args) {
		ArrayList<String> listOfElements = new ArrayList<String>();
		listOfElements.add("Maulik");
		listOfElements.add("Techno");
		listOfElements.add("Krishna");
		listOfElements.add("Techno");
		listOfElements.add("Credits");
		listOfElements.add("Techno");
		new RemoveWordFromArrayList().removeElement(listOfElements);		
	}
}