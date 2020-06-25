/*Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/

package nikhilMJun20;

public class CharClassify {
	void findCharType(String str) {
		int digitCnt=0, upperCnt=0, lowerCnt=0, specialCnt=0;
		
		for(int index=0; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index)))
				digitCnt++;
			else if(Character.isLetter(str.charAt(index))) {
				if(Character.isLowerCase(str.charAt(index)))
					lowerCnt++;
				else
					upperCnt++;
				}
			else
				specialCnt++;
		}
		System.out.println("String Given: "+str+"\n\nTotal Digits: "+digitCnt+"\nTotal Letters: "+(lowerCnt+upperCnt)+"\nTotal Lower Case Letters: "+lowerCnt+"\nTotal Upper Case Letters: "+upperCnt+"\nTotal Special Characters: "+specialCnt);
	}
	
	public static void main(String[] args) {
		CharClassify charClassify = new CharClassify();
		
		String str = "1rRpd3F9#K(E";
		charClassify.findCharType(str);
	}
}
