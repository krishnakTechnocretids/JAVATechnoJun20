package swapnaWJun20;

import java.util.Scanner;

public class MaxLengthArray {

	void findMaxLengthName(String inp[]){
		String lengthArrayElement=inp[0];

		for(int index=1;index<inp.length;index++){
			if(inp[index].length()>lengthArrayElement.length())
			{
				lengthArrayElement=inp[index];
			}		
		}
		System.out.println("Longest string out of entered values is : "+lengthArrayElement);
	}

	public static void main(String[] args) {

		MaxLengthArray maxLengthArray = new MaxLengthArray();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Specify the length of Array of Names : ");
		int arraySize = scanner.nextInt();

		String arrayInput [] = new String[arraySize];

		for(int index=0; index<arrayInput.length; index++)	{
			System.out.println("Enter the values of Array at index [" +index +"] :");
			arrayInput[index] = scanner.next();
		}
		maxLengthArray.findMaxLengthName(arrayInput);		
	}	
}
