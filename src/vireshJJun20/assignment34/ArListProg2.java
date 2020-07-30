/*
Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4
*/

package vireshJJun20.assignment34;

import java.util.ArrayList;

public class ArListProg2 {
	void updateArList(ArrayList<String> arList, String fromName, String toName) {
		int toNameCnt = 0;
		boolean flag = false;
		ArrayList<Integer> aL = new ArrayList<Integer>();
		if (arList.contains(fromName)) {
			flag = true;
			for (int index = 0; index < arList.size(); index++) {
				if (arList.get(index) == fromName) {
					aL.add(arList.indexOf(fromName));
					arList.set(index, toName);
				}
				if (arList.get(index) == toName) {
					toNameCnt++;
				}
			}
		}
		if (!flag) {
			System.out.println("The given arraylist does not contain the word: " + fromName);
		} else {
			System.out.println(fromName + " word index in given arrayList is: " + aL);
			System.out.println("Updated  ArrayList: " + arList);
			System.out.println("Total " + toName + " words: " + toNameCnt);
		}
	}

	public static void main(String[] args) {
		String[] Arr = { "Maulik", "Techno", "Krishna", "Techno", "Credits", "Techno" };
		ArrayList<String> arrList = new ArrayList<String>();
		for (int index = 0; index < Arr.length; index++) {
			arrList.add(index, Arr[index]);
		}
		System.out.println("Original ArrayList: " + arrList);
		new ArListProg2().updateArList(arrList, "Techno", "Credits");
	}
}
