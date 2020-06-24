/*Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.
*/

package nikhilMJun20;

import java.util.Scanner;

public class FindNumInArray {
	void displayNumFreq(int[] arr, int num) {
		int numFreq = 0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] == num)
				numFreq++;
		}
		if(numFreq == 0)
			System.out.println(num+" is not present in the array.");
		else
			System.out.println(num+" is present in the array with frequency of "+numFreq);
	}
	
	public static void main(String[] args) {
		FindNumInArray findNumInArray = new FindNumInArray();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nThis program will find out the if the number you have given is present in the pre-defined array.\nIf present, it will show it's frequency.\nHow many numbers do you want to eneter in the array?");
		int arrLength = scanner.nextInt();
		
		int[] numArray = new int[arrLength];
		for (int index=0; index<arrLength; index++) {
			System.out.println("Enter number "+(index+1)+":");
			numArray[index] = scanner.nextInt();
		}
		
		String proceed = "Y";
		do {
			System.out.println("\nWhich number you want to search in the array?");
			int num = scanner.nextInt();
			findNumInArray.displayNumFreq(numArray, num);
			
			System.out.println("\nDo you want to continue your search? (Y or N)");
			proceed = scanner.next();
		}while(proceed.equals("Y"));
		scanner.close();
	}
}
