package abhishekSJun20;

/*You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40

 */
import java.util.Scanner;

public class SumOfEvennumberInArray {

	int sumOfEvennumber(int[] number) {
		// method to find Sum of even numbers in the array
		int sum = 0;
		for (int index = 0; index < number.length; index++) {
			if (number[index] % 2 == 0)
				sum = sum + number[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfEvennumberInArray sumOfevennumberInArray = new SumOfEvennumberInArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter how many numbers you want in the array");
		int input = scanner.nextInt();
		int[] array = new int[input];

		for (int index = 0; index < array.length; index++) {
			System.out.println("Please enter number " + (index + 1));
			array[index] = scanner.nextInt();
		}
		System.out.println("Sum of even numbers in array :" + sumOfevennumberInArray.sumOfEvennumber(array));
		scanner.close();		
	}
}
