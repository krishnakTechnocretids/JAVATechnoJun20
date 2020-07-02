package anshuKJun20;

public class StringPalindrome {

	void finfPalindromeString(String name) {
		String result = "";
		for (int index = (name.length() - 1); index >= 0; index--) {
			result = result + name.charAt(index);
		}
		if (name.equalsIgnoreCase(result)) {
			System.out.println("Given string " + name + " is palindrome");
		} else {
			System.out.println("Given string " + name + " is not palindrome");
		}
	}

	public static void main(String[] args) {
		StringPalindrome stringpalindrome = new StringPalindrome();
		stringpalindrome.finfPalindromeString("Radar");
		stringpalindrome.finfPalindromeString("Technocredits");
	}
}
