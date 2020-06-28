package maheshKJun20;

import java.util.Scanner;

public class NumberFrequencyInArray {
	
	void countNumberInArray(int[] intArray) {
		//Method to check count of Number in Array
		int countOfNum = 0;														//Variable to store count of number
		Scanner scanner = new Scanner(System.in);								//Create Instance of Scanner class to take user input
		System.out.println("Please enter number to check in Array:");
		int numToCheck = scanner.nextInt();
		for (int index=0;index<intArray.length;index++) {						//Loop to iterate each array element
			if(intArray[index] == numToCheck) {									//Condition to check if element value is equal to required number
				countOfNum++;
			}
		}
		if(countOfNum > 0) {													//Condition to check if count is greater than Zero
			System.out.println("Given number " + numToCheck + " is present in predefined array with frequency " + countOfNum);
		}else {																	//Condition to check if count is Zero
			System.out.println("Given number " + numToCheck + " is not present in predefined array");
		}
	}
	
	
	int[] getIntArrayFromUser() {
		//Method to get user input(length and element values) to create Integer Array
		Scanner scanner = new Scanner(System.in);								//Create Instance of Scanner class to take user input
		System.out.println("Please enter length of Array to be created:");
		int arrayLength = scanner.nextInt();									//USer input to get length to array to be created
		int[] intArray = new int[arrayLength];									//Create Array as per the length provided by User
		for (int index=0; index<arrayLength;index++) {							//Loop to iterate and get values of individual elements from User
			System.out.println("Please enter value of element " + (index+1));
			intArray[index] = scanner.nextInt();								//Adding the elements values from user to Array
		}
		return intArray;														//Return Integer Array created
	}	
	
	
	public static void main(String[] args) {
		NumberFrequencyInArray numberFrequencyInArray = new NumberFrequencyInArray();		//Create Instance of class
		Scanner scanner = new Scanner(System.in);									//Create Instance of Scanner class to take user input
		int[] intArray = numberFrequencyInArray.getIntArrayFromUser();				//Call getIntArrayFromUser method from creating Interger Array
		String userAction = "Yes";		
		while (userAction.equalsIgnoreCase("Yes")) {
			System.out.println("Please select your action from below options (Enter 1/2/3/4): \n 1. Create a new Integer Array again \n 2. Find count of numbers in Array \n 3. Please exit, No further action required");
			int action = scanner.nextInt();
			if (action == 1) {														//Condition to check if user wants to create new array
				intArray = numberFrequencyInArray.getIntArrayFromUser();			
			}else if (action == 2) {												//Condition to check if user wants to get count of number in Array
				numberFrequencyInArray.countNumberInArray(intArray);					
			}else if (action == 3) {												//Condition to check if user wants to Exit the Program
				System.out.println("Exiting the program. Have a nice day!");	
				userAction = "No";
			}else {																	//Condition to check incorrect user input
				System.out.println("Incorrect option selected. Please try again");
			}
		}
	}

}
