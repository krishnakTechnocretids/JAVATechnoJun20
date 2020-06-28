package kartikeyDJune20;

public class FirstDifferIndexArray {

	void firstDifferIndex(int[] input1, int[] input2) {

		if (input1.length == input2.length) {

			boolean flag = true;
			
			for (int index = 0; index < input1.length; index++) {

				if (input1[index] != input2[index]) {
					flag = false;
					System.out.println("Values are not matching at index: " + index);
				}
			}
			if (flag == true) {
				System.out.println("Both arrays are indentical");
			}
		} else
			System.out.println("Provided arrays are  not equal in Size");
	}
	public static void main(String[] args) {
		FirstDifferIndexArray firstDifferIndexArray = new FirstDifferIndexArray();
		int[] input1 = { 10, 2, 9, 14, 3 };
		int[] input2 = { 10, 2, 18, 14, 13 };
		firstDifferIndexArray.firstDifferIndex(input1, input2);

	}

}
