package amitaRJun20;

public class CheckCharacterMethods {
	void testCharMethod(String name,char ch) {
		int digitCount=0;
		int letterCount=0;
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int specialCharCount=0;
		
		for(int index=0;index<name.length();index++) {
			if(Character.isDigit(name.charAt(index))) {
				digitCount++;
			}
			if(Character.isLetter(name.charAt(index))) {
				letterCount++;
			}
			if(Character.isUpperCase(name.charAt(index))) {
				upperCaseCount++;
			}
			if(Character.isLowerCase(name.charAt(index))) {
				lowerCaseCount++;
			}
		}
		System.out.println("The given string is "+name);
		System.out.println("total Digit : "+digitCount);
		System.out.println("Total Letters : "+letterCount);
		System.out.println("Total Uppercase : "+upperCaseCount);
		System.out.println("Total Lowercase : "+lowerCaseCount);
		System.out.println("Total Special char : "+(name.length()-(digitCount+upperCaseCount+lowerCaseCount)));		
	}

	public static void main(String[] args) {
		Test test=new Test();
		String input=new String("1rRpd3F9#K(E");
		char ch=input.charAt(0);
		test.testCharMethod(input,ch);
	}
}
