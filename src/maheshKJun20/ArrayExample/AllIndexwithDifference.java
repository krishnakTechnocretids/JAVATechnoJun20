/*
 Find all differ index from given arrays. 
i/p:- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,13}
o/p:- Values are not matching at index -> 2
Values are not matching at index -> 4
*/

package maheshKJun20.ArrayExample;

public class AllIndexwithDifference {

	void displayIndexWithDiffValue(int[] intArray1, int[] intArray2) {
		//Method to display all index with difference in value of 2 interger Arrays
		if(intArray1.length == intArray2.length) {
			for (int index=0; index<intArray1.length;index++) {
				if (intArray1[index] != intArray2[index]) {
					System.out.println("Values are not matching at index: " + index);
				}				
			}
		}else {
			System.out.println("Length is 2 Array is not matching");
		}
	}
	
	public static void main(String[] args) {
		AllIndexwithDifference allIndexwithDifference = new AllIndexwithDifference();
		int[] intArray1 = {10,2,9,14,3};
		int[] intArray2 = {10,2,18,14,13};
		allIndexwithDifference.displayIndexWithDiffValue(intArray1, intArray2);
	}

}
