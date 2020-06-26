package ajitSJune20;

import java.util.Scanner;

public class SearchNumInArray {

	void isNumPresent(int[] array, int numSearch) {
		int count = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] == numSearch)
				count++;
		}
		if (count > 0)
			System.out.println("Given number " + numSearch + " is present in the array with frequency " + count);
		else
			System.out.println("Given number " + numSearch + " is not present in the array");
	}

	public static void main(String[] args) {
		SearchNumInArray searchNumInArray = new SearchNumInArray();

		Scanner scanner = new Scanner(System.in);
		int[] array = { 10, 3, 9, -99, 81, 3, -11 };

		String stillProceed = "";
		do {
			System.out.println("Enter Search Element in Array {10,3,9,-99,81,3,-11} ");
			int numSearch = scanner.nextInt();
			searchNumInArray.isNumPresent(array, numSearch);
			System.out.println("\nYou want to again search the number?(Y/N)");
			stillProceed = scanner.next();
		} while (stillProceed.equals("Y"));
		System.out.println("Enjoy....Thats the End of Program ");
		scanner.close();
	}
}
