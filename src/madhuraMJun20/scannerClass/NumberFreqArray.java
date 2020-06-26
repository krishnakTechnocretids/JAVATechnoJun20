package madhuraMJun20.scannerClass;
/*1) Create a class where you need to check given number is there in predefined array or not, 
 * if present then print frequency of the number.

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.*/

import java.util.Scanner;

public class NumberFreqArray {
	
	void findNum(int [] arrNum , int number) {
		int count=0;
		for(int index = 0; index < arrNum.length; index++) {
			
			if(arrNum[index]==number) {
				count++;
			}
		}
		if(count==0)
			System.out.println("Given Number "+number+ " is not present in predefined array.");
		else 
			System.out.println("Given Number "+number+ " is present in predefined array with frequency "+count);
		
	}
	
	public static void main(String[] args) {
		NumberFreqArray numberFreqArray = new NumberFreqArray();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter thr size of an Array : ");
		int size= scanner.nextInt();
		int[] arrNum = new int[size];
		
		System.out.println("Enter number to find : ");
		int number=scanner.nextInt();
		for(int i=0; i<size; i++) {
			System.out.println("Enter number " +(i+1)+ " : ");
			arrNum[i] = scanner.nextInt();
		}
		
		numberFreqArray.findNum(arrNum,number);
			
		scanner.close();
	}

}
