package anupSJun20;
/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

public class CharacterMethods {
	static void findCharCountInString(String str) {
		int digitCount = 0;
		int uppercase = 0;
		int lowercase = 0;
		int specialChar = 0;
		for(int index = 0;index<str.length();index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)==true)
				digitCount++;
			else if(Character.isLetter(ch) == true) {
			if(Character.isUpperCase(ch) == true)
				uppercase++;
			else
				lowercase++;
			}
			else
				specialChar++;
		}
		System.out.println(" Total digit : "+ digitCount + "\n Total Letters: " + (uppercase+lowercase) + "\n Total Uppercase: "+ uppercase);
		System.out.println(" Total Lowercase : "+ lowercase + "\n Total Special Char " + specialChar);
	}
	public static void main(String[] args) {
		String str = "1rRpd3F9#K(E";
		findCharCountInString(str);
	}

}
