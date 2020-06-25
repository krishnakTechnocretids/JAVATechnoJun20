/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2 */

package jagadeeshMJun20;

public class PreDefinedString {
	void displayAllChars(String input) {
		int digitCount=0,lowerCount=0,upperCount=0,specialCount=0,letterCount=0;
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
		if(	Character.isDigit(ch)) 
			digitCount++;
		else if(Character.isAlphabetic(ch)) {
			letterCount++;
			if(Character.isLowerCase(ch))
				lowerCount++;
			else
				upperCount++;
		}	
		else specialCount++;
			
		}
		System.out.println("Input String is:     "+ input);
		System.out.println("==================================");
		System.out.println("Total digits:  -----> "+digitCount);
		System.out.println("Total Letters:  ----> "+letterCount);
		System.out.println("Total Uppercase:  --> "+upperCount);
		System.out.println("Total Lowercase:  --> "+lowerCount);
		System.out.println("Total Special char:-> "+specialCount);
	}	
		
	
	public static void main(String[] agrs) {
		PreDefinedString preDefinedString = new PreDefinedString();
		String input="1rRpd3F9#K(E";
		preDefinedString.displayAllChars(input);
	}

}
