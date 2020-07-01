package archanaNJun20;

public class PalindromeString {
	void palindromeString(String inputString){ 
		String originalstring=inputString;
		int length=inputString.length();
		String newString = "";
		for(int index=length-1;index>=0;index--){
			char ch=inputString.charAt(index);
			newString=newString+String.valueOf(ch);
		}
		if(newString.equalsIgnoreCase(originalstring))

			System.out.println("Given String : "+ originalstring +" is palindrome");
		else 
			System.out.println("Given String : "+ originalstring +" is not palindrome");
	}
	public static void main(String[] args){
		PalindromeString palindromeString= new PalindromeString();
		palindromeString.palindromeString("radar");
		palindromeString.palindromeString("technocredits");
	}
}