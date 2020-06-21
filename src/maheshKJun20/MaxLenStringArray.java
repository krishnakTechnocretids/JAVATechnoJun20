/*
 Find the name having maximum length from user given array [use scanner class to take names and size of an array].
*/

package maheshKJun20;

import java.util.Scanner;

public class MaxLenStringArray {
	
	void displayMaxlenString(String[] strArray) {
		int maxLenStr = strArray[0].length();
		int maxLenStrIndex = 0;
		for (int index = 0; index < strArray.length; index++) {
			if (strArray[index].length() > maxLenStr) {
				maxLenStr = strArray[index].length();
				maxLenStrIndex = index;
			}
		}
		System.out.println("Name with Highest Length in array is " + strArray[maxLenStrIndex] + " with len: " + maxLenStr);
	}
	
	String[] getArrayFromUSer() {
		//Method to create Array with the help of user Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter length of Array to be created");
		int arrayLength = scanner.nextInt();
		String[] strArray = new String[arrayLength];
		for (int index = 0; index < arrayLength; index++) {
			System.out.println("Please enter element " + (index + 1));
			strArray[index] = scanner.next();
		}
		return strArray;
	}
	
	public static void main(String[] args) {
		MaxLenStringArray maxLenStringArray = new MaxLenStringArray();
		String[] strArray = maxLenStringArray.getArrayFromUSer();
		Scanner scanner = new Scanner(System.in);
		String status = "Yes";
		while(status.equalsIgnoreCase("Yes")) {
			System.out.println("Do you Want to perform any operation from below (Enter 1/2/3): \n 1. Create a New Array again \n 2. Find Name with Highest length in Array \n 3. No further Action. Please Exit" );
			int actionToPerform = scanner.nextInt();
			if (actionToPerform == 1) {
				strArray = maxLenStringArray.getArrayFromUSer();
			}else if(actionToPerform == 2) {
				maxLenStringArray.displayMaxlenString(strArray);
			}else if(actionToPerform == 3) {
				System.out.println("Existing the program. Have a nice Day!");
				status = "No";
			}else {
				System.out.println("Invalid Option selected");
			}
		}
	}

}
