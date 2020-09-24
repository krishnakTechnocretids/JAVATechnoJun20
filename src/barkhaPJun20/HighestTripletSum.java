/*Find triplet having maximum sum.
int[] num = {10,20,12,22,15,13,9,17,21}
Max sum triplet is : 22,15,13 -> 50 */
package barkhaPJun20;

public class HighestTripletSum {
	int highestSum = 0;
	int sum;
	String triplets;

	public void SumOfTriplet(int[] num) {
		for (int index = 0; index < num.length; index++) {
			sum = num[index] + num[index + 1] + num[index + 2];

			if (sum > highestSum) {
				highestSum = sum;
				triplets=num[index]+", " + num[index + 1]+", " + num[index + 2];
			}
			index += 2;
		}
		System.out.println("Highest sum of Triplet is: " + highestSum);
		System.out.println("Triplet set having highest sum is: "+triplets);
	}	
	public static void main(String[] args) {
		HighestTripletSum highestTripletSum = new HighestTripletSum();
		int[] num = { 10, 20, 12, 22, 15, 13, 9, 17, 21 };
		highestTripletSum.SumOfTriplet(num);
	}
}	