/*
Find the name having maximum length from user given array [use scanner class to take names and size of an array].
*/

package nikhilMJun20;

import java.util.Scanner;

public class MaxLengthString {
	void displayMaxLegthString(String[] strArray) {
		String max = strArray[0];
		for(int index=1; index < strArray.length; index++) {
			if(strArray[index].length() > max.length())
				max = strArray[index];
		}
		System.out.println("\nThe longest String enetred: "+max+"\nLength: "+max.length());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		MaxLengthString maxLengthString = new MaxLengthString();
		
		System.out.println("This program will display the String with max length from the array Strings that you will eneter.");
		System.out.println("How many Strings you want to enter in the array? : ");
		int arrayLength = scanner.nextInt();
		
		String[] strArray = new String[arrayLength];
		
		System.out.println("Please enter "+arrayLength+" Strings:-");
		for(int index=0; index < arrayLength; index++) {
			strArray[index] = scanner.next();
		}
		scanner.close();
		
		maxLengthString.displayMaxLegthString(strArray);
	}
}
