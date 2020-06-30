/*Find the missing number in integer array of 1 to 10?*/
package madhuraMJun20.scannerClass;

public class MissingNumberInArray {
	void findMissingNum(int[] arr) {
		int sumArr = 0;
		int totalSum = ((arr.length+1) * ((arr.length + 1)+1)) / 2;
		for (int index = 0; index < arr.length; index++) {
			sumArr += arr[index];
		}
		int missingNum = totalSum - sumArr;
		System.out.println(missingNum + " is missing");
	}

	public static void main(String[] args) {
		MissingNumberInArray missingNumberInArray = new MissingNumberInArray();
		int[] arr = { 1, 2, 8, 7, 6, 9, 4, 3, 10 };
		missingNumberInArray.findMissingNum(arr);
	}
}