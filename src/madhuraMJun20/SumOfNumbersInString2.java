package madhuraMJun20;

/*Assignment 26 : 9th July 2020
WAP to sum all the numbers in given string.

Input: P71Rr29T2E
Ouput: Sum of all numbers in String is: 102

Input: P6Rr29T2E3
Ouput: Sum of all numbers in String is: 40*/
public class SumOfNumbersInString2 {
	void findSumOfNumber(String input) {
		int sum = 0;
		String temp = "0";

		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp = temp + Character.getNumericValue(input.charAt(index));
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}

		if (temp.length() != 0) {
			sum += Integer.parseInt(temp);
			System.out.println("Sum of all numbers in String is : " + sum);
		}
	}

	public static void main(String[] args) {
		SumOfNumbersInString2 sumOfNumbersInString2 = new SumOfNumbersInString2();
		sumOfNumbersInString2.findSumOfNumber("P71Rr29T2E");
		sumOfNumbersInString2.findSumOfNumber("P6Rr29T2E3");
	}
}