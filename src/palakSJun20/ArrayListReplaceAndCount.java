/*Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, 
and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output :
Techno word index in given arrayList is 1,3,5
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4*/

package palakSJun20;

import java.util.ArrayList;

public class ArrayListReplaceAndCount {
	
	void replaceAndCount(ArrayList<String> arrayList) {
		System.out.println("Input : "+arrayList);
		int count = 0;
		ArrayList<Integer> technoIndex = new ArrayList<>();
		for (int index = 0; index < arrayList.size(); index++) {
			if (arrayList.get(index) == "Techno" ) {
				technoIndex.add(index);
				arrayList.set(index, "Credits");
			}
			
		}
		for (int index = 0; index < arrayList.size(); index++) {
			if (arrayList.get(index) == "Credits" )
				count++;
		}
		System.out.println("Output: "+arrayList);
		System.out.println("Total Credit Words are "+ count);
		System.out.println("Techno word index in given arrayList is" + technoIndex);
	}

	public static void main(String[] args) {
		ArrayListReplaceAndCount arrayListReplaceAndCount = new ArrayListReplaceAndCount();
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Maulik");
		arrayList.add("Techno");
		arrayList.add("Krishna");
		arrayList.add("Techno");
		arrayList.add("Credits");
		arrayList.add("Techno");
		arrayListReplaceAndCount.replaceAndCount(arrayList);
	}
}
