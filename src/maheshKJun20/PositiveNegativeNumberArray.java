package maheshKJun20;

import java.util.Scanner;

public class PositiveNegativeNumberArray {
	
	void countPositiveNegativeNumbers(int[] intArray) {
		//This Method with calculate sum of even number in and array(positive and Negative both)
		int countPositive = 0, countNegative = 0, countZero=0;			//Variables to store count of positive, negative  and Zero number
		for (int index=0;index<intArray.length;index++) {				//Loop to iterate all the values in Array
			if(intArray[index] > 0) {									//Condition to validate value Positive
				countPositive++;										
			}else if(intArray[index] < 0) {								//Condition to validate value Negative
				countNegative++;
			}else {														//Default Condition for value Zero
				countZero++;
			}
		}
		System.out.println("Count of Positive numbers in Array: " + countPositive + "\nCount of Negative numbers in Array: " + countNegative);
		if (countZero > 0) {
			System.out.println("We also have " + countZero + " '0' values in Array");
		}
	}
	
	
	void diffPositiveNegativeNumber(int[] intArray) {
		//This Method with calculate Difference in Sum of Positive and Negative numbers in Array
		int diff = 0;											//Variable to store Difference in sum of positive and negative values
		for (int index=0;index<intArray.length;index++) {		//Loop to iterate all the values in Array
			diff += intArray[index];							//Difference in sum of Positive and Negative numbers
		}
		System.out.println("Difference in Sum of Positive and Negative numbers in Array is: " + diff);
	}
	
	
	int[] getIntArrayFromUser() {
		//Method to get user input(lenth and element values) to create Integer Array
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
		PositiveNegativeNumberArray positiveNegativeNumberArray = new PositiveNegativeNumberArray();		//Create Instance of class
		Scanner scanner = new Scanner(System.in);								//Create Instance of Scanner class to take user input
		int[] intArray = positiveNegativeNumberArray.getIntArrayFromUser();				//Call getIntArrayFromUser method from creating Interger Array
		String userAction = "Yes";												//Variable created to provide condition in While loop
		while(userAction.equalsIgnoreCase("Yes")) {								//Condition to check if user wants to continue with his action
			System.out.println("Please select your action from below options (Enter 1/2/3/4): \n 1. Create a new Integer Array again \n 2. Find count of positive/Negative numbers in Array \n 3. Find Difference in sum of positive and negative numbers in Array \n 4. Please exit, No further action required");
			int action = scanner.nextInt();
			if (action == 1) {														//Condition to check if user wants to create new array
				intArray = positiveNegativeNumberArray.getIntArrayFromUser();			
			}else if (action == 2) {												//Condition to check if user wants to get count of positive and negative number in Array
				positiveNegativeNumberArray.countPositiveNegativeNumbers(intArray);					
			}else if (action == 3) {												//Condition to check if user wants Difference in sum of Positive and Negative number in Array
				positiveNegativeNumberArray.diffPositiveNegativeNumber(intArray);	
			}else if (action == 4) {												//Condition to check if user wants to Exit the Program
				System.out.println("Exiting the program. Have a nice day!");	
				userAction = "No";
			}else {																	//Condition to check incorrect user input
				System.out.println("Incorrect option selected. Please try again");
			}
		}
	}
	
	
	

}
