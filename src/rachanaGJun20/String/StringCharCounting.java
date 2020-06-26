/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

package rachanaGJun20.String;

public class StringCharCounting {

	void countCharByCategory(String inputstr) { // method will count digits,letters,alphabets(U+L),special symbols

		int digitcount = 0;
		int lowercasecount = 0;
		int uppercasecount = 0;
		int specialcharcount = 0;

		for (int i = 0; i < inputstr.length(); i++) {

			if (Character.isLowerCase(inputstr.charAt(i)))
				lowercasecount++;
			else if (Character.isUpperCase(inputstr.charAt(i)))
				uppercasecount++;

			else if (Character.isDigit(inputstr.charAt(i)))
				digitcount++;
			else
				specialcharcount++;
		}
		System.out.println("Total Digits: " + digitcount + "\nTotal letters: " + (lowercasecount+uppercasecount) + "\nTotal Uppercase: "
				+ uppercasecount + "\nTotal lowercase: " + lowercasecount + "\nTotal Special character: "
				+ specialcharcount);

	}

	public static void main(String[] args) {
		StringCharCounting stringcharcounting = new StringCharCounting();
		String str = "1rRpd3F9#K(E";
		System.out.println("Input String is:" + str);
		stringcharcounting.countCharByCategory(str);
	}

}
