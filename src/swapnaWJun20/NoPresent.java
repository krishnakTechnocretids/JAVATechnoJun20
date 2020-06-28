package swapnaWJun20;

import java.util.Scanner;

public class NoPresent {

	//method checking the presence of user provided no in an array
	void matchingNo(int inp[], int no)	{
		int count=0;
		for (int index=0; index<inp.length;index++)	{
			if(inp[index]==no)
				count++;			
		}
		if (count>0)
			System.out.println("Given number "+ no +" is present in predefined array with frequency "+count);
		else
			System.out.println("Given number "+ no +" is not present in predefined array");
	}

	public static void main(String[] args) {

		NoPresent noPresent = new NoPresent();

		//In case of user input
		Scanner scanner = new Scanner(System.in);

		/* System.out.println("Specify the size of integer array : ");
			int arraySize = scanner.nextInt();

			int inputArray[]=new int[arraySize];

			for(int index = 0; index<inputArray.length; index++) {
				System.out.println("Enter the array elements at index :"+index);
				inputArray[index] = scanner.nextInt();
			}*/

		int inputArray[]= {10,3,9,-99,81,3,-11};

		//user input to search the no presence in array
		System.out.println("Enter the number to search in array : ");
		int number = scanner.nextInt();
		//method calling 
		noPresent.matchingNo(inputArray,number);
		scanner.close();
	}
}