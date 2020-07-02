package madhuraMJun20.scannerClass;

/*Verify given number is palindrome or not. 
Input: number = 45654
Output : Given number 45654 is palindrome.*/
public class PalindromeNumber {
	int reverseNum;

	void findPalindromeNum(int number) {
		int mod = 0;
		while (number > 0) {
			mod = number % 10;      // mod= mod *10 + number% 10; number = number/10;
			number = number / 10;
			reverseNum = mod + reverseNum * 10;
		}
	}

	void display(int number) {
		findPalindromeNum(number);
		if (number == reverseNum)
			System.out.println("Given Number " + number + " is palindrome");
		else
			System.out.println("Given Number " + number + " is not a palindrome");
	}

	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		palindromeNumber.display(45654);
		System.out.println();
		palindromeNumber.display(56789);
	}
}