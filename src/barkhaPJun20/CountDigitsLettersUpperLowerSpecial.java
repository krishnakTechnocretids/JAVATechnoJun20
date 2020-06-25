package barkhaPJun20;

public class CountDigitsLettersUpperLowerSpecial {
	
	void countDigitsInString(String name) {
		int count=0;
		for(int index=0; index<name.length(); index++) {
			char ch=name.charAt(index);
			if (Character.isDigit(ch))
					count++;
		}
		System.out.println("Number of DIGITS in Predefined String are: "+count);
		
	}
	void countLettersInString(String name) {
		int count=0;
		for(int index=0; index<name.length(); index++) {
			char ch=name.charAt(index);
			if (Character.isLetter(ch))
					count++;
		}
		System.out.println("Number of LETTERS in Predefined String are: "+count);
		
		
	}
	void countUpperCaseInString(String name) {
		int count=0;
		for(int index=0; index<name.length(); index++) {
			char ch=name.charAt(index);
			if (Character.isUpperCase(ch))
					count++;
		}
		System.out.println("Number of UPPER CASE LETTERS in Predefined String are: "+count);
		
	}
	void countLowerCaseInString(String name) {
		int count=0;
		for(int index=0; index<name.length(); index++) {
			char ch=name.charAt(index);
			if (Character.isLowerCase(ch))
					count++;
		}
		System.out.println("Number of LOWER CASE LETTERS in Predefined String are: "+count);
		
	}
	void countSpecialCharInString(String name) {
		int count=0;
		for(int index=0; index<name.length(); index++) {
			char ch=name.charAt(index);
			if (!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isUpperCase(ch) && !Character.isLowerCase(ch))
					count++;
		}
		System.out.println("Number of SPECIAL CHARACTERS in Predefined String are: "+count);
		
	}
	public static void main(String[] args) {
	CountDigitsLettersUpperLowerSpecial count=new  CountDigitsLettersUpperLowerSpecial();
	String name="1rRpd3F9#K(E";	
	
	count.countDigitsInString(name);
	count.countLettersInString(name);
	count.countLowerCaseInString(name);
	count.countUpperCaseInString(name);
	count.countSpecialCharInString(name);

}
}
	
	