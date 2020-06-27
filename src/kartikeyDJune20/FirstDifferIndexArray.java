package kartikeyDJune20;

public class FirstDifferIndexArray {

	void firstDifferIndex(int[] input1, int[] input2) {

		if (input1.length == input2.length) {

			boolean flag = true;
			int index = 0;
			for (; index < input1.length; index++) {

				if (input1[index] != input2[index]) {
					flag = false;
					System.out.println("Values are not matching at index: " + index);
					int max;
					int diff = 0;
					if (input1[index] > input2[index]) {
						max = input1[index];
						diff = input1[index] - input2[index];
					} else {
						max = input2[index];
						diff = input2[index] - input1[index];
					}
					System.out.println("Values are not matching at index: " + index + " From (" + input1[index] + ","
							+ input2[index] + ") Max value is " + max + " And difference between two is " + diff);

				}
			}
			if (flag == true) {
				System.out.println("both arrays are indentical");
			} else
				System.out.println("Bothe arrays are not identical");

		} else
			System.out.println("Provided arrays are  not equal");

	}

	public static void main(String[] args) {
		FirstDifferIndexArray firstDifferIndexArray = new FirstDifferIndexArray();
		int[] input1 = { 10, 2, 9, 14, 3 };
		int[] input2 = { 10, 2, 18, 14, 13 };
		firstDifferIndexArray.firstDifferIndex(input1, input2);

	}

}
