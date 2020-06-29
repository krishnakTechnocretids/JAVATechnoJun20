/*Program 3: WAP to revers number (Consider Input as Integer not as String).
Example:-
Input:- 12345
Output:- 54321*/
package rachanaGJun20.Array;

import java.util.Scanner;

public class GenerateReverseNumber {

	// method will generate reverse of a given number
	void findReverseOfNumber(int number) {

		int remainder = 0;
		int reverseNumber = 0;

		while (number != 0) {
			remainder = number % 10;	
			number = number / 10;
			reverseNumber = reverseNumber * 10 + remainder;
		}
		System.out.println("reverse number of a given number is  :" + reverseNumber);
	}

	public static void main(String[] args) {
		GenerateReverseNumber generatereversenumber = new GenerateReverseNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to reverse");
		int number = scanner.nextInt();
		generatereversenumber.findReverseOfNumber(number);
		scanner.close();

	}

}
