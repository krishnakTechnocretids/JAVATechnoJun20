package amitaRJun20;

import java.util.Scanner;

public class SumOfEvenNumbersInArray {
	
	int sum=0;
	//method to find Sum of even numbers in the array
	int sumOfEvenNumbers(int[] number) {
		
		for(int index=0;index<number.length;index++) {
			if(number[index]%2==0)
			sum=sum+number[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfEvenNumbersInArray sumofevennos=new SumOfEvenNumbersInArray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter how many numbers you want in the array");
		int input=scanner.nextInt();
		int[] array = new int[input];
			
		for(int index=0;index<array.length;index++) {
			System.out.println("Please enter number "+(index+1));
			array[index]=scanner.nextInt();						
		}		
		scanner.close();
		System.out.println("Sum of even numbers in array is :"+sumofevennos.sumOfEvenNumbers(array));
	}

}
