package deavinaSJun20;

public class ReverseStringClass {

	void reverseString(String name) {
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + String.valueOf(name.charAt(i));
		}
		System.out.println("Reverse of the string is : ---->    " + reverse);
	}

	public static void main(String[] args) {
		String input = "Hello this is technocredits";
		new ReverseStringClass().reverseString(input);
	}
}
