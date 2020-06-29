package anupSJun20;
/* Program 3: WAP to reverse number (Consider Input as Integer, not as String).
Example:-
Input:- 12345
Output:- 54321*/

public class ReverseNumber {
	static void findReverseNumber(int num) {
		int reverseNum = 0;
		while(num > 0) {
			reverseNum = reverseNum*10;
			reverseNum =reverseNum + num%10;
			num = num/10;
		}
		System.out.println("The Reverse Number is " +reverseNum);
		
	}
	public static void main(String[] args) {
		int num = 12345;
		System.out.println("The given Number is " +num);
		findReverseNumber(num);
	}

}
