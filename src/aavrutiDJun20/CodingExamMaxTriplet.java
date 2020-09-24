/*
 	int[] num = {10,20,12,22,15,13,9,17,21}
	Max sum triplet is : 22,15,13 -> 50
 */

package aavrutiDJun20;

public class CodingExamMaxTriplet {
	
	void sumOfMaxTriplet() {
		int[] num = {10,20,12,22,15,13,9,17,21};
		int count = 1, max = 0, sum = 0;
		String temp = "", tripletString = "";
		
		for(int index=0;index<num.length;index++) {
			if(count<=3) {
				temp += num[index] + ", ";
				sum += num[index];
				count++;
			}
			else {
				sum = 0;
				count = 2;
				sum += num[index];
				temp += num[index] + ", ";
			}	
			if(sum>max && count==4) {
				max = sum;
				tripletString = temp;
				temp = "";
			}
		}
		System.out.println("Max sum triplet is : " + tripletString + "-> " + max);
	}

	public static void main(String[] args) {
		new CodingExamMaxTriplet().sumOfMaxTriplet();
	}
}
