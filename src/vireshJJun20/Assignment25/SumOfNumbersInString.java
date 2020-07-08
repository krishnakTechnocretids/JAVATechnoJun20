package vireshJJun20.Assignment25;

public class SumOfNumbersInString {
	int sum = 0;

	void getSum(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum = sum + Integer.parseInt(String.valueOf(str.charAt(index)));
			}
		}
		if (sum != 0) {
			System.out.println(str + " : String contains digits.");
			System.out.println("Sum of all digits is: " + sum);
		} else {
			System.out.println(str + " : String does not contain any digits.");
		}
	}

	public static void main(String[] args) {
		String str = "J7yu9y8h1h8j4b7j3jjb6"; // 190011 //J7yu9y8h1h8j4b7j3jjb6 // dflasdfa
		new SumOfNumbersInString().getSum(str);
	}
}