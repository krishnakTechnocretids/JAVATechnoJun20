/*
 Find triplet having maximum sum.
int[] num = {10,20,12,22,15,13,9,17,21}
Max sum triplet is : 22,15,13 -> 50
  */
package palakSJun20;


public class ArrayMaxTripletSum {

	static void findSum(int[] array) {
		int sum = 0, temp = 0;
		String value = "", tempString = "";
		int count = 0;
		for (int index = 0; index < array.length; index++) {
			if (count != 3) {
				sum = sum + array[index];
				value = value + String.valueOf(array[index] + ",");
				count++;

			}
			if (count == 3) {
				if (sum >= temp) {
					temp = sum;
					tempString = value;
					// System.out.println(value+" ");
					// System.out.println(temp);
				}
				count = 0;
				sum = 0;
				value = "";
			}

		}
		System.out.println("Max sum triplet is : " + tempString + "-> " + temp);
	}

	public static void main(String[] args) {
		int[] array = { 10, 20, 12, 22, 15, 13, 9, 17, 21 };
		ArrayMaxTripletSum.findSum(array);
	}
}
