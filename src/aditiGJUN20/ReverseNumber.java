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
		int inputNum=12345;
		System.out.println("Reverse Number of input integer "+inputNum+" is: "+reverseNumber.getReverseNum(inputNum));
		
		int inputNum1=455322;
		System.out.println("Reverse Number of input integer "+inputNum1+" is: "+reverseNumber.getReverseNum(inputNum1));
	}
}
