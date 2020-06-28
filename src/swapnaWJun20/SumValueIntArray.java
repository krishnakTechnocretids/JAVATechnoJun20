/* Find all pairs on integer array whose sum is equal to given number?
Hint: You have given an integer array and a number, you need to write a program to find
all elements in the array whose sum is equal to the given number. Remember, the array
may contain both positive and negative numbers, so your solution should consider that.
Input:2, 4, 3, 5, 7, 8, 9 ,-1
Given sum:7
Integer numbers, whose sum is equal to value:7
(2, 5)(4, 3)
(5, 2)(3, 4)
(8, -1)(-1, 8)*/

package swapnaWJun20;

public class SumValueIntArray {

	void isSumSeven(int input[], int no) {

		System.out.println("Integer numbers, whose sum is equal to value : 7");

		for (int index = 0; index < input.length; index++) {
			for (int index1 = 0; index1 < input.length; index1++) {
				if (input[index] + input[index1] == no)
					System.out.println("(" + input[index] + " , " + input[index1] + ")");
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 2, 4, 3, 5, 7, 8, 9, -1 };
		int no = 7;
		SumValueIntArray sumValueIntArray = new SumValueIntArray();
		sumValueIntArray.isSumSeven(input, no);
	}
}
