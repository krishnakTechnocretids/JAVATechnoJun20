package vaishnaviVJun20_arrayExamples;

//Verify given string is palindrome or not

public class PalindromeString {
	
	void findIfStringIsPalindrome(String name) {
		String reverse="", originalName = name;
		for(int index=name.length()-1;index>=0;index--) {
			reverse = reverse+name.charAt(index);		
		}
		if(originalName.equals(reverse))
			System.out.println(" Given String " +originalName +" is Palindrome");
		else
			System.out.println(" Given String " +originalName +" is not Palindrome");
	}

	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		palindromeString.findIfStringIsPalindrome("radar");
		palindromeString.findIfStringIsPalindrome("technocredits");
	}
}
