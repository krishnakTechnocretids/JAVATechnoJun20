package vaishnaviVJun20_Coding_Exams;

import java.util.ArrayList;

/* Find triplet having maximum sum.
int[] num = {10,20,12,22,15,13,9,17,21}
Max sum triplet is : 22,15,13 -> 50 */

public class TripletSum {

	void findMaxTripletSum(int[] arr) {
		int max = 0;
		int sum = 0;
		int count = 0;
		String triplet = "";
		for (int index = 0; index < arr.length; index++) {
			sum += arr[index];
			count++;
			if (count % 3 == 0) {
				if (sum > max) {
					max = sum;
					sum = 0;
					triplet = arr[index - 2] + "," + arr[index - 1] + "," + arr[index];
				}
			}
		}
		System.out.println("Max sum triplet is: " + triplet + " -->" + max);
	}

	public static void main(String[] args) {
		int[] num = { 10, 20, 12, 22, 15, 13, 9, 17, 21 };
		new TripletSum().findMaxTripletSum(num);

	}

}
