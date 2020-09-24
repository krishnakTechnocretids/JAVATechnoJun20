/*Java Coding Test

Find triplet having maximum sum.
int[] num = {10,20,12,22,15,13,9,17,21}
Max sum triplet is : 22,15,13 -> 50*/

package swapnaWJun20;

public class TripletsAddMaxValue {

	void tripletMaxValue(int[] num) {
		int maxSum = 0, max = 0;
		String tripletValue = " ";
		for (int index = 0; index < num.length; index++) {
			max = num[index] + num[index + 1] + num[index + 2];
			if (max > maxSum) {
				maxSum = max;
				tripletValue = (num[index] + "," + num[index + 1] + "," + num[index + 2]);
			}
			index = index + 2;
		}
		System.out.println("Max sum triplet is : " + tripletValue + " --> " + maxSum);
	}

	public static void main(String[] args) {
		int[] num = { 10, 20, 12, 22, 15, 13, 9, 17, 21 };
		new TripletsAddMaxValue().tripletMaxValue(num);
	}
}
