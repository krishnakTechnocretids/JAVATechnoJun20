package suparnaNJune20.Assignment_36;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/*Assignment 36 : 
Remove duplicate names from given String Array, print names in given format with its length. Input Order has to be maintained.
String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}
Output : Aashtha -> 7
              Kartikey -> 8
              Piyush -> 6
	      Raj -> 3
	      Suparna -> 7
	      Barkha -> 6
Total unique elements are :- 6
Note: Use set interface. */
public class DisplayLengthOfUniqueElementsInArray {

	void displayLengthOfUniqueElementsInArray(String[] inputArray) {
		System.out.println("\nOutput :");
		System.out.println("\nElement\t Length ");
				Set<String> setOfNames = new LinkedHashSet<String>();
		for (String temp : inputArray) {
			setOfNames.add(temp);
		}

		Iterator<String> iterator = setOfNames.iterator();
		while (iterator.hasNext()) {
			String tempArrray = iterator.next();
			System.out.println(tempArrray + " --> " + tempArrray.length());
		}
		System.out.println("\nTotal unique elements are :- " + setOfNames.size());
	}

	public static void main(String[] args) {
		String[] inputArray = { "Aastha", "Kartikey", "Piyush", "Raj", "Suparna", "Piyush", "Aastha", "Barkha" };
		System.out.println("Input Array: " + Arrays.toString(inputArray));
		new DisplayLengthOfUniqueElementsInArray().displayLengthOfUniqueElementsInArray(inputArray);
	}
}
