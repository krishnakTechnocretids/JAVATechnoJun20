package yashCJun20.Assignment22;
public class VerifyPalindromeString{
	void toVerifyPalindromeString(String name){
		String reverseName="";
		int length =name.length();
		for (int index = length - 1;index >= 0;index--)
			reverseName = reverseName + name.charAt(index);
	      if (name.equals(reverseName))
	         System.out.println("Given String "+name+" is a Palindrome");
	      else
	         System.out.println("Given String "+name+" is not a Palindrome");
	 
	   }
		public static void main(String [] args) {
			VerifyPalindromeString verifyPalindromeString = new VerifyPalindromeString();
			verifyPalindromeString.toVerifyPalindromeString("radar");
			verifyPalindromeString.toVerifyPalindromeString("technocredits");
		}
	
}