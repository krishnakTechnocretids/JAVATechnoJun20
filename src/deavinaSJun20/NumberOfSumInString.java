package deavinaSJun20;

public class NumberOfSumInString {

	public void findSumOfNumbers(String input) {
		System.out.println("You entered String as" + input);
		String tempDigit = "0";
		int sumOfNo = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				tempDigit += input.charAt(index);
			} else {
				sumOfNo += Integer.parseInt(tempDigit);
				tempDigit = "0";
			}
		}
		if (!tempDigit.equals("0"))
			sumOfNo += Integer.parseInt(tempDigit);
		System.out.println("Sum of all numbers in String is: " + sumOfNo + "\n");
	}

	public static void main(String[] args) {
		new NumberOfSumInString().findSumOfNumbers("P71Rr29T2E");
		new NumberOfSumInString().findSumOfNumbers("P6Rr29T2E3");
	}

}
