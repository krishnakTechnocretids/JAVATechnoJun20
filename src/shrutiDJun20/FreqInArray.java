/* 
1) Create a class where you need to check given number is there in predefined array or not,
 if present then print frequency of the number. 

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2. 
 */

package shrutiDJun20;

import java.util.Scanner;

//import java.util.Arrays;

public class FreqInArray {
	
	void checknum(int[] numberInput, int num){
		int numcount=0;
		for(int index=0; index<numberInput.length; index++){
			if(numberInput[index]== num){
				numcount++;
			}
		}
			if (numcount==0)
			System.out.println("number " +num+" is not present in given array");
			else
				System.out.println("number " +num+" is present in given array");	
		}	
	public static void main(String[] args) {
		FreqInArray freqInArray= new FreqInArray();
		int[] number = new int[]{10,3,9,-99,81,3,-11};
		//System.out.println(Arrays.toString(number));
		System.out.println("Provided Array of Integer is mentioned below:");
		for(int i=0;i<number.length;i++){
			System.out.print(+number[i]+" , ");
		}
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		String status = "y";
			do{
		System.out.println("which no. do you want to search?");
		int num = scanner.nextInt();
		freqInArray.checknum(number, num);
		System.out.println("would you llike to continue: y/n?");
		status  = scanner.next();
		}
			while(status.equalsIgnoreCase("y"));

		scanner.close();
	}
	
}
