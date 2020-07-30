/*Remove all Techno from given ArrayList.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]
Hint : contains & remove */
package jagadeeshMJun20;

import java.util.ArrayList;

public class RemoveInArraylist {
	ArrayList<String> getArrayListValues(ArrayList<String> names, String strToRemove) {	
		for(int index=0;index<names.size();index++) {
			if(names.get(index).contains(strToRemove))
					names.remove(index);
			}
		return names;
	}
	public static void main(String[] agrs) {
	ArrayList <String> names = new ArrayList <String>();	
	names.add("Maulik");
	names.add("Techno");
	names.add("Krishna");
	names.add("Techno");
	names.add("Credits");
	names.add("Techno");
	String strToRemove = "Techno";
	System.out.println("Original names list -> "+names);
	System.out.println("Modified names list -> "+new RemoveInArraylist().getArrayListValues(names, strToRemove));
	}
}
