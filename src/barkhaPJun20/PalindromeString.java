package barkhaPJun20;

public class PalindromeString {
	
	void palindromeString (String originalName) {
		String name1=originalName;
		String temp="";                       //if we do not assign anything here, it will take null and will print nullr,nullra and so on in line 10."" is not a space considered as nothing
		
		for (int index=(name1.length()-1); index>=0; index--) {
			temp=temp+name1.charAt(index);   //String+anything(here character) will be String.
		}
		if (temp.equalsIgnoreCase(originalName))
			System.out.println("Name ("+originalName+") is a Palindrome Name.");
		else
			System.out.println("Name ("+originalName+") is Not a Palindrome Name.");
	}
	public static void main(String[] args) {
		PalindromeString palindromeString=new PalindromeString();
		//String name="radar";
		palindromeString.palindromeString("radar");
	}
}
