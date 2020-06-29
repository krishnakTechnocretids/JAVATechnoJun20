/*
Program 5: Find all differ index from given arrays.
               i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
                       arr2: {"Maulik","Harsh","Technocredits","Krishna"}		
               o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
                        Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]*/
package kARAN1595;

public class DifferIndex3 {

	void differIndex(String[] numberArray1, String[] numberArray2) {
		if (numberArray1.length == numberArray2.length) {
			for (int index = 0; index < numberArray1.length; index++) {
				if (numberArray1[index] != numberArray2[index]) {
					System.out.println("Values are not matching at index :" + index);
					
				}
				if (!numberArray1.equals(numberArray2)) {
					System.out.println("From Array  value is:" + numberArray1[index]);

				} else {
					System.out.println("From Array value is:" + numberArray2[index]);
				}
	

			}
			
		}

	}

	public static void main(String[] args) {
		DifferIndex3 differIndex = new DifferIndex3();

		String[] numberArray1 = {"Maulik", "Harsh", "Krishna", "Technocredits" };
		String[] numberArray2 = { "Maulik","Harsh","Technocredits","Krishna" };

		differIndex.differIndex(numberArray1, numberArray2);

	}
}
