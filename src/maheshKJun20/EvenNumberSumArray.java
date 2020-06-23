/*
You need to store user input in array and do sum of even numbers only from created 
 array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

 Example :
 Input : {10,5,7,3,1,5,9,30}
 Output: 40
*/

package maheshKJun20;

import java.util.Scanner;

public class EvenNumberSumArray {
	
	void evenNumberSum(int[] intArray) {
		//This Method with calculate sum of even number in and array(positive and Negative both)
		int sum = 0;											//Variable to store sum of even number
		for (int index=0;index<intArray.length;index++) {		//Loop to iterate all the values in Array
			if(intArray[index]%2 == 0) {						//Condition to validate value is Even
				sum += intArray[index];							//If even add to sum
			}
		}
		System.out.println("Sum of Even Numbers in Array is: " + sum);
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
		EvenNumberSumArray evenNumberSumArray = new EvenNumberSumArray();		//Create Instance of class
		Scanner scanner = new Scanner(System.in);								//Create Instance of Scanner class to take user input
		int[] intArray = evenNumberSumArray.getIntArrayFromUser();				//Call getIntArrayFromUser method from creating Interger Array
		String userAction = "Yes";												//Variable created to provide condition in While loop
		while(userAction.equalsIgnoreCase("Yes")) {								//Condition to check if user wants to continue with his action
			System.out.println("Please select your action from below options (Enter 1/2/3): \n 1. Create a new Integer Array again \n 2. Find sum of Even numbers in Array \n 3. Please exit, No further action required");
			int action = scanner.nextInt();
			if (action == 1) {													//Condition to check if user wants to create new array
				intArray = evenNumberSumArray.getIntArrayFromUser();			
			}else if (action == 2) {											//Condition to check if user wants to get sum of Even number in Array
				evenNumberSumArray.evenNumberSum(intArray);					
			}else if (action == 3) {											//Condition to check if user wants to Exit the Program
				System.out.println("Exiting the program. Have a nice day!");	
				userAction = "No";
			}else {																//Condition to check incorrect user input
				System.out.println("Incorrect option selected. Please try again");
			}
		}
	}
}
