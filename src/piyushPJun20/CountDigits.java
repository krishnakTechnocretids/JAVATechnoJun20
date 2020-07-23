public class CountDigits {
	void charFreq(String input){
		int digit=0, uCase=0, lCase=0, specialChar=0;
		for(int index=0;index<input.length();index++){
			if(Character.isDigit(input.charAt(index)))
				digit++;
			else if(Character.isUpperCase(input.charAt(index)))
					uCase++;
			else if(Character.isLowerCase(input.charAt(index)))
				lCase++;
			else
				specialChar++;
		}
		System.out.println(" Total digit: " +digit);
		System.out.println(" Total Letters: " + (uCase+lCase));
		System.out.println(" Total Uppercase: " + uCase);
		System.out.println(" Total Lowercase: " + lCase);
		System.out.println(" Total Special char: " + specialChar);
	}
	public static void main(String[] args){
		CountDigits count = new CountDigits();
		count.charFreq("1rRpd3F9#K(E");
	}
}
