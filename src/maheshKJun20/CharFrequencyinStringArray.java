package maheshKJun20;

import java.util.Scanner;

public class CharFrequencyinStringArray {
	
	Scanner scanner = new Scanner(System.in);								//Create Instance of Scanner class to take user input
	
	String[] userInputStringArray() {
		//Method to get user input to create String Array. It will return String Array
		System.out.println("Please enter Length of Array to be created");
		int arrayLength = scanner.nextInt();								//User input to get length of Array to be created
		String[] strArray = new String[arrayLength];						//Create array as per the length provided by USer
		for (int index=0;index<arrayLength;index++) {						//Loop to iterate and get user input for array elements
			System.out.println("Please enter value of Element: " + index);
			strArray[index] = scanner.next();
		}
		return strArray;													//Return the String Array created to calling method
	}
	
	String userInputString() {
		//Method to get user input for String.
		System.out.println("Please enter String Value");
		return scanner.next();												//Return user inout string to calling method
	}

	void countCharInString(String str, String charToCheck) {
		int countOfChar =0;													//Variable to store get count of character in string	
		for (int index=0;index<str.length();index++) {						//Loop to iterate each String character and check against charToCheck	
			if (String.valueOf(str.charAt(index)).equalsIgnoreCase(charToCheck)) {
				countOfChar++;
			}
		}
		System.out.println("Frequency of '" + charToCheck + "' in '" + str + "' is: " + countOfChar);
	}
	
	
	void countAllCharInString(String str) {
		//Method to iterate each String character and call countCharInString to get count of each individual character
		System.out.println("Count of all character in '" + str + "' is as below:");
		for(int index=0;index<str.length();index++) {						//Loop to iterate each String character and get count of characters
			countCharInString(str, String.valueOf(str.charAt(index)));		//Call method to check count of char in String
		}
		System.out.println("===============================================================================");
	}
	
	void CountCharInAllArrayElement(String[] strArray) {
		//Method to iterate Array element call countAllCharInString to get count of each individual character in all elements
		for (int index=0;index<strArray.length;index++) {
			countAllCharInString(strArray[index]);
		}
	}
	
	public static void main(String[] args) {
		CharFrequencyinStringArray charFrequencyinStringArray = new CharFrequencyinStringArray();
		String userAction = "Yes";
		while(userAction.equalsIgnoreCase("Yes")) {
			System.out.println("Please select your action from below List (Enter 1/2/3/4) \n 1. Find count of character in String \n 2. Find count of all character in String \n 3. Find count of characters from all elements in Array \n 4. Please exit, no further action required");
			int action = charFrequencyinStringArray.scanner.nextInt();
			if (action == 1) {														//Condition to check if user wants to get count of a character in String
				String str = charFrequencyinStringArray.userInputString();
				System.out.println("Please Enter Charsacter to check in String");
				String charToCheck = charFrequencyinStringArray.scanner.next();
				charFrequencyinStringArray.countCharInString(str, charToCheck);
			}else if (action == 2) {												//Condition to check if user wants to get count of all character in String
				charFrequencyinStringArray.countAllCharInString(charFrequencyinStringArray.userInputString());
			}else if (action == 3) {												//Condition to check if user wants to get count of all characters in each individual elements in Array
				charFrequencyinStringArray.CountCharInAllArrayElement(charFrequencyinStringArray.userInputStringArray());
			}else if (action == 4) {												//Condition to check if user wants to exit
				userAction = "No";
				System.out.println("Exiting the Program. Have a Nice Day!");
			}else {																	//Condition to check invalid input
				System.out.println("Invalid Input. Please try again");
			}
		}
	}
}
