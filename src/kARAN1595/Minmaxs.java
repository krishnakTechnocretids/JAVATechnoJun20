/*
Program 1 :
A) Find maximum number from user given array [use scanner class to take numbers and size of an array]
B) Find minimum number from user given array [use scanner class to take numbers and size of an array]
 */

package kARAN1595;



import java.util.Scanner;

public class Minmaxs {

	int getMaximum(int[] input) {
		int maximum = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] > maximum) {
				maximum = input[index];
			}

		}
		return maximum;
	}

	int getMinimum(int[] input) {
		int minimum = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] < minimum) {
				minimum = input[index];
			}

		}
		return minimum;
	}

	public static void main(String[] args) {
		Minmaxs minMax = new Minmaxs();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = scan.nextInt();
		int[] num = new int[size];
		for (int index = 0; index < size; index++) {
			System.out.println("Enter number:");
			num[index] = scan.nextInt();
		}
		System.out.println("Biggest number in array:" + minMax.getMaximum(num));
		System.out.println("Smallest number in array:" + minMax.getMinimum(num));
		scan.close();
	}

}
/*Output:Enter size of array:
3
Enter number:
23
Enter number:
45
Enter number:
67
Biggest number in array:67
Smallest number in array:23
*/
