package deavinaSJun20;

/* 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/
public class TestCount {
	public static void main(String[] args) {
		String name = "1rRpd3F9#K(E";
		System.out.println("Entered String : "+name);
		new TestCount().countDigitLetter(name);
	}

	void countDigitLetter(String name) {
		int countDigit = 0, countUppercase = 0, countLowercase = 0, countSpecialchar = 0, countLetter = 0;
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				countDigit++;
			} else if (Character.isLetter(name.charAt(i))) {
				countLetter++;
				if (Character.isLowerCase(name.charAt(i))) {
					countLowercase++;
				} else if (Character.isUpperCase(name.charAt(i))) {
					countUppercase++;
				}
			} else {
				countSpecialchar++;
			}
		}
		System.out.println("Total Digits in String : " + countDigit);
		System.out.println("Total Letters in String : " + countLetter);
		System.out.println("Total Uppercase in String : " + countUppercase);
		System.out.println("Total Lowercase in String : " + countLowercase);
		System.out.println("Total Special characaters in String : " + countSpecialchar);
	}

}
