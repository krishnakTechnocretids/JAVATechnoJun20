package amitaRJun20;

public class CheckCharacterMethods {
	
	void testCharMethod(String name,char ch) {
		int digitCount=0;
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int specialCharCount=0;
		
		for(int index=0;index<name.length();index++) {
			if(Character.isDigit(name.charAt(index))) {
				digitCount++;
			}
			else if(Character.isLetter(name.charAt(index))) {
				if(Character.isUpperCase(name.charAt(index))) 
					upperCaseCount++;
				else 
					lowerCaseCount++;
				}			
			else 
				specialCharCount++;
		}
		System.out.println("The given string is "+name);
		System.out.println("total Digit : "+digitCount);
		System.out.println("Total Letters : "+(upperCaseCount+lowerCaseCount));
		System.out.println("Total Uppercase : "+upperCaseCount);
		System.out.println("Total Lowercase : "+lowerCaseCount);
		System.out.println("Total Special Character : "+specialCharCount);	
	}

	public static void main(String[] args) {
		CheckCharacterMethods charMethod=new CheckCharacterMethods();
		String input=new String("1rRpd3F9#K(E");
		char ch=input.charAt(0);
		charMethod.testCharMethod(input,ch);
	}
}
