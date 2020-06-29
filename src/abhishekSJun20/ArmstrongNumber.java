package abhishekSJun20;
/*
 Program 4: WAP to check if a number is Armstrong or not.
Example:-
Input:- 153
Output:-153
hint:- (1*1*1)+(5*5*5)+(3*3*3)
1+125+27
153
*/

public class ArmstrongNumber {
//method check the number is Armstrong or not
	void checkArmStrongNumber(int num) {
		int number, number1, totalSum = 0;
		number = num;
		while (number != 0) {
			number1 = number % 10;
			totalSum +=  number1* number1 * number1;
			number /= 10;
		}

		if (totalSum == num)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " is not an Armstrong number");
	}

	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber=new ArmstrongNumber();
		armstrongNumber.checkArmStrongNumber(153);

	}
}
