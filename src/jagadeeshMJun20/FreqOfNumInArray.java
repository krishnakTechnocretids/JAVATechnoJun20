/*) Create a class where you need to check given number is there in predefined array or not, 
 * if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2*/
package jagadeeshMJun20;

import java.util.Scanner;

public class FreqOfNumInArray {
	int getFrequencey(int num, int[] arr1) {
		int count=0;
		for(int index=0; index<arr1.length; index++) {
			if (arr1[index] == num) 
				count++;
				
			}
		return count;
	}
		
	public static void main(String[] agrs) {
		FreqOfNumInArray freqOfNumInArray = new FreqOfNumInArray();
		Scanner scanner = new Scanner(System.in);
		int[] arr1 = {10,3,9,-99,81,3,-11};
		int count=0;
		for (int index =0; index<2;index++) {
		System.out.println("Enter number to check - ");
		int num = scanner.nextInt();
		count = freqOfNumInArray.getFrequencey(num,arr1);
		
		//freqOfNum.getFrequencey(33,arr1);
		if (count == 0)
			System.out.println("Given number "+num+" is not present in the predefined array");
		else
			System.out.println("Given number "+num+ " is present in predefined array with frequency "+count);
		}
		scanner.close();
	}	
			
	}


