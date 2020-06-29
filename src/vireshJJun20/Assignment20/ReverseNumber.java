/*
Program 3 WAP to reverse number (Consider Input as Integer not as String).
Example-
Input- 12345
Output- 54321
*/
package vireshJJun20.Assignment20;

public class ReverseNumber {

	void reverseIntegers(int input) {
		System.out.println("Input: " + input);
		String output = "";
		while (input > 0) {
			int temp = input % 10;
			output = output + String.valueOf(temp);
			input = input / 10;
		}
		System.out.println("Output: " + Integer.parseInt(output));
	}

	public static void main(String[] args) {
		new ReverseNumber().reverseIntegers(12345);
	}
}