/*Find the missing number in integer array of 1 to 10?*/
package madhuraMJun20.scannerClass;

public class MissingNumberInArray {
	void findMissingNum(int[] arr, int[] num1) {
		int sumArr = 0;
		int totalSum = (num1.length * (num1.length + 1)) / 2;
		for (int index = 0; index < arr.length; index++) {
			sumArr += arr[index];
		}
		int missingNum = totalSum - sumArr;
		System.out.println(missingNum + " is missing");
	}

	public static void main(String[] args) {
		MissingNumberInArray missingNumberInArray = new MissingNumberInArray();
		int[] arr = { 1, 2, 8, 7, 6, 9, 4, 3, 10 };
		int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		missingNumberInArray.findMissingNum(arr, num1);
	}
}