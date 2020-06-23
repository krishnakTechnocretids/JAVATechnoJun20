//posAndNegSum() method - Sum of positive and Negative numbers using array provided by user
//posAndNegCount() method - count of total Positive and Negative Number using array provided by user

package aavrutiDJun20;

import java.util.Scanner;

public class OperationsOnPosAndNeg {

	void posAndNegCount(int[] numberArray) {
		int posCount = 0;
		int negCount = 0;
		
		for(int index=0;index<numberArray.length;index++) {
			if(numberArray[index]<0)
				negCount++;
			else
				posCount++;
		}
		System.out.println("\nNegative Count is : "+ negCount);
		System.out.println("Positive Count is : " + posCount);
	}
	
	void posAndNegSum(int[] numberArray) {
		int sum = 0;
		
		for(int index=0;index<numberArray.length;index++) {
			sum += numberArray[index];
		}
		System.out.println("\nSum of Negative and Positive numbers is : " + sum);
	}
	
	public static void main(String[] args) {
		OperationsOnPosAndNeg operationsOnPosAndNeg = new OperationsOnPosAndNeg();
		Scanner scanner = new Scanner(System.in);
		
		int arraySize;
		
		boolean flag = false;
		do{
			System.out.println("Please enter size of an array: ");
			arraySize = scanner.nextInt();
			if(arraySize>0)
				flag = true;
		}while(flag == true);
		
		int[] number = new int[arraySize];
		
		for(int index=0;index<number.length;index++) {
			System.out.println("Please Enter number " + (index+1) + " : ");
			number[index] = scanner.nextInt();
		}
		
		operationsOnPosAndNeg.posAndNegCount(number);
		operationsOnPosAndNeg.posAndNegSum(number);
		
		scanner.close();
	}
}
