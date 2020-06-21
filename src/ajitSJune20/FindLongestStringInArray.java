package ajitSJune20;

import java.util.Scanner;

public class FindLongestStringInArray {

	String getLongestString(String[] array) {

		// Print length of each String
		System.out.print("\n\nLength of each elements of Array (String : Size) : ");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " : " + array[index].length() + " , ");
		}

		// get String with maximum length
		String maxLenVal = array[0];
		for (int index = 1; index < array.length; index++) {
			if (array[index].length() > maxLenVal.length())
				maxLenVal = array[index];
		}
		return maxLenVal;
	}

	public static void main(String[] args) {
		FindLongestStringInArray findLongestStringInArray = new FindLongestStringInArray();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Elements you want in Array");
		int size = scanner.nextInt();
		String[] array = new String[size];

		System.out.print("Please enter " + size + " Elements in the Array:\n");
		for (int index = 0; index < array.length; index++) {
			array[index] = scanner.next();
		}

		System.out.print("Elelents of the array are : ");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " , ");
		}

		String max = findLongestStringInArray.getLongestString(array);
		System.out.println("\n\nThe longest String in the Array is :" + max);
		scanner.close();
	}

}
