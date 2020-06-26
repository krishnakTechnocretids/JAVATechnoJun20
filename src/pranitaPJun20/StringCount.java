/* Assignment 17 : 25th Jun 2020

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

2) Write a program which print first and last index of every characters only if character has multiple occurrence.

Input : technocredits
Output :
t -> first index = 0 Last index = 11
e -> first index = 1 Last index = 8
c -> first index = 2 Last index = 6

Hint : To find first index of character --> indexOf() method
            To find last index of character --> lastIndexOf() method.
 */
package pranitaPJun20;

public class StringCount {
	
	void findDigitsLettersCharString(String input) {
		int countDigit=0,countLetter = 0,countUppercase=0,countLowerCase=0,countSpecial=0;
		
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) 
				countDigit++;
			
			else if(Character.isLowerCase(ch))
				countLowerCase++;
			
			else if (Character.isUpperCase(ch))
				countUppercase++;
			
			else
				countSpecial++;
					
	}
		System.out.println("\nTotal Digit: "+countDigit+"\nTotal Letters: "+(countLowerCase+countUppercase)+"\nTotal Uppercase:"+countUppercase+"\nTotal Lowercase:"+countLowerCase+"\nTotal Special char:"+countSpecial);
	
}
	
	
	public static void main(String[] args) {
		StringCount StringCount=new  StringCount();
		String input ="1rRpd3F9#K(E";
		StringCount.findDigitsLettersCharString(input);
	}

}
