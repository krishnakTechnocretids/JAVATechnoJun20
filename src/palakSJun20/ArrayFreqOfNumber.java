package palakSJun20;

import java.util.Scanner;

public class ArrayFreqOfNumber {

	void frequencyOfNumber(int[] array , int number){
		int count = 0 ;
		for (int index = 0; index < array.length; index++) {
			if(array[index] == number) 
				count++;	
		}
			if(count == 0)
				System.out.println("Given Number " + number + " is not present in predefined array " );
			else 
				System.out.println("Given Number " + number + " is present in predefined array with frequency " + count);
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = {10,3,9,-99,81,3,-11};
		ArrayFreqOfNumber arrayFreqOfNumber = new ArrayFreqOfNumber();
		System.out.println("Enter the number you want to search in array");
		int number = sc.nextInt();
		arrayFreqOfNumber.frequencyOfNumber(array , number);
		sc.close();
	}

}
