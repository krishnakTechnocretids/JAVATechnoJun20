package technoCredits.collectionDemo.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Example8 {

	public static void main(String[] args) {
		// al1
		// al2
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Maulik","Techno","Krishna"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Krishna","Techno","Maulik","Aditi"));
	
		//System.out.println(list1.equals(list2)); //[Index based list comparision]
		
		//System.out.println(list1.containsAll(list2) && list2.containsAll(list1));
		
		/*Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1.equals(list2));*/
		
		/*ArrayList<String> temp = new ArrayList<String>(list1);
		list1.removeAll(list2);
		list2.removeAll(temp);
		
		if(list1.isEmpty() && list2.isEmpty()) {
			System.out.println("Equals");
		}else {
			System.out.println("not equals");
			System.out.println(list2);
		}*/
		
		
		ArrayList<String> temp = new ArrayList<String>(list1);
		
		list1.retainAll(list2);
		list2.retainAll(temp);
		
		if(list1.size() == list2.size()) {
			System.out.println("Equals");
		}else {
			System.out.println("Not equals");
		}
		
	}
}
