package deavinaSJun20;

/*
 Program 2 :
Display on which index Techno is available, Replace all Techno with Credits from given ArrayList, and count total number of Credits.
["Maulik","Techno" ,"Krishna", "Techno", "Credits", "Techno"]

Output : 
Techno word index in given arrayList is 1,3,5 
["Maulik","Credits" ,"Krishna", "Credits", "Credits", "Credits"]
Total Credits words :- 4
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Assignment_34_1 {
	int count = 0;

	void removeandreplaceElements(ArrayList list) {

		int indexofTechno = 0;
		
		/*if (list.indexOf("Credits") != 0)
			count++;*/
		System.out.println("list of input elements : " + list);
		System.out.print("Techno word in given arrayList is at index ");
		for (int index = 0; index <list.size(); index++) {

			if (list.get(index).equals("Techno")) {
				indexofTechno = list.indexOf("Techno");
				System.out.print(indexofTechno + " ");
				list.set(indexofTechno, "Credits");
				count++;
			}
			else if(list.get(index).equals("Credits")) {
				count++;
			}

		}
		System.out.println("\nList of updated element is : " + list);
		System.out.println("Total Credits word count is :- " + count);

	}

	public static void main(String[] args) {
		ArrayList listofinputelements = new ArrayList(
				Arrays.asList("Maulik", "Techno", "Krishna", "Techno", "Credits", "Techno"));

		new ArrayList_Assignment_34_1().removeandreplaceElements(listofinputelements);
	}

}
