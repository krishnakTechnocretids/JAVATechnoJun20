package abhishekSJun20;
/*Print given string in reverse order.

Input : Hello this is technocredits
Output : stiderconhcet si siht olleH
*/

public class ReverseString {

	void displayReverseString(String str) {
		// Method to Reverse the String
		System.out.print("Input Value: " + str + "\nOutput Value: ");
		for (int index = (str.length() - 1); index >= 0; index--) {
			System.out.print(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String input = "Hello this is technocredits";
		reverseString.displayReverseString(input);
	}

}
