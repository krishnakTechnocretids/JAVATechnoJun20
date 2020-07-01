package ajitSJune20;

public class TestPalindromeString {
	static String revStr = "";

	static boolean isPalindromeString(String string) {
		if (string.equalsIgnoreCase(reverse(string))) {
			return true;
		}
		return false;
	}

	static String reverse(String string) {
		for (int index = string.length() - 1; index >= 0; index--) {
			revStr += string.charAt(index);
		}
		return revStr;
	}

	public static void main(String args[]) {

		String[] stringArray = { "radar", "technocredits" };
		for (String string : stringArray) {
			if (isPalindromeString(string) == true)
				System.out.println("Given String " + string + " is palindrome");
			else
				System.out.println("Given String " + string + " is not palindrome");
		}
	}
}