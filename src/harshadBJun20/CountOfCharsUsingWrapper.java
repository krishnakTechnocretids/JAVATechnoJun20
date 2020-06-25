package harshadBJun20;

/*Assignment 17 : 25th Jun 2020

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

public class CountOfCharsUsingWrapper{
	int digitCount,letterCount,uppercaseCount,lowercaseCount,specialCharCount;
	void printCountOfChars(String str1) {
		
		for(int index=0;index<str1.length();index++){
			if(Character.isDigit(str1.charAt(index))==true)
				digitCount++;
			else if(Character.isLetter(str1.charAt(index))==true)
				letterCount++;
			else
				specialCharCount++;
			if(Character.isUpperCase(str1.charAt(index))==true)
				uppercaseCount++;
			if(Character.isLowerCase(str1.charAt(index))==true)
				lowercaseCount++;	
			
		}
		System.out.println("Total digit: "+digitCount);
		System.out.println("Total Letter: "+letterCount);
		System.out.println("Total Uppercase: "+uppercaseCount);
		System.out.println("Total Lowercase: "+lowercaseCount);
		System.out.println("Total Special char: "+specialCharCount);
		
	}
	public static void main(String args[]){
		CountOfCharsUsingWrapper countOfCharsUsingWrapper = new CountOfCharsUsingWrapper();
		
		String str = "1rRpd3F9#K(E";
		System.out.println("Predefined String used: "+str);
		countOfCharsUsingWrapper.printCountOfChars(str);
			
	}
}
