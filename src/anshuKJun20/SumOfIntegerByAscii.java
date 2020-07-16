package anshuKJun20;

public class SumOfIntegerByAscii {

	int getSumOfAllNumnersInJava(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) >= '0' && input.charAt(index) <= '9') {
				sum += (input.charAt(index) - '0');
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String input = "J7u9y8h1h8j4b7j3j6";
		System.out.println(
				" Sum of integer in given string is " + new SumOfIntegerByAscii().getSumOfAllNumnersInJava(input));
	}
}
