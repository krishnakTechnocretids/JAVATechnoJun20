/*Find all pairs on integer array whose sum is equal to given number?
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
(-1, 8)*/
package rachanaGJun20;

public class FindNumberPair {

	void findPairsOfSum7(int[] input) {

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if ((input[i] + input[j]) == 7)
					System.out.println("( " + input[i] + "," + input[j] + " )");
			}
		}
	}

	public static void main(String[] args) {
		FindNumberPair findnumberpair = new FindNumberPair();
		int[] input = { 2, 4, 3, 5, 7, 8, 9, -1 };
		findnumberpair.findPairsOfSum7(input);
	}

}
