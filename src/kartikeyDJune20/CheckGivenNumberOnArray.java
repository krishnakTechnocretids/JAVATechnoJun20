package kartikeyDJune20;

import java.util.Scanner;

public class CheckGivenNumberOnArray {
	Scanner scanner = new Scanner(System.in);
	int sizeOfArrray = 0;

	int sizeOfArray() {
		System.out.println("Provide the size of the array: ");
		sizeOfArrray = scanner.nextInt();
		boolean flag = true;
		do {
			if (sizeOfArrray <= 0) {
				System.out.println("Size cant be zero or negative.. Please provide again ..");
				sizeOfArrray = scanner.nextInt();
			} else
				flag = false;

		} while (flag == true);

		return sizeOfArrray;
	}

	String[] setValuesinArray(int size) {
		String[] input = new String[size];
		System.out.println("Provide the values in the array: ");
		for (int index = 0; index < input.length; index++) {
			input[index] = scanner.next();
			

		}
		System.out.println("Array provided: ");
		for (int index = 0; index < input.length; index++) {
			System.out.println("input[" +index+ "]= " + input[index]);
		}

		return input;
	}

	void checkElementinArray(String[] input, String element) {
		int cnt = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index].equals(element)) {
				cnt++;
			}
		}
		if (cnt == 0)
			System.out.println("Element " + element + " is not present in the array.");
		else
			System.out.println("Frequency of element " + element + " is " + cnt);

	}

	String elemetToCheck() {
		System.out.println("Please provide element to check: ");
		return scanner.next();

	}

	public static void main(String[] args) {
		CheckGivenNumberOnArray checkGivenNumberOnArray = new CheckGivenNumberOnArray();
		checkGivenNumberOnArray.checkElementinArray(checkGivenNumberOnArray.setValuesinArray(checkGivenNumberOnArray.sizeOfArray()),checkGivenNumberOnArray.elemetToCheck());

	}

}
