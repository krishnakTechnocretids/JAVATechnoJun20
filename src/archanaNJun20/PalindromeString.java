package archanaNJun20;

public class PalindromeString {
	void printPalindromeString(String inputString){ 
		int length=inputString.length();
		String newString = "";
		for(int index=length-1;index>=0;index--){
			char ch=inputString.charAt(index);
			newString+=String.valueOf(ch);
		}
		if(newString.equalsIgnoreCase(inputString))
			System.out.println("Given String : "+ inputString +" is palindrome");
		else 
			System.out.println("Given String : "+ inputString +" is not palindrome");
	}
	public static void main(String[] args){
		PalindromeString palindromeString= new PalindromeString();
		palindromeString.printPalindromeString("radar");
		palindromeString.printPalindromeString("technocredits");
	}
}