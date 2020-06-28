package kartikeyDJune20;

public class MaxValueAtDifferedIndex {

	static void maxValueDifference(int[] input1, int[] input2) {

		if (input1.length == input2.length) {
			boolean flag = true;
			for (int index = 0; index < input1.length; index++) {

				if (input1[index] != input2[index]) {
					flag = false;
					int max;
					if (input1[index] > input2[index]) {
						max = input1[index];
					} else {
						max = input2[index];
					}
					System.out.println("Values are not matching at index: " + index + " From (" + input1[index] + ","
							+ input2[index]+") and Max Value is "+max);
				}
			}
			if (flag == true) {
				System.out.println("Both arrays are indentical");
			}

		} else
			System.out.println("Provided arrays are not equal in Size");
	}

	public static void main(String[] args) {
		int[] input1 = { 10, 2, 9, 14, 3 };
		int[] input2 = { 10, 2, 18, 14, 13 };
		MaxValueAtDifferedIndex.maxValueDifference(input1, input2);
	}

}
