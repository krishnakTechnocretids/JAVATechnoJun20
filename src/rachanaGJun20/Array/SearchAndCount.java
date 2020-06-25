/*1) Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.*/

package rachanaGJun20.Array;

import java.util.Scanner;

public class SearchAndCount {

	int size;
	int[] numbers;
	int searchnum;

	void getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter how many numbers you want to enter");
		size = scanner.nextInt();
		System.out.println("Please enter numbers");
		numbers = new int[size];
		for (int i = 0; i < size; i++) {

			numbers[i] = scanner.nextInt();
		}
		System.out.println("Please enter number to search");
		searchnum = scanner.nextInt();
		scanner.close();
	}

	void searchAndOccurrence() {

		getInput();
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == searchnum) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == searchnum)
					count++;
			}
			System.out.println("Number present and its occurrence is : " + count);
		} else
			System.out.println("Number not present");
	}

	public static void main(String[] args) {
		SearchAndCount searchandcount = new SearchAndCount();
		searchandcount.searchAndOccurrence();

	}

}
