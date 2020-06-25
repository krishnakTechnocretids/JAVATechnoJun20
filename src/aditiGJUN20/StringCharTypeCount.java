/*
 Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

*/

package aditiGJUN20;

public class StringCharTypeCount {

	int digitCnt=0, upperCaseCnt=0, lowerCaseCnt=0, specialCharCnt=0; 
	
	// Method to check character type using Character class in JAVA.
	void getCharType(String name) {
		for(int index=0;index<name.length();index++) {
			char ch=name.charAt(index);
			if(Character.isDigit(ch))
				digitCnt++;
			else if(Character.isUpperCase(ch))
				upperCaseCnt++;
			else if(Character.isLowerCase(ch))
				lowerCaseCnt++;
			else
				specialCharCnt++;
		}
	}
	
	public static void main(String[] args) {

		String name="1rRpd3F9#K(E";
		StringCharTypeCount stringCharTypeCount= new StringCharTypeCount();
		stringCharTypeCount.getCharType(name);
		System.out.println("Input String: "+name);
		System.out.println("Total Digit: "+stringCharTypeCount.digitCnt+
				"\nTotal Letters: "+(stringCharTypeCount.upperCaseCnt+stringCharTypeCount.lowerCaseCnt)+
				"\nTotal UpperCase: "+stringCharTypeCount.upperCaseCnt+
				"\nTotal LowerCase: "+stringCharTypeCount.lowerCaseCnt+
				"\nTotal Special Char: "+stringCharTypeCount.specialCharCnt);
	}
}
