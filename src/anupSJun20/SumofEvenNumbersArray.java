package anupSJun20;
/*Program 1 : 
    You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40*/

import java.util.Scanner;

public class SumofEvenNumbersArray {
	
	int sum = 0;
	void sumEvenNumberArray(int[] num) {
		for(int index = 0;index<num.length;index++) {
			if(num[index]%2 ==0) {
				sum +=num[index];
			}
		}
		System.out.println("The sum of even numbers are "+ sum);
		
	}
	public static void main(String[] args) {
		SumofEvenNumbersArray sumofEvenNumbersArray = new SumofEvenNumbersArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int num = sc.nextInt();
		int[] evenNumber = new int[num];
		for(int index = 0; index<num;index++) {
		System.out.println("Enter the numbers");
		evenNumber[index] = sc.nextInt();
		}
		sumofEvenNumbersArray.sumEvenNumberArray(evenNumber);
	}

}
