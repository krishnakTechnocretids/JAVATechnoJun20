/*
Find max value at differed index.
i/p:- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,3}
o/p :- Values are not matching at index -> 2, From (9,18) max value is 18
*/

package maheshKJun20.ArrayExample;

public class MaxValuefromIndexWithDifference {
	
	void displayMaxIndexValueWithDiff(int[] intArray1, int[] intArray2) {
		//Method to display Max value of element with difference in 2 integer Array. It will also validate if length of 2 arrays is equal before comparison
		boolean flag = true;
		if(intArray1.length == intArray2.length) {
			for (int index=0; index<intArray1.length;index++) {
				if (intArray1[index] != intArray2[index]) {
					if (intArray1[index] > intArray2[index]) {
						System.out.println("Values are not matching at index: " + index + " , From (" + intArray1[index] +"," + intArray2[index] + ") max value is " + intArray1[index]);
					}else {
						System.out.println("Values are not matching at index: " + index + " , From (" + intArray1[index] +"," + intArray2[index] + ") max value is " + intArray2[index]);
					}
					flag = false;
				}				
			}
			if (flag)
				System.out.println("Values of all Elements in both Array are equal");
		}else {
			System.out.println("Length is 2 Array is not matching");
		}
	}
	
	public static void main(String[] args) {
		MaxValuefromIndexWithDifference maxValuefromIndexWithDifference = new MaxValuefromIndexWithDifference();
		int[] intArray1 = {10,2,9,14,3};
		int[] intArray2 = {10,2,18,14,3};
		maxValuefromIndexWithDifference.displayMaxIndexValueWithDiff(intArray1, intArray2);
	}
}
