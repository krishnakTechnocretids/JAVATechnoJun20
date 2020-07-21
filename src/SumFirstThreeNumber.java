import java.util.InputMismatchException;
import java.util.Scanner;

public class SumFirstThreeNumber {

	void displayFirstThreeNumberSum() {
		int count = 0, sum = 0;
		int[] array = new int[3];
		do {
			try {
				System.out.println(" Enter Input : ");
				Scanner scanner = new Scanner(System.in);
				int data = scanner.nextInt();
				array[count] = data;
				sum = sum + data;
				count++;
			} 

			catch (InputMismatchException ie) {
				System.out.println(" Entered Input is Invalid ");
			} 
		} while (count < 3);
		System.out.print("Values are ");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		System.out.print("and Total is : " + sum);

	}

	public static void main(String[] args) {
		SumFirstThreeNumber exception = new SumFirstThreeNumber();
		exception.displayFirstThreeNumberSum();
	}
}