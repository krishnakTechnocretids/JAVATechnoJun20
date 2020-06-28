/*String input = "1Hh9PR34QP";
Hint : 1+9+3+4 [all digits]
output : 17*/

package rachanaGJun20.String;

public class SumOfDigits {

	void sum(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {

				sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));

			}

		}
		System.out.println("Sum" + sum);
	}

	public static void main(String[] args) {
		SumOfDigits sumofdigits = new SumOfDigits();
		String str = "1Hh9PR34QP";
		System.out.println("Input String is: " + str);
		sumofdigits.sum(str);
	}

}
