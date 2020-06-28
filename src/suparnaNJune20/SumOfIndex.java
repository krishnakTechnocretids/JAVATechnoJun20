/* * Find all pairs on integer array whose sum is equal to given number?
Hint: You have given an integer array and a number, you need to write a program to find
all elements in the array whose sum is equal to the given number. Remember, the array
may contain both positive and negative numbers, so your solution should consider that.
Input:2, 4, 3, 5, 7, 8, 9 ,-1
Given sum:7
Integer numbers, whose sum is equal to value:7
(2, 5)
(4, 3)
(5, 2)
(3, 4)
(8, -1)
(-1, 8)
 *  *  */
package suparnaNJune20;

public class SumOfIndex {

	private void arraySum(int[] arrayInt, int sum) {
		System.out.println("Input:");
		System.out.print(+ arrayInt[0]);
		for (int index = 1; index < arrayInt.length; index++) {
			System.out.print(" , " + arrayInt[index]);
		}
		System.out.println("\n");
		System.out.println("Given sum: " + sum);
		System.out.println("Integer numbers, whose sum is equal to value :" + sum);
		for (int innerIndex = 0; innerIndex < arrayInt.length; innerIndex++) {
			for (int outerIndex = 1; outerIndex < arrayInt.length; outerIndex++) {
				if ((arrayInt[innerIndex] + arrayInt[outerIndex]) == 7)
					System.out.println("(" + arrayInt[innerIndex] + " , " + arrayInt[outerIndex] + ")");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfIndex sumOfIndex = new SumOfIndex();
		int[] arrayInt = { 2, 4, 3, 5, 7, 8, 9, -1 };

		sumOfIndex.arraySum(arrayInt, 7);
	}

}
