/*
count Digits,Letters, UpperCase characters, LowerCase characters, Special characters 
 from predefined string.
 */
package shrutiDJun20;

public class IndexOfEx2 {
	
	void findCount(String input){
		int digitCount=0;
		int upperCount=0;
		int lowerCount=0;
		int specialCount=0;
		int totalCount=0;
		
		//1rRpd3F9#K(E
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);
			if(Character.isDigit(ch))
					digitCount++;	
			else if(Character.isLetter(ch)){
				totalCount++;
	
		if(Character.isLowerCase(ch))
				lowerCount++;
			
		 if(Character.isUpperCase(ch))
				upperCount++;
			
			else 
				specialCount++;
		}	
		}
		System.out.println("Count of digit in the given string is "+ digitCount);
		System.out.println("Count of uppercase in the given string is "+ upperCount);
		System.out.println("Count of lowercase in the given string is "+ lowerCount);
		System.out.println("Count of special Character in the given string is "+ specialCount);
		System.out.println("Count of all Character in the given string is "+ totalCount);

	}
	
	public static void main(String[] args) {
		IndexOfEx2 indexOfEx2 = new IndexOfEx2();
		indexOfEx2.findCount("1rRpd3F9#K(E");
	}

}
