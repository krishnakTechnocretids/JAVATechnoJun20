package prashantCJune20;


public class PalindromeString {	
	String rev = "";	
	void PalinString(String input){		
		String word = input.toLowerCase();
		System.out.println("convarted word is "+word);
		for(int index = word.length()-1;index>=0;index--) {
			rev = rev+word.charAt(index);
		}
		if(rev.equals(word))System.out.println("Given "+word+" Word is Palindrome");
		else System.out.println("Given "+word+" Word is not Palindrome");
		}
	
	public static void main(String[] args) {
		
		PalindromeString palindromestring = new PalindromeString();
		palindromestring.PalinString("NaMan");
		palindromestring.PalinString("Maulik");
	}
	

}
