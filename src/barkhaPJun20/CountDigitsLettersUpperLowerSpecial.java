package barkhaPJun20;

public class CountDigitsLettersUpperLowerSpecial {
	
	void countDigitsLettersUpperLowerSpecialInString(String name) {
		int countDigit=0; 
		//int countLetters=0;
		int countUpperCase=0;
		int countLowerCase=0;
		int countSpecialChar=0;
		for(int index=0; index<name.length(); index++) {
			char ch=name.charAt(index);
			
			if (Character.isDigit(ch)) {
				countDigit++;
			}
				else if (Character.isUpperCase(ch)) {
					countUpperCase++;
				}
				else if(Character.isLowerCase(ch)) {
					countLowerCase++;
				}
				else
					countSpecialChar++;
			
			}
		System.out.println("The DIGITS present in "+name +" are: "+countDigit);
		//System.out.println("The LETTERS present in "+name +" are: "+countLetters);	
		System.out.println("The LETTERS present in "+name +" are: "+(countUpperCase+countLowerCase));
		System.out.println("The UPPER CASE LETTERS present in "+name +" are: "+countUpperCase);	
		System.out.println("The LOWER CASE LETTERS present in "+name +" are: "+countLowerCase);	
		System.out.println("The SPECIAL CHARACTERS present in "+name +" are: "+countSpecialChar);	

	}
	public static void main(String[] args) {
	CountDigitsLettersUpperLowerSpecial count=new  CountDigitsLettersUpperLowerSpecial();
	String name="1rRpd3F9#K(E";	
	
	count.countDigitsLettersUpperLowerSpecialInString(name);
	}
}


	
	
	
	