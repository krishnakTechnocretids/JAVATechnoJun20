package harshadBJun20.Assignment20;
/*Program 3: WAP to revers number (Consider Input as Integer not as String).
Example:-
Input:- 12345
Output:- 54321*/
public class PrintReverseIntegerNumber {
	void printReverseNumbers(int num) {
		int seperateNum=0, reversedNum = 0;
		while(num>0) {
			seperateNum = num % 10;
			reversedNum = reversedNum * 10 + seperateNum;
			num = num / 10;	
		}
		System.out.println("Reverse order Number: "+reversedNum);
	}
	public static void main(String[] args) {
		PrintReverseIntegerNumber printReverseIntegerNumber = new PrintReverseIntegerNumber();
		int number = 12345;
		System.out.println("Original Number: "+number);
		printReverseIntegerNumber.printReverseNumbers(number);
	}
}
