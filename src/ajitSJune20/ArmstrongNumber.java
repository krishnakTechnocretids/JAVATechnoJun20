//WAP to check if a number is Armstrong or not
package ajitSJune20;

public class ArmstrongNumber {

	static void checkArmstrong(int input) {
		int total = 0;
		int number = input;
		for (; number != 0; number /= 10)
			// total += (number % 10) * (number % 10) * (number % 10);
			total += Math.pow((number % 10), 3);

		if (total == input)
			System.out.println(input + " is an Armstrong number");
		else
			System.out.println(input + " is not an Armstrong number");
	}

	public static void main(String[] args) {

		int input = 153;
		checkArmstrong(input);
	}
}
