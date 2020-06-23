package palakSJun20;

import java.util.Scanner;

public class ArrayPositiveNegativeNumber {
	
	//Count of Positive and Negative Number  
	void countPositiveNegativeNumber(int[] array){
		int countPostiveNumber = 0;
		int countNegativeNumber = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] >= 0)
				countPostiveNumber++;
			else
				countNegativeNumber++;
			}
		System.out.println("Postivie Number count is "+countPostiveNumber +"\n" + "Negative Number count is " + countNegativeNumber);
	}
	
	//Difference of positive number sum and negative number sum
	void differencePostiveNegativeSum(int[] array){
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result = result + array[i];
		}
		System.out.println("Difference of +Ve and -Ve Number is " + result);
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayPositiveNegativeNumber positivieNegativeNumber = new ArrayPositiveNegativeNumber();
		
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		//Taking Array Element Input from user
		for (int index = 0; index < array.length; index++) {
			System.out.println("Enter the Number");
			array[index] = sc.nextInt();
		}
		//Calling Method
		positivieNegativeNumber.countPositiveNegativeNumber(array);
		positivieNegativeNumber.differencePostiveNegativeSum(array);
		sc.close();
	}

}
