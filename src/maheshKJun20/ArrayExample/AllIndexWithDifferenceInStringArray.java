/*
Find all differ index from given arrays.
i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
arr2: {"Maulik","Harsh","Technocredits","Krishna"}		
o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]
 */

package maheshKJun20.ArrayExample;

public class AllIndexWithDifferenceInStringArray {
	
	void displayIndexValueWithDiff(String[] strArray1, String[] strArray2) {
		//Method to display difference in value of each element in String Array. It will also validate if length of 2 arrays is equal before comparison
		if(strArray1.length == strArray2.length) {
			for (int index=0; index<strArray1.length;index++) {
				if (!strArray1[index].equalsIgnoreCase(strArray2[index])) {
					System.out.println("Values are not matching at index -> " + index + ", [strArray1 value is " + strArray1[index] + ", strArray2 value is " + strArray2[index] +"]" );
				}				
			}
		}else {
			System.out.println("Length is 2 Array is not matching");
		}
	}
	
	public static void main(String[] args) {
		AllIndexWithDifferenceInStringArray allIndexWithDifferenceInStringArray = new AllIndexWithDifferenceInStringArray();
		String[] strArray1 = {"Maulik", "Harsh", "Krishna", "Technocredits"};
		String[] strArray2 = {"Maulik","Harsh","Technocredits","Krishna"};
		allIndexWithDifferenceInStringArray.displayIndexValueWithDiff(strArray1, strArray2);
	}

}
