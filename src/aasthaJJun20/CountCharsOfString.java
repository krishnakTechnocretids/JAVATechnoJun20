package aasthaJJun20;

public class CountCharsOfString {
	void countChars(String input){
		int countDigit=0, countUpperCase=0, countLowerCase=0, countSpecialChar=0;
		for(int index=0;index<input.length();index++){
			if(Character.isDigit(input.charAt(index)))
				countDigit++;
			else if(Character.isUpperCase(input.charAt(index)))
					countUpperCase++;
			else if(Character.isLowerCase(input.charAt(index)))
				countLowerCase++;
			else
				countSpecialChar++;
		}
		System.out.println("Total digit: "+countDigit+"\nTotal Letters: "+(countUpperCase+countLowerCase)+"\nTotal Uppercase: "+countUpperCase+"\nTotal Lowercase: "+countLowerCase+"\nTotal Special char: "+countSpecialChar);
	}
	public static void main(String[] args){
		CountCharsOfString countCharsOfString = new CountCharsOfString();
		countCharsOfString.countChars("1rRpd3F9#K(E");
	}
}
