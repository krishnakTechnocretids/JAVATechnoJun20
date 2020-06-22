package maheshKJun20;

import java.util.Scanner;

public class CharCountInArray {
	
	void displayCountOfChar(String[] strArray, String charToCount) {
		int totalCharCount = 0;
		for (int index=0; index < strArray.length; index++) {
			int charCount = 0;
			for (int strIndex=0; strIndex < strArray[index].length(); strIndex++) {
				if (String.valueOf(strArray[index].charAt(strIndex)).equalsIgnoreCase(charToCount)) {
					charCount++;
					totalCharCount++;
				}
			}
			System.out.println("Count of char '" + charToCount + "' In element " + strArray[index] + ": " + charCount);
		}
		System.out.println("=======================================================================================");
		System.out.println("Total count of char '" + charToCount + "' In Array is: " + totalCharCount );
		System.out.println("=======================================================================================");
		
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
		CharCountInArray charCountInArray = new CharCountInArray();
		String[] strArray = charCountInArray.getArrayFromUSer();
		Scanner scanner = new Scanner(System.in);
		String status = "Yes";
		while(status.equalsIgnoreCase("Yes")) {
			System.out.println("Do you Want to perform any operation from below (Enter 1/2/3): \n 1. Create a New Array again \n 2. Find count of character in Array Element \n 3. No further Action. Please Exit" );
			int actionToPerform = scanner.nextInt();
			if (actionToPerform == 1) {
				strArray = charCountInArray.getArrayFromUSer();
			}else if(actionToPerform == 2) {
				System.out.println("Please Enter character to count in Array elements");
				String charToCount = scanner.next();
				charCountInArray.displayCountOfChar(strArray, charToCount);
			}else if(actionToPerform == 3) {
				System.out.println("Existing the program. Have a nice Day!");
				status = "No";
			}else {
				System.out.println("Invalid Option selected");
			}
		}
	}

}
