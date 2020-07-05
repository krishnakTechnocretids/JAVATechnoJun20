package ajitSJune20;

public class CodingExam4 {

	public static void printSecondLargestNumInArray(int array[]) {
		int firsthighest = Integer.MIN_VALUE;
		int secondhighest = Integer.MIN_VALUE;

		for (int index = 0; index < array.length; index++) {
			if (array[index] > firsthighest) {
				secondhighest = firsthighest;
				firsthighest = array[index];
			} else if (array[index] > secondhighest && array[index] != firsthighest)
				secondhighest = array[index];
		}

		if (secondhighest != Integer.MIN_VALUE)
			System.out.print("The Second Largest Element is : " + secondhighest);

		else
			System.out.print("There is no Second Largest Element in the Array");
	}

	public static void main(String[] args) {
		int array[] = { 10, 33, 56, 43, 99, 21 }; // The Second Largest Element is : 56
		// int array[] = { 10, 10}; // There is no second largest element in the Array
		printSecondLargestNumInArray(array);
	}

}
