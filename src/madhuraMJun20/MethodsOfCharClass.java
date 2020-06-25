package madhuraMJun20;

public class MethodsOfCharClass {
	
	void findCharFreq(String name) {
		int digitC=0 ; int letterC =0; int upperCase=0; int lowerCase = 0; int spChar=0;
		
		for(int index=0;index<name.length();index++) {
			
			char ch= name.charAt(index);
			if(Character.isDigit(ch))
				digitC++;
			else if (Character.isLetter(ch)) {
				letterC++;
				if(Character.isUpperCase(ch))
					upperCase++;
				if(Character.isLowerCase(ch))
					lowerCase++;
			}
			else
				spChar++;			
		}
		System.out.println("Number of digits in the given String : " +digitC);
		System.out.println("Number of letters in the given String : " +letterC);
		System.out.println("Number of Upper Case char in the given String : " +upperCase);
		System.out.println("Number of lower case char in the given String : " +lowerCase);
		System.out.println("Number of Special characters in the given String : " +spChar);
		
	}
	public static void main(String[] args) {
		MethodsOfCharClass methodsOfCharClass =new MethodsOfCharClass();
		String str = "1rRpd3F9#K(E";
		
		methodsOfCharClass.findCharFreq(str);
	}
}
