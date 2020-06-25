package madhuraMJun20;
/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/
public class MethodsOfCharClass {
	
	void findCharFreq(String name) {
		int digitC=0 ; int upperCase=0; int lowerCase = 0; int spChar=0;
		
		for(int index=0;index<name.length();index++) {
			
			char ch= name.charAt(index);
			if(Character.isDigit(ch))
				digitC++;
			else if(Character.isUpperCase(ch))
					upperCase++;
			else if(Character.isLowerCase(ch))
					lowerCase++;
			else
				spChar++;			
		}
		System.out.println("Total Digits : " +digitC);
		System.out.println("Total Letters : " +(upperCase+lowerCase));
		System.out.println("Total Upper Case : " +upperCase);
		System.out.println("Total Lower case : " +lowerCase);
		System.out.println("Total Special characters : " +spChar);
		
	}
	public static void main(String[] args) {
		MethodsOfCharClass methodsOfCharClass =new MethodsOfCharClass();
		String str = "1rRpd3F9#K(E";
		
		methodsOfCharClass.findCharFreq(str);
	}
}
