package yashCJun20;

import java.util.Scanner;

public class PredefinedArray {
	public static void main(String[] args) {
		
		int userNum;
		PredefinedArray predefinedArray = new PredefinedArray();
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = {10,3,9,-99,81,3,-11};
		
		System.out.println("Enter a number you want to check its frequency in array: ");
		userNum = sc.nextInt();
		
		

		int count=predefinedArray.checkFreq(numbers,userNum);
		if(count>0) {
			System.out.println("Given number "+userNum+" is present in array"+" and it's Frequency is " +count);
		}
		else
		{
			System.out.println("Given number "+userNum+" is not present");
		}

	}
	int checkFreq(int[] array, int userNum) {
		int count = 0;
		int index = 0;
		while(index<array.length) {


			if (array[index] == userNum) {

				count= count + 1;
				

			}
			index++;


		}
		return count;

	}
}