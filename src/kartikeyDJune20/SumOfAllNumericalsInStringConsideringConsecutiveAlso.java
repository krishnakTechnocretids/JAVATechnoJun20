package kartikeyDJune20;

public class SumOfAllNumericalsInStringConsideringConsecutiveAlso {

	void sumOfAllNumericalsInString(String input) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
			} else {
				if (temp.length() != 0) {
					sum += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		sum = (temp.length() == 0) ? sum = sum : sum + Integer.parseInt(temp);
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfAllNumericalsInStringConsideringConsecutiveAlso sumOfAllNumericalsInStringConsideringConsecutiveAlso = new SumOfAllNumericalsInStringConsideringConsecutiveAlso();
		String input = "99A14X3ddsf142ls12p";
		sumOfAllNumericalsInStringConsideringConsecutiveAlso.sumOfAllNumericalsInString(input);

	}
}
