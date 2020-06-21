/*
A) Find maximum number from user given array [use scanner class to take numbers and size of an array]
B) Find minimum number from user given array [use scanner class to take numbers and size of an array]
*/

package maheshKJun20;

import java.util.Scanner;

public class MinMaxNum {
	
	void displayMinNumber(int[] num) {
		//Method to Find lowest number in an Array
		int minNum = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] < minNum) {
				minNum = num[index];
			}
		}
		System.out.println("Lowest Number in array is: " + minNum);
	}
	
	void displayMaxNumber(int[] num) {
		//Method to Find lowest number in an Array
		int maxNum = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] > maxNum) {
				maxNum = num[index];
			}
		}
		System.out.println("Highest Number in array is: " + maxNum);
	}
	
	int[] getArrayFromUSer() {
		//Method to create Array with the help of user Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter length of Array to be created");
		int arrayLength = scanner.nextInt();
		int[] num = new int[arrayLength];
		for (int index = 0; index < arrayLength; index++) {
			System.out.println("Please enter element " + (index + 1));
			num[index] = scanner.nextInt();
		}
		return num;
	}
	
	public static void main(String[] args) {
		MinMaxNum minmaxnum = new MinMaxNum();
		int[] num = minmaxnum.getArrayFromUSer();
		Scanner scanner = new Scanner(System.in);
		String status = "Yes";
		while(status.equalsIgnoreCase("Yes")) {
			System.out.println("Do you Want to perform any operation from below (Enter 1/2/3/4): \n 1. Create a New Array again \n 2. Find Lowest number in Array \n 3. Find Highest Number in Array \n 4. No further Action. Please Exit" );
			int actionToPerform = scanner .nextInt();
			if (actionToPerform == 1) {
				num = minmaxnum.getArrayFromUSer();
			}else if(actionToPerform == 2) {
				minmaxnum.displayMaxNumber(num);
			}else if(actionToPerform == 3) {
				minmaxnum.displayMinNumber(num);
			}else if(actionToPerform == 4) {
				System.out.println("Existing the program. Have a nice Day!");
				status = "No";
			}else {
				System.out.println("Invalid Option selected");
			}
		}
		
	}
}
