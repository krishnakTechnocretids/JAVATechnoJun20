package rajAJun20;

public class PalindromeString {

	void displayPalindromeString(String name) {
		String originalString = name; 
		String reverseString = ""; 
		for(int index = name.length()-1 ; index >= 0 ; index--){
			reverseString = reverseString + name.charAt(index);
			}
			if(originalString.equals(reverseString)) {
				System.out.println(reverseString +  " : is palindrome name of given name : " +name);
			} else {
				System.out.println(reverseString +  " : is not palindrome name of given name : " +name);
				}
		}
		
		public static void main(String[] args) {
			PalindromeString palindromeString = new PalindromeString();
			palindromeString.displayPalindromeString("radar");
			palindromeString.displayPalindromeString("technocredits");
		}
	}

