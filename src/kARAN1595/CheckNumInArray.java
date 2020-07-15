package kARAN1595;

/*Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]
Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.
Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.
*/
import java.util.Scanner;

public class CheckNumInArray {
	void displayNumberInArray(int[] array, int number) {
		int numberFrequency = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] == number)
				numberFrequency++;
		}
		if (numberFrequency == 0)
			System.out.println("Element entered is not present: " + number);
		else
			System.out.println("Element entered: "+number+" is present in array " + numberFrequency);
	}

	public static void main(String[] args) {
		CheckNumInArray checkNumInArray = new CheckNumInArray();
		System.out.println("Enter how many elements you want to enter:");
		Scanner scanner = new Scanner(System.in);
		int arrLength = scanner.nextInt();
		int[] numArray = new int[arrLength];
		for (int index = 0; index < arrLength; index++) {
			System.out.println("Enter number: " + (index + 1) + ":");
			numArray[index] = scanner.nextInt();
		}
		String check = "Yes";
		do {
			System.out.println("\nWhich number you want to search in the array?");
			int num = scanner.nextInt();
			checkNumInArray.displayNumberInArray(numArray, num);
			System.out.println("\nDo you want to continue (Yes/No)?");
			check = scanner.next();
		} while (check.equals("Yes"));
		scanner.close();
	}
}
