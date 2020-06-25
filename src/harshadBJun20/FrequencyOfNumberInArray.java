package harshadBJun20;

/*Assignment 16 : 24th Jun 2020

1) Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.*/

import java.util.Scanner;

public class FrequencyOfNumberInArray{

	int frequencyOfNumber(int[] num, int checkNum){
		int freqCount=0,index=0;
		while(index<num.length) {
			if(num[index]==checkNum)
				freqCount++;
				index++;
		}
		//System.out.println("Given number "+checkNum+" is present in predefined array with frequency "+freqCount);
		return freqCount;
	}
	
	public static void main(String args[]){
		FrequencyOfNumberInArray frequencyOfNumberInArray = new FrequencyOfNumberInArray();
		
		Scanner sc = new Scanner(System.in);
		int numCheck;
		int[] numbers = {10,3,9,-99,81,3,-11};
		
		System.out.println("Enter a number you want to check its frequency in array: ");
		numCheck = sc.nextInt();
		
		int freqCnt=frequencyOfNumberInArray.frequencyOfNumber(numbers,numCheck);
		
		if(freqCnt>0)
			System.out.println("Given number "+numCheck+" is present in predefined array with frequency "+freqCnt);
		else
			System.out.println("Given number "+numCheck+" is not present in predefined array.");
		
		sc.close();
	}
}
