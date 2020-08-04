package harshadBJun20.assignment34;

import java.util.ArrayList;
import java.util.Arrays;

/*Assignment - 34 :  25th July 2020
 * Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4 */

public class FindAndReplaceNameFromArrayList {
	
	void findAndReplaceName(ArrayList<String> namesList, String orgName, String replaceName) {
		ArrayList<Integer> indexOfWord= new ArrayList<Integer>();
		int replaceWordCount=0;
		for(int index=0;index<namesList.size();index++) {
				if(namesList.get(index) == orgName) {
					indexOfWord.add(namesList.indexOf(orgName));
					namesList.set(namesList.indexOf(orgName), replaceName);
					replaceWordCount++;
				}else if(namesList.get(index) == replaceName) {
					replaceWordCount++;
				}
		}
		System.out.println(orgName+" word index in given arrayList is "+indexOfWord);
		System.out.println(namesList);
		System.out.println("Total "+replaceName+" words :- "+replaceWordCount);
	}
	
	public static void main(String[] args) {
		String[] names = {"Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"};
		
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(names));
		System.out.println("Original list:");
		System.out.println(nameList);
		System.out.println();
		new FindAndReplaceNameFromArrayList().findAndReplaceName(nameList,"Techno","Credits");
	}
}
