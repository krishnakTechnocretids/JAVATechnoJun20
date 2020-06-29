/*
WAP to check if a number is Armstrong or not. -> 
Example:-
Input:- 153
Output:-153
hint:- (1*1*1)+(5*5*5)+(3*3*3)
1+125+27
153
*/

package aditiGJUN20;

public class ArmstrongNumber {

	// Method to check number is Armstrong or not..
	void checkArmstrongNum(int number) {
		int sum = 0, inputNum = number;
		while (number > 0) {
			sum = (int) (sum + (Math.pow((number % 10), 3)));
			number = number / 10;
		}
		if (inputNum == sum)
			System.out.println("\nInput Number " + inputNum + " is Armstrong Number..");
		else
			System.out.println("\nInput NUmber " + inputNum + " is not an Armstrong Number..");
	}

	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		armstrongNumber.checkArmstrongNum(153);
		armstrongNumber.checkArmstrongNum(10111);
	}
}
