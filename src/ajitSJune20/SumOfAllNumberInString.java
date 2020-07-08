package ajitSJune20;

public class SumOfAllNumberInString {

	public int getSumOfNumber(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				// sum += Integer.parseInt(input.valueOf(ch));         //Solution 1
				// sum += Integer.parseInt(String.valueOf(ch));       //Solution 2
				sum += Character.getNumericValue(ch);                // Solution 3
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfAllNumberInString sumOfAllNumberInString = new SumOfAllNumberInString();
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		int sum = sumOfAllNumberInString.getSumOfNumber(str);
		if (sum != 0)
			System.out.println("Sum of all numbers in String " + str + " is: " + sum);
		else
			System.out.println("String " + str + " doesn't contain any Digit");
	}
}
