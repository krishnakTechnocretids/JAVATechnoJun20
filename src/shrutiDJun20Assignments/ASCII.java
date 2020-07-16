package shrutiDJun20Assignments;

/*
 Input: J7u9y8h1h8j4b7j3j6
 Ouput: Sum of all numbers in String is - 54.
 */
public class ASCII {

	void findSum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) >= 48 && input.charAt(index) <= 57) {
				sum += Integer.parseInt(String.valueOf(input.charAt(index)));
			}
		}
		System.out.println("Sum of digit in given String '"+input+ "' is: "+sum);
	}
	public static void main(String[] args) {
		ASCII ascii = new ASCII();
		ascii.findSum("J7u9y8h1h8j4b7j3j6");
	}
}
