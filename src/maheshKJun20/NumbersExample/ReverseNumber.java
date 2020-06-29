/*
WAP to reverse number (Consider Input as Integer not as String).
Example:-
Input:- 12345
Output:- 54321
*/

package maheshKJun20.NumbersExample;

public class ReverseNumber {
	
	int displayReverseNum(int num) {
		//Method to display reverse of Integer Number
		int reverseNum = 0;
		while (num>0) {
			reverseNum = (reverseNum *10) + (num%10);
			num = num/10;
		}
		return reverseNum;
	}
	
	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		int num = 12345;
		System.out.println("Reverse of " + num + " is: " + reverseNumber.displayReverseNum(num));
	}
}
