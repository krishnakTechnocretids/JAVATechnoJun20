/*Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4 */
package jagadeeshMJun20;
import java.util.ArrayList;
public class CountReplaceInArrayList {
	void countAndReplace(ArrayList<String> names, String orgStr, String replaceStr) {
		int count = 0;
		System.out.print(orgStr + " word index in given arrayList is --> ");
		for (int index = 0; index < names.size(); index++) {
			if ((names.get(index).contains(replaceStr)))
				count++;
			if (names.get(index).contains(orgStr)) {
				if (count == 0)
					System.out.print(index);
				else
					System.out.print(", " + index);
				names.set(index, replaceStr);
				count++;
			}
		}
		System.out.println("\nModified output --> " + names);
		System.out.println("Total Credits words --> " + count);
	}
	public static void main(String[] agrs) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Maulik");
		names.add("Techno");
		names.add("Krishna");
		names.add("Techno");
		names.add("Credits");
		names.add("Techno");
		String orgStr = "Techno";
		String replaceStr = "Credits";
		new CountReplaceInArrayList().countAndReplace(names, orgStr, replaceStr);
	}
}
