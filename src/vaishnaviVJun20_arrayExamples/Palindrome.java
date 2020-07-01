package vaishnaviVJun20_arrayExamples;

//Verify given number is palindrome or not

public class Palindrome {
	
	void findIfNumberIsPalindrome(int number) {
		int reverse = 0, originalNum = number;
		while(number>0) {
			reverse = 10*reverse+(number%10);
			number = number/10;
		}
		if(originalNum == reverse)
		   System.out.println("Given number " +originalNum +" is Palindrome");
		else
			System.out.println("Given number " +originalNum +" is not Palindrome");
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		palindrome.findIfNumberIsPalindrome(45654);
		palindrome.findIfNumberIsPalindrome(56789);
	}
}