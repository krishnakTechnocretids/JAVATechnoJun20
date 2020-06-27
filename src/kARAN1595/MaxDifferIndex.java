/*
 Program 4: Find max value at differed index.
        i/p:- arr1: {10,2,9,14,3}
               arr2: {10,2,18,14,3}
        o/p :- Values are not matching at index -> 2, From (9,18) max value is 18
	

 */
package kARAN1595;

public class MaxDifferIndex {

	void differIndex(int[] numberArray1, int[] numberArray2) {
		if (numberArray1.length == numberArray2.length) {
			for (int index = 0; index < numberArray1.length; index++) {
				if (numberArray1[index] != numberArray2[index]) {
					System.out.println("Values not matched at index:" + numberArray1[index]);
					System.out.println("Values not matched at index:" + numberArray2[index]);

					if (numberArray1[index] > numberArray2[index]) {
						System.out.println("From"+"" + index + "Max value is:" + numberArray1[index]);

					} else {
						System.out.println("From"+"" + index + "Max value is:" + numberArray2[index]);
					}

				}
			}

		}
	}

	public static void main(String[] args) {
		MaxDifferIndex differ = new MaxDifferIndex();

		int[] numberArray1 = { 10, 2, 9, 14, 3 };
		int[] numberArray2 = { 10, 2, 18, 14, 13 };

		differ.differIndex(numberArray1, numberArray2);

	}

}
