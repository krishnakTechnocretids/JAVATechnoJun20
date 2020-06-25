package maheshKJun20;

public class CharTypeBreakup {
	
	void checkCharType(String str) {
		//Method will find the number of Digits, Letters, Special Character, Uppercase letter and lowercase letter from the input string
		System.out.println("Input String value: " + str);
		int countDigit = 0, countLetters =0, countUppercase =0, countLowercase = 0, countSpecialChar =0;
		for (int index=0;index<str.length();index++) {			if (Character.isDigit(str.charAt(index))) {
				countDigit++;
			}else if (Character.isLetter(str.charAt(index))) {
				countLetters++;
				if (Character.isUpperCase(str.charAt(index))) {
					countUppercase++;
				}else {
					countLowercase++;
				}
			}else {
				countSpecialChar++;
			}
		}
		System.out.println("Total Digits: " + countDigit + "\nTotal Lettes: " + countLetters + "\nTotal UpperCase: " + countUppercase + "\nTotal LowerCase: " + countLowercase + "\nTotal Special Character: " + countSpecialChar + "\n");
	}
	
	public static void main(String[] args) {
		CharTypeBreakup charTypeBreakup = new CharTypeBreakup();
		String str = "1rRpd3F9#K(E";
		charTypeBreakup.checkCharType(str);	
	}

}
