/*
 * Find triplet having maximum sum.
 * int[] num = {10,20,12,22,15,13,9,17,21}
 * Max sum triplet is : 22,15,13 -> 50
*/
package aditiGJUN20;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumTriplet {
	void maxTripletSum(Integer arr[]) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		int sum = 0;
		int max = 0;
		int startIndexOfTriplet = 0;
		int index = 0;
		while (index < list.size()) {
			sum = 0;
			for (int tempIndex = index; tempIndex <= index + 2; tempIndex++) {// 0,3,6
				sum = sum + list.get(tempIndex);
			}
			if (sum > max) {
				max = sum;
				startIndexOfTriplet = index;
			}
			index = index + 3;
		}
		System.out.println("Triplet with Maximum sum is: \n-----------------------------");
		for (int i= startIndexOfTriplet; i <= startIndexOfTriplet + 2; i++) {
			System.out.print(list.get(i) + "  ");
		}
		System.out.println("->  " + max);
	}

	public static void main(String args[]) {
		Integer[] intArray = { 10, 20, 12, 22, 15, 13, 9, 17, 21 };
		new MaxSumTriplet().maxTripletSum(intArray);

	}
}
