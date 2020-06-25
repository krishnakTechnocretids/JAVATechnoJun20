/*Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

package palakSJun20;

public class CountCharacterFromString {
	static int totalCount = 0;
	
	void countDifferentCharacters(String string){
		int digitCount = 0 , upperCaseCount = 0 , lowerCaseCount = 0 , specialCharacterCount = 0;
			for (int index = 0; index < string.length(); index++) {
				char ch = string.charAt(index);
				if(Character.isDigit(ch))
					digitCount++;
				else if(Character.isUpperCase(ch)) {
					upperCaseCount++;
					totalCount++;
				}
				else if(Character.isLowerCase(ch)) {
					lowerCaseCount++;
					totalCount++;
				}
				else 
					specialCharacterCount++;
			}
			System.out.println("Total Digit : " + digitCount +"\n"+ "Total UpperCase : "+ upperCaseCount+"\n"+"Total LowerCase : "+lowerCaseCount
					+"\n"+ "Total Special Char : "+specialCharacterCount+"\n"+ "Total Letters : " + totalCount);
		}

	public static void main(String[] args) {
		
		CountCharacterFromString countCharacterFromString = new CountCharacterFromString();
		String string = "1rRpd3F9#K(E";
		System.out.println("Input : " + string);
		countCharacterFromString.countDifferentCharacters(string);;

	}

}
