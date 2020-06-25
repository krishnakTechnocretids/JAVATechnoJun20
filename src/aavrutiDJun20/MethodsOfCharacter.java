//Print count of Digits, Letters, UpperCase, LowerCase and Special Character in given input '1rRpd3F9#K(E'

package aavrutiDJun20;

public class MethodsOfCharacter {

	void verifyMethodsOfCharacter(String input) {
		int digitCnt = 0;
		int upperCaseCnt = 0;
		int lowerCaseCnt = 0;
		int specialChar = 0;
		
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch) == true) 
				digitCnt++;
			else if(Character.isUpperCase(ch) == true)
				upperCaseCnt++;
			else if(Character.isLowerCase(ch) == true)
				lowerCaseCnt++;
			else
				specialChar++;
		}
		System.out.println("Total Digit        : " + digitCnt);
		System.out.println("Total Letters      : " + (upperCaseCnt+lowerCaseCnt));
		System.out.println("Total Uppercase    : " + upperCaseCnt);
		System.out.println("Total Lowercase    : " + lowerCaseCnt);
		System.out.println("Total Special Char : " + specialChar);
	}
	
	public static void main(String[] args) {
		MethodsOfCharacter methodsOfCharacter = new MethodsOfCharacter();
		String input = "1rRpd3F9#K(E";
		
		methodsOfCharacter.verifyMethodsOfCharacter(input);		
	}
}
