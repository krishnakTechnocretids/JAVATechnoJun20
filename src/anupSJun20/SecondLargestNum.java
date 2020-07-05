package anupSJun20;

/* To find the Second Largest number of an Array*/
public class SecondLargestNum {
	static void findSecondLargestNumber(int[] input) {
		int max = input[0];
		int secMax = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] > max) {
				secMax = max;
				max = input[index];
			} else if (input[index] > secMax) {
				secMax = input[index];
			}

		}
		System.out.println("The Second Highest Number is " + secMax);
	}

	public static void main(String[] args) {
		int[] num = { 10, 33, 56, 43, 99, 21 };
		findSecondLargestNumber(num);
	}

}
