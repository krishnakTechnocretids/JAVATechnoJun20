package vireshJJun20.Assignment17;

public class StringMembers {

	void CheckString(String str){
		//int cLetter=0;
		int cLower=0;
		int cUpper=0;
		int cDigit=0;
		int cOther=0;
		for (int i=0; i<str.length(); i++){
			/*if(Character.isLetter(str.charAt(i))){
				cLetter++;
			}*/
			if (Character.isLowerCase(str.charAt(i))){
				cLower++;
			}
			else if (Character.isUpperCase(str.charAt(i))){
				cUpper++;
			}
			else if (Character.isDigit(str.charAt(i))){
				cDigit++;
			}
			else{
				cOther++;
			}
		}
		
		System.out.println(" - Total Digit: " + cDigit);
		System.out.println(" - Total Letters: " + (cUpper+cLower));	
		System.out.println(" - Total Uppercase: " + cUpper);
		System.out.println(" - Total Lowercase: " + cLower);
		System.out.println(" - Total Special char: " + cOther);
	}
	
	public static void main(String[] args){
		StringMembers sm= new StringMembers();
		sm.CheckString("1rRpd3F9#K(E");
	}
	
}
