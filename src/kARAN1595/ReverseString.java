package kARAN1595;

public class ReverseString {
	void displayReverseOfString(String str) {
		System.out.print("Input Value: " + str + "\nOutput Value: ");
		for (int index = (str.length() - 1); index >= 0; index--) {
			System.out.print(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		ReverseString reverse = new ReverseString();
		String input = "Hello this is technocredits";
		reverse.displayReverseOfString(input);
	}

}
