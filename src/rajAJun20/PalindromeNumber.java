package rajAJun20;

public class PalindromeNumber {
	
	void displayPlaindromeNumber(int number) {
		int originalNumber = number;
		int reverseNumber=0;
		while(number > 0 ) {
		reverseNumber = reverseNumber*10 + (number % 10);   //sum = sum + (num % 10);
		number = number/10;
		}
			if(originalNumber == reverseNumber) {
				System.out.println(reverseNumber + " : is a palindrome number of given number : " + originalNumber);
			} else {
				System.out.println(reverseNumber + " : is not a palindrome number of given number : " + originalNumber);
			}
	}

	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		palindromeNumber.displayPlaindromeNumber(45654);
		palindromeNumber.displayPlaindromeNumber(56789);
	}
}
