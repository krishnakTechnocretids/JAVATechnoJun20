package anupSJun20;
/*Remove duplicate names from given String Array, print names in given format with its length. Input Order has to be maintained.
String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}

Output : Aashtha -> 7
              Kartikey -> 8
              Piyush -> 6
	      Raj -> 3
	      Suparna -> 7
	      Barkha -> 6
Total unique elements are :- 6

Note: Use set interface. */

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateSet {
	
	void findDuplicateNamesAndLength(String[] input) {
		System.out.println("The input List :" +Arrays.asList(input));
		Set<String> nameList = new LinkedHashSet<String>(Arrays.asList(input));
		Iterator<String> itr = nameList.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str + "--> " + str.length());
		}
		System.out.println("Total Unique Elements are "+ nameList.size());
	}
	public static void main(String[] args) {
		RemoveDuplicateSet removeDuplicateSet = new RemoveDuplicateSet();
		String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"};
		removeDuplicateSet.findDuplicateNamesAndLength(input);
	}

}
