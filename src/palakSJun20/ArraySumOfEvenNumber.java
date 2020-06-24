package palakSJun20;

import java.util.Scanner;

public class ArraySumOfEvenNumber {
	
	void sumOfEvenNumber(int[] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0)
				sum = sum + array[i];
		}
		System.out.println("Sum of Even Number is " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArraySumOfEvenNumber arraySumOfEvenNumber = new ArraySumOfEvenNumber();
		
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		
		//Creating Array
		int[] array = new int[size];
		
		//Taking array element
		for (int index = 0; index < array.length; index++) {
			System.out.println("Enter the Number");
			array[index] = sc.nextInt();
		}
		
		//calling Method : Sum of Even Number 
		arraySumOfEvenNumber.sumOfEvenNumber(array);
		sc.close();
		

	}

}
