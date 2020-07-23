public class SecondMax {

	void displaySecondMax(int[] number) {
		int largest = number[0];
		int secondMax = number[0];

		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "\t");
			if (number[i] > largest) {
				secondMax = largest;
				largest = number[i];

			} else if (number[i] > secondMax) {
				secondMax = number[i];

			}
		}

		System.out.println("\n Second Maximum number is: " + secondMax);

	}

	public static void main(String[] args) {
		SecondMax secondmax = new SecondMax();
		int number[] = { 10, 33, 56, 43, 99, 21 };
		secondmax.displaySecondMax(number);
	}
}