package abhishekSJun20;
/*
 * 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
 */

public class CountcharaterOfstring {
 //method to find Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string 
	void countChars(String input) {
		int countDigit = 0, countLowerCase = 0, countUpperCase = 0, countSpecialChar = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				countDigit++;
			else if (Character.isLowerCase(input.charAt(index)))
				countLowerCase++;
			else if (Character.isUpperCase(input.charAt(index)))
				countUpperCase++;
			else
				countSpecialChar++;
		}
		System.out.println("Total digit: " + countDigit + "\nTotal Letters: " + (countUpperCase + countLowerCase)
				+   "\nTotal Lowercase: " + countLowerCase + "\nTotal Uppercase: " + countUpperCase
				+ "\nTotal Special char: " + countSpecialChar);
	}

	public static void main(String[] args) {
		CountcharaterOfstring countCharsOfString = new CountcharaterOfstring();
		countCharsOfString.countChars("1rRpd3F9#K(E");
	}
}
