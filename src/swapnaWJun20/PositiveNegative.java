package swapnaWJun20;

import java.util.Scanner;

public class PositiveNegative {

	//All positive and negative nos present in array
	void countNos(int inpArray[])
	{
		int posCount=0;
		int negCount=0;

		for(int index=0;index<inpArray.length;index++)
		{
			if(inpArray[index]>0)
				posCount++;
			else
				negCount++;
		}
		System.out.println(posCount+" positive & "+ negCount +" negative numbers");
	}

	//Difference between positive and negative nos present in the array
	int getDiff (int []arrayInp)
	{
		int diff=0;
		for(int index = 0; index < arrayInp.length; index++){
			diff += arrayInp[index];
		}	
		return diff;
	}

	public static void main(String[] args) {
		PositiveNegative positiveNegative = new PositiveNegative();

		//Array length input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Specify the array size : ");
		int arraySize = scanner.nextInt();

		int []inputArray = new int[arraySize];

		//Array values input
		for(int index=0;index<inputArray.length;index++){
			System.out.println("Enter the Number at index "+index+":");
			inputArray[index]=scanner.nextInt();
		}
		positiveNegative.countNos(inputArray);
		System.out.println("\nDifference between Positive and Negative nos : " + positiveNegative.getDiff(inputArray));
	}
}

