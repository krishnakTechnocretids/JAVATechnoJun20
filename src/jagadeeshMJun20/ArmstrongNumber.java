/*Program 4: WAP to check if a number is Armstrong or not.
Example:-
Input:- 153
Output:-153
hint:- (1*1*1)+(5*5*5)+(3*3*3)
1+125+27
153 */
package jagadeeshMJun20;

import java.util.Scanner;

public class ArmstrongNumber {
	int getOutput(int num) {
		int sum = 0;
		while (num > 0) {
			sum += ((num % 10) * (num % 10) * (num % 10));
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] agrs) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scanner.nextInt();
		if (num == armstrongNumber.getOutput(num))
			System.out.println("Number is Armstrong number:" + num);
		else
			System.out.println("Number is Not an Armstrong number:" + num);
		scanner.close();
	}
}
