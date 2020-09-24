package madhuraMJun20.assignment30Plus;
/*Find triplet having maximum sum.
int[] num = {10,20,12,22,15,13,9,17,21}
Max sum triplet is : 22,15,13 -> 50*/
public class CodingExam_12 {
	void sumOfTriplets(int[] num) {
		int sum = 0;
		int maxSum = 0;
		String triplet = "";
		for (int index = 0; index < num.length - 2; index++) {
			sum = num[index] + num[index + 1] + num[index + 2];
			if (sum > maxSum) {
				maxSum = sum;
				triplet = (num[index] + " , " + num[index + 1] + " , " + num[index + 2]);
			}
			index = index + 2;
		}
		System.out.println("Max sum triplet is : " + triplet + " -> " + maxSum);
	}

	public static void main(String args[]) {
		int[] num = { 10, 20, 12, 22, 15, 13, 9, 17, 21 };
		new CodingExam_12().sumOfTriplets(num);
	}
}