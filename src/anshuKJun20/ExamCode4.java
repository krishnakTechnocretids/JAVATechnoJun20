package anshuKJun20;
public class ExamCode4 {
	public static void main(String[] args) {
		int[] arr = { 10, 33, 55, 43, 99, 21 };
		int[] arr1 = { 100, 105, 1, 99, 32, 105 };
		int[] arr2 = { 100, 21, 99, 55, 43 };
		ExamCode4 exammCode = new ExamCode4();
		exammCode.findSecondMaximumNumber(arr);
		exammCode.findSecondMaximumNumber(arr1);
		exammCode.findSecondMaximumNumber(arr2);

	}

	void findSecondMaximumNumber(int[] arr) {
		int secMaxNum = 0, maxNum = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (maxNum < arr[index]) {
				secMaxNum = maxNum;
				maxNum = arr[index];
			} else {
				// this condition is required in case when max
				if (secMaxNum < arr[index] && arr[index] != maxNum) { 
					secMaxNum = arr[index];
				}
			}
		}
		System.out.println(secMaxNum);

	}

}
