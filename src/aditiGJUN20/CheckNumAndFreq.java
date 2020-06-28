/*
 * Create a class where you need to check given number is there in predefined array or not, 
 * if present then print frequency of the number. [Estimated time: 15 mins]
 * Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
           Output : Given number 33 is not present in predefined array.
   Input : Number to be check -> 3 
   output : Given number 3 is present in predefined array with frequency 2.
*/

package aditiGJUN20;

import java.util.Scanner;

public class CheckNumAndFreq {
	
	// Method to check frequency of number
	int checkNumFreq(int[] intArray, int num) {
		int count=0;
		for(int index=0;index<intArray.length;index++)
			if(intArray[index]==num)
			count++;
		return count;
	}
	
	public static void main(String[] args) {
		CheckNumAndFreq checkNumAndFreq=new CheckNumAndFreq();
		int[] inputArray= {10,3,9,-99,81,3,-11};
		
		Scanner scanner=new Scanner(System.in);
		String cont;
		do {
			System.out.print("Input array is: ");
			for(int index=0;index<inputArray.length;index++) {
				System.out.print(inputArray[index]+"  ");
			}
		
			System.out.println("\nWhich number do you want to search in Array?");
			int number=scanner.nextInt();
			int freq=checkNumAndFreq.checkNumFreq(inputArray, number);
			
			if (freq==0)
				System.out.println("Given number "+number+" is not present in predefined array");
			else
				System.out.println("For given input array frequency of number "+number+" is: "+freq);
		
			System.out.println("-----------------------------------------------");
			System.out.println("\nDo you want to search frequency for another number?YES/NO");
			cont=scanner.next();
		}while(cont.equals("YES"));
		scanner.close();
	}
}
