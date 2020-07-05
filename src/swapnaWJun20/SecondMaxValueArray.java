package swapnaWJun20;

public class SecondMaxValueArray {

	void findSecondMax(int[] number) {
		int highest = 0;
		int secondHighest = 0;

		for (int index = 0; index < number.length; index++) {
			if (number[index] > highest) {
				secondHighest = highest;
				highest = number[index];
			}
		}
		System.out.println(secondHighest);
	}

	public static void main(String[] args) {
		int[] number = { 10, 33, 56, 43, 99, 21 };
		SecondMaxValueArray secondMaxValueArray = new SecondMaxValueArray();
		secondMaxValueArray.findSecondMax(number);
	}
}
