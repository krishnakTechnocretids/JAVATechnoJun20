package anshuKJun20;

public class SumOfNumberFromString {

	void findSumOfNumber(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)) == true) { // Interger.Parseint() takes String and return integer
				int num = Integer.parseInt(input.valueOf(input.charAt(index))); // valueOf() take character and returns string
				sum += num;                                                    // charAt() takes character and return character
			}
		}
		System.out.println("Sum of all number in String is: " + sum);
	}

	public static void main(String[] args) {
		SumOfNumberFromString sumOfNumber = new SumOfNumberFromString();
		String input = "J7yu9y8h1h8j4b7j3jj51";
		System.out.println("String  ---->" + input);
		sumOfNumber.findSumOfNumber(input);
	}
}
