package aasthaJJun20;

public class FindSecondHighestNumber {
	
	int secondMaxNumber(int[] numbers) {
		int max = numbers[0];
		int secondMax = numbers[1];
		for (int index = 0; index < numbers.length; index++) {
			if(numbers[index] > max) {
				secondMax = max;
				max = numbers[index];
			}
			else if(numbers[index] > secondMax && numbers[index] != max)
				secondMax = numbers[index];
		}
		return secondMax;
	}

	public static void main(String[] args) {
		int[] arr = {98,99,56,43,99,21,79};
		FindSecondHighestNumber findSecondHighestNumber = new FindSecondHighestNumber();
		System.out.println("second highest number is : "+(findSecondHighestNumber.secondMaxNumber(arr)));
	}
}
