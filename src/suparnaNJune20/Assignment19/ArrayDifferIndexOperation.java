/*
 * Assignment 19 : 27th Jun'2020

Method 2: Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                            arr2: {10,2,18,14,3}
                   o/p:- Values are not matching at index -> 2
  
Method 3: Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                        arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                        Values are not matching at index -> 4
		
Method 4: Find max value at differed index.
              i/p:- arr1: {10,2,9,14,3}
                     arr2: {10,2,18,14,3}
              o/p :- Values are not matching at index -> 2, From (9,18) max value is 18
		
Method 5: Find all differ index from given arrays.
               i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
                       arr2: {"Maulik","Harsh","Technocredits","Krishna"}		
               o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
                        Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]
 */
package suparnaNJune20.Assignment19;

public class ArrayDifferIndexOperation {
int index;
	void firstDifferIndex(int[] arr1, int[] arr2) {
		for (index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index]) {
				System.out.println("Array Values are not matching at index -> " + index);
				break;
			}
		}
	}
	void allDifferIndex(int[] arr1, int[] arr2) {
		for (index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index])
				System.out.println("Array Values are not matching at index -> " + index);
		}
	}
	void stringDifferIndex(String[] arr1, String[] arr2) {
		for (index = 0; index < arr1.length; index++) {
			if (!arr1[index].equals(arr2[index]))
				System.out.println("Values are not matching at index ->  " + index + ", [arr1 value is " + arr1[index]
						+ ", arr2 value is " + arr2[index] + "]");

		}
	}
	void maxDifferIndexValue(int[] arr1, int[] arr2) {
		for ( index = 0; index < arr1.length; index++) {
			if ((arr1[index] != arr2[index]) && (arr1[index] < arr2[index]))
				System.out.println("Array Values are not matching at index -> " + index + ", from (" + arr1[index] + ","
						+ arr2[index] + ")" + "max value is " + arr2[index]);
			else if ((arr1[index] != arr2[index]) && (arr1[index] > arr2[index]))
				System.out.println("Array Values are not matching at index -> " + index + ", from (" + arr1[index] + ","
						+ arr2[index] + ")" + "max value is " + arr1[index]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		System.out.println("Find first differ index from given arrays.  ");
		new ArrayDifferIndexOperation().firstDifferIndex(arr1, arr2);
		int[] arr5 = { 10, 2, 9, 14, 3 };
		int[] arr6 = { 10, 2, 18, 14, 13 };
		System.out.println("\n Find all differ index from given arrays.");
		new ArrayDifferIndexOperation().allDifferIndex(arr5, arr6);
		System.out.println("\nFind max value at differed index..");
		new ArrayDifferIndexOperation().maxDifferIndexValue(arr5, arr6);
		String[] arr3 = { "Maulik", "Harsh", "Krishna", "Technocredits" };
		String[] arr4 = { "Maulik", "Harsh", "Technocredits", "Krishna" };
		System.out.println("\nFind all differ index from given string arrays.");
		new ArrayDifferIndexOperation().stringDifferIndex(arr3, arr4);
	}
}
