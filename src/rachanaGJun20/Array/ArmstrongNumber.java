package rachanaGJun20.Array;

import java.util.Scanner;

public class ArmstrongNumber {

	// method will find whether given number is Armstrong
	boolean isArmstrongNumber(int number) {
		int remainder = 0;
		double sum = 0;
		int givenNumber = number;

		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			sum = sum + Math.pow(remainder, 3);
		}
		return (givenNumber == sum);
	}

	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 2; i++) {
			System.out.println("Please enter a number");
			boolean flag = armstrongNumber.isArmstrongNumber(scanner.nextInt());
			if (flag)
				System.out.println("Number is Armstrong");
			else
				System.out.println("Number is not Armstrong");
		}
		scanner.close();
	}

}
