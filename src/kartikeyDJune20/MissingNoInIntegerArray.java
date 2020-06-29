package kartikeyDJune20;

import java.util.Scanner;

public class MissingNoInIntegerArray {
	Scanner scanner = new Scanner(System.in);

	int sizeOfArray() {
		System.out.println("Please provide the size of Array: ");
		int size = scanner.nextInt();
		while (size <= 0) {
			System.out.println("Sizeof array cant be Zero or negative ..Please provide again");
			size = scanner.nextInt();
		}
		return size;
	}

	int[] setArray(int size) {

		int[] input = new int[size];
		System.out.println("Please provide the elements in the array:");
		for (int index = 0; index < size; index++) {
			input[index] = scanner.nextInt();
		}
		for (int index = 0; index < size; index++) {
			System.out.println("input[" + index + "]= " + input[index]);
		}

		return input;
	}

	void missingNoInArray(int[] input) {
		for (int index = 1; index < input.length; index++) {// if user want to inlude zero also then put index=0 , here requirement was 1 to 10 so adjusted accordindly
			boolean flag = true;
			for (int indexOfArray = 0; indexOfArray < input.length; indexOfArray++) {
				if (input[indexOfArray] == index) {
					flag = true;
					break;
				} else
					flag = false;
			}
			if (flag == false)
				System.out.println(index + " is missing from the array");
		}
	}

	public static void main(String[] args) {
		MissingNoInIntegerArray missingNoInIntegerArray = new MissingNoInIntegerArray();
		int[] input= {1,2,3,5,6,7,8,9,10};
		missingNoInIntegerArray.missingNoInArray(input);
		
	//	missingNoInIntegerArray
//				.missingNoInArray(missingNoInIntegerArray.setArray(missingNoInIntegerArray.sizeOfArray()));

	}

}
