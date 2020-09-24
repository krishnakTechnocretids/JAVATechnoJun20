/*Find triplet having maximum sum.
int[] num = {10,20,12,22,15,13,9,17,21}
Max sum triplet is : 22,15,13 -> 50*/
package rachanaGJun20.CoadingExam;

import java.util.ArrayList;
import java.util.Arrays;

public class TriplateSum {

	static void findtriplateSum() {
		Integer[] num = { 10, 20, 12, 22, 15, 13, 9, 17, 21 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(num));
		Integer sum = 0;
		Integer maxsum = 0;
		Integer triplateStartindex = 0;
		int iindex = 0;
		while (iindex < list.size()) {
			sum = 0;
			for (int jindex = iindex; jindex <= iindex + 2; jindex++) {// 0,3,6
				sum = sum + list.get(jindex);
			}
			if (sum > maxsum) {
				maxsum = sum;
				triplateStartindex = iindex;
			}
			iindex = iindex + 3;
		}
		System.out.println("Max sum of triplet is:");
		for (int index = triplateStartindex; index <= triplateStartindex + 2; index++) {
			System.out.print(list.get(index) + " ");
		}
		System.out.println(": " + maxsum);
	}

	public static void main(String[] args) {

	}
}
