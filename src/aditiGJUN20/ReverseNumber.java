/*
 WAP to revers number (Consider Input as Integer not as String).
Example:-
Input:- 12345
Output:- 54321
*/


package aditiGJUN20;

public class ReverseNumber {
	
	// Method to reverse input integer.
	int getReverseNum(int inputNum) {
		int reverseNum=0;
		while(inputNum>0) {
			 reverseNum=reverseNum*10+(inputNum%10);
			 inputNum=inputNum/10;
		}
		return reverseNum;
	}
	
	public static void main(String[] args) {
		ReverseNumber reverseNumber=new ReverseNumber();
		System.out.println("Reverse Number of input integer 12345 is: "+reverseNumber.getReverseNum(12345));
		System.out.println("Reverse Number of input integer 455322 is: "+reverseNumber.getReverseNum(455322));
	}
}
