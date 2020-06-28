package anshuKJun20;

public class ReverseNumber {
	int add = 0;

	void dispalyReverseNumber(int number) {
		int number1 = number;
		while (number > 0) {
			int remainder = number % 10;
			int quotient = number / 10;
			number = quotient;
			add = add * 10;
			add += remainder;

		}
		System.out.println("Reverse number of " + number1 + " is:" + add);

	}

	public static void main(String[] args) {
		ReverseNumber reversenumber = new ReverseNumber();
		reversenumber.dispalyReverseNumber(12345);
	}
}