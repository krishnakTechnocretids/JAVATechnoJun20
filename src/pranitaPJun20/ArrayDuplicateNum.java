/*
 * Program 2: Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.
 */
package pranitaPJun20;

public class ArrayDuplicateNum {
//Method to find duplicate number in array
	void findDuplicateNum(int[] input) {
		for (int outerIndex = 0; outerIndex < input.length; outerIndex++) {
			for (int innerIndex = outerIndex+1; innerIndex < input.length; innerIndex++) {
				if (input[outerIndex] == input[innerIndex]) {
					System.out.println("\nDuplicate Number is: " + input[outerIndex]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arry1 = { 0, 3, 1, 1, 3 };
		System.out.println("Input array is");
		for(int index = 0;index<arry1.length;index++) {
			System.out.print(arry1[index]+",");
		}
		ArrayDuplicateNum arrayDuplicateNum = new ArrayDuplicateNum();
		arrayDuplicateNum.findDuplicateNum(arry1);
	}
}
