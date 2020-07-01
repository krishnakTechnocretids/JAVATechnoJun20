//Print whether given number is Palindrome or not
package aavrutiDJun20;

public class PalindromeNumber {
	
	void palindromeNoOrNot(int number) {		
		int num = number;
		int reverseNumber = 0;		
		do {
			reverseNumber = (reverseNumber*10) + (num%10);
			num = num/10;
		}while(num!=0);
		
		if(number == reverseNumber)
			System.out.println("\nGiven number "+ number + " is Palindrome.");
		else
			System.out.println("\nGiven number "+ number + " is not Palindrome.");
	}
	
	public static void main(String[] args) {		
		PalindromeNumber palindromeNumber = new PalindromeNumber();		
		palindromeNumber.palindromeNoOrNot(45654);
		palindromeNumber.palindromeNoOrNot(56789);
	}
}