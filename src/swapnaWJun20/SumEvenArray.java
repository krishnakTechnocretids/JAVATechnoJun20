package swapnaWJun20;

import java.util.Scanner;

public class SumEvenArray {

	//Finding the even nos and adding them
	void evenSum(int inpArray[])	{
		int sum = 0;

		for(int index=0;index<inpArray.length;index++)	{
			if(inpArray[index]%2==0)
				sum += inpArray[index];
		}
		System.out.println("Sum of all even numbers provided by user is : "+sum);
	}

	public static void main(String[] args) {
		SumEvenArray sumEvenArray = new SumEvenArray();

		//Array length input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Specify the array size : ");
		int arraySize = scanner.nextInt();

		int inpArray[]= new int [arraySize];

		//Array values input
		for(int index=0; index<inpArray.length;index++)	{
			System.out.println("Enter the array value at index "+index+":");
			inpArray[index]=scanner.nextInt();
		}
		sumEvenArray.evenSum(inpArray);
		scanner.close();
	}
}
