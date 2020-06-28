package kartikeyDJune20;

public class AllDifferIndexInStringArray {
	static void checkDifference(String[] input1, String[] input2) {

		if (input1.length == input2.length) {
			boolean flag = true;
			for (int index = 0; index < input1.length; index++) {
				if (!input1[index].equals(input2[index])) {
					flag = false;
					System.out.println("Values are not matching at index: " + index + " First Array values is: "
							+ input1[index] + " second array value is: " + input2[index]);
				}
			}
			if (flag == true) {
				System.out.println("Both arrays are indentical");
			}

		} else
			System.out.println("Provided arrays are not equal in Size");
	}

	public static void main(String[] args) {
		String[] input1 = { "Harsh", "Maulik", "Krishna", "Technocredts" };
		String[] input2 = { "Harsh", "Maulik", "Technocredts", "Krishna" };
		AllDifferIndexInStringArray.checkDifference(input1, input2);
	}
}
