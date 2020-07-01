/* Verify given number is palindrome or not. 
Input: number = 45654
Output : Given number 45654 is palindrome.*/
package palakSJun20;

public class PalindromeNumber {

	// Method to find Palindrome Number
	void findPalindromeNumber(int number) {
		int temp = number;
		int remainder = 0;		
		while (temp > 0) {
			remainder = remainder * 10 + (temp % 10);  //
			temp = temp / 10;
		}		
		if (remainder == number)
			System.out.println("Given Number "+number + " is Palindrome ");
		else
			System.out.println("Given Number "+number + " is not Palindrome");
	}

	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		palindromeNumber.findPalindromeNumber(45654);
		palindromeNumber.findPalindromeNumber(554488);
	}
}
