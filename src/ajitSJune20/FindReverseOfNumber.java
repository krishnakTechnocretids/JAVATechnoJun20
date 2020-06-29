package ajitSJune20;

public class FindReverseOfNumber {

	static int reverse(int number) {
		int reverse = 0;
		do {
			reverse = reverse * 10 + (number % 10);
			number = number / 10;

		} while (number > 0);
		return reverse;
	}

	public static void main(String[] args) {

		int number = 546;
		System.out.println("Reverse of number: " + number + " is : " + reverse(number));
	}
}
