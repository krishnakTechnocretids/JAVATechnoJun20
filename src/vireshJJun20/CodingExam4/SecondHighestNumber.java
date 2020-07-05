package vireshJJun20.CodingExam4;

public class SecondHighestNumber {

	int high;
	int sHigh;

	void getSecondHighest(int[] num) {
		int high = num[0], sHigh = num[0];
		for (int index = 0; index < num.length; index++) {

			if (num[index] > high) {
				sHigh = high;
				high = num[index];
			} else if (num[index] > sHigh) {
				sHigh = num[index];
			}
		}
		System.out.println(sHigh);
	}

	public static void main(String[] args) {

		int[] number = { 10, 33, 56, 43, 99, 21 };

		new SecondHighestNumber().getSecondHighest(number);
	}
}
