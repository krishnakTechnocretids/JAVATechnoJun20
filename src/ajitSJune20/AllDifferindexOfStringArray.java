/*Program 5: Find all differ index from given arrays.
i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
      arr2: {"Maulik","Harsh","Technocredits","Krishna"}   
o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
      Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]*/

package ajitSJune20;

public class AllDifferindexOfStringArray {

	void differIndex(String[] array1,String[] array2) {
		if(array1.length == array2.length) {
			for(int index=0;index<array1.length;index++) {
				if(!array1[index].equals(array2[index]))
					System.out.println("Values are not matching at index -> " + index + ", [arr1 value is " + array1[index] + ", arr2 value is " + array2[index] + "]");
			}			
		}
	}

	public static void main(String[] args) {
		AllDifferindexOfStringArray allDifferindexOfStringArray = new AllDifferindexOfStringArray();

		String[] array1 = {"Maulik", "Harsh", "Krishna", "Technocredits"};
		String[] array2 = {"Maulik", "Harsh", "Technocredits","Krishna"};

		allDifferindexOfStringArray.differIndex(array1,array2);
	}
} 