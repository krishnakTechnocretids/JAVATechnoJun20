package vaishnaviVJun20_arrayExamples;

public class StringMethods {
	
	void findCharacterType(String s) {
		int digitCount=0;
		int lowerCaseCount=0;
		int upperCaseCount=0;
		int letterCount=0;
		int specialCharCount=0;
		for(int index=0;index<s.length();index++) {
			if(Character.isDigit(s.charAt(index)))
				digitCount++;
			if(Character.isLetter(s.charAt(index)))
				letterCount++;
			if(Character.isUpperCase(s.charAt(index)))
				upperCaseCount++;
			if(Character.isLowerCase(s.charAt(index)))
				lowerCaseCount++;
			else
				specialCharCount++;
		}
		System.out.println("Total Digit: "+digitCount);
		System.out.println("Total Letter: "+letterCount);
		System.out.println("Total LowerCase: "+lowerCaseCount);
		System.out.println("Total UpperCase: "+upperCaseCount);
		System.out.println("Total SpecialCharacter: "+specialCharCount);
	}

	public static void main(String[] args) {
		StringMethods stringMethods = new StringMethods();
		String s= "1rRpd3F9#K(E";
		stringMethods.findCharacterType(s);
	}

}
