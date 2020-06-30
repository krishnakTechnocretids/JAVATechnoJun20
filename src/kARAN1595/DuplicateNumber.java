/*Program 2: Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then the duplicated number is 3.
*/
package kARAN1595;

public class DuplicateNumber {

	void displayDuplicateElement(int[] array) {
		for(int innerIndex=0;innerIndex<array.length;innerIndex++) {
			for(int outerIndex=innerIndex+1;outerIndex<array.length;outerIndex++) {
				if(array[innerIndex]==array[outerIndex]) {
					System.out.println("Duplicate number is:"+array[innerIndex]);
				}
			}
		}
	}
	public static void main(String[] args) {
		DuplicateNumber duplicateNumber = new DuplicateNumber();
		int[] array= {0, 3, 1, 2, 3};
		duplicateNumber.displayDuplicateElement(array);
	}

}