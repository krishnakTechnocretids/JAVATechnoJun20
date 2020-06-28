/*
Find first differ index from given arrays. 
i/p :- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,3}
o/p:- Values are not matching at index -> 2
 */


package maheshKJun20.ArrayExample;

public class FirstDifferIndex {
	
	void displayFirstIndexWithDifference(int[] intArray1, int[] intArray2) {
		//Method to display first Index with difference in value of 2 Interger Arrays
		if(intArray1.length == intArray2.length) {
			for (int index=0; index<intArray1.length;index++) {
				if (intArray1[index] != intArray2[index]) {
					System.out.println("Values are not matching at index: " + index);
					return;
				}				
			}
			System.out.println("Values of all Elements in both Array are equal");
		}else {
			System.out.println("Length is 2 Array is not matching");
		}
		
	}
	
	public static void main(String[] args) {
		FirstDifferIndex firstDifferIndex = new FirstDifferIndex();
		int[] intArray1 = {10,2,9,14,3};
		int[] intArray2 = {10,2,18,14,3};
		firstDifferIndex.displayFirstIndexWithDifference(intArray1, intArray2);
	}

}
