package aadeshJun20;

public class IntegerSum {

	void digitSum(String givenString) {

		int sum = 0;
		for (int i = 0; i < givenString.length(); i++) {
			if (Character.isDigit(givenString.charAt(i))) {
				int value = Character.getNumericValue(givenString.charAt(i));
				sum = sum + value;
			}
		}
		System.out.println("Sum of all digits in String is: " + sum);
	}

	public static void main(String[] args) {
		String passedString = "J7yu9y8h1h8j4b7j3jjb6";
		new IntegerSum().digitSum(passedString);
	}
}
