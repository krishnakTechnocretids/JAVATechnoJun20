package madhuraMJun20;

/*WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Output: Sum of all numbers in String is: 53
*/
public class SumOfNumbersInString {

	void sumOfNumber(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				int number = Integer.parseInt(String.valueOf(input.charAt(index)));
				sum += number;
			}
		}
		System.out.println("Sum of all numbers in String is : " + sum);
	}

	public static void main(String[] args) {
		SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString();
		String input = "J7yu9y8h1h8j4b7j3jjb6";
		sumOfNumbersInString.sumOfNumber(input);
	}
}