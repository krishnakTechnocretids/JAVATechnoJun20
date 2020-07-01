package amitaRJun20;

public class PalindromeString {

	void isPalindromeString(String string) {
		System.out.println("The input String is : " + string);
		String reverse = "";
		for (int index = string.length() - 1; index >= 0; index--) {
			reverse += string.charAt(index);
		}
		if (string.equalsIgnoreCase(reverse))
			System.out.println("The given string is palindrome\n ");
		else
			System.out.println("The given string is not  palindrome\n ");
	}

	public static void main(String[] args) {
		PalindromeString palindromstring = new PalindromeString();
		palindromstring.isPalindromeString("rotator");
		palindromstring.isPalindromeString("Technocredits");
		palindromstring.isPalindromeString("Malayalam");
	}
}