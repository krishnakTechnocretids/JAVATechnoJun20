package rajAJun20;

public class CountPredefinedString {
	void findCharacterType(String str) {
		int digitCount = 0;
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		int specialCharCount = 0;
		for(int index = 0; index < str.length(); index++) {
			if(Character.isDigit(str.charAt(index)))
				digitCount++;
			else if(Character.isUpperCase(str.charAt(index)))
				upperCaseCount++;
			else if(Character.isLowerCase(str.charAt(index)))
				lowerCaseCount++;
			else
				specialCharCount++;
		}
		System.out.println("Total Digits : " + digitCount);
		System.out.println("Total Letters : " + (lowerCaseCount+upperCaseCount));
		System.out.println("Total LowerCase: " + lowerCaseCount);
		System.out.println("Total UpperCase: " + upperCaseCount);
		System.out.println("Total SpecialChar : " + specialCharCount);
	}

	public static void main(String[] args) {
		CountPredefinedString stringMethods = new CountPredefinedString();
		String predefineStr= "1rRpd3F9#K(E";
		stringMethods.findCharacterType(predefineStr);
	}

}
