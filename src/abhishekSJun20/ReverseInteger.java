package abhishekSJun20;
/*
Program 3: WAP to reverse number (Consider Input as Integer not as String).
Example:-
Input:- 12345
Output:- 54321
*/

public class ReverseInteger {
//method to find the reverse a number
	void reverseNumber(int number) {
		int reverse = 0;
		int num = number;
		while (num != 0) {
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of the number is " + reverse);
	}
	
	public static void main(String[] args) {
		ReverseInteger reverseInteger = new ReverseInteger();
		reverseInteger.reverseNumber(12345);
	}
}

