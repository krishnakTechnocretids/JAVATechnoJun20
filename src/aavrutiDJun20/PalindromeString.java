//Print whether given String is Palindrome or not
package aavrutiDJun20;

public class PalindromeString {
	
	void palindromeStringOrNot(String input) {
		String palindromeInput = "";
		
		for(int index=input.length()-1;index>=0;index--) {
			palindromeInput += String.valueOf(input.charAt(index));
		}
		
		if(palindromeInput.equalsIgnoreCase(input))
			System.out.println("\nGiven string "+ input + " is Palindrome.");
		else
			System.out.println("\nGiven string "+ input + " is not Palindrome.");
	}

	public static void main(String[] args) {		
		PalindromeString palindromeString = new PalindromeString();	
		
		palindromeString.palindromeStringOrNot("Naman");
		palindromeString.palindromeStringOrNot("technocredits");
	}
}