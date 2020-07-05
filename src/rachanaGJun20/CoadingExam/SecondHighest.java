package rachanaGJun20.CoadingExam;

public class SecondHighest {

	void findSecondHighest(int[] number) {

		int first_highest = number[0];
		int second_highest = number[0];

		for (int index = 0; index < number.length; index++) {
			if (number[index] > first_highest) {
				first_highest = number[index];
			} else if (number[index] > second_highest && second_highest < first_highest) {
				second_highest = number[index];
			}
		}
		System.out.println("Second highest number is: "+second_highest);
	}

	public static void main(String[] args) {
		SecondHighest secondhighest = new SecondHighest();
		int[] number = { 10, 33, 56, 43, 99, 21, 79};
		System.out.println("input array : { 10, 33, 56, 43, 99, 21, 79}");
		secondhighest.findSecondHighest(number);

	}

}
