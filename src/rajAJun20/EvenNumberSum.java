package rajAJun20;

import java.util.Scanner;

public class EvenNumberSum {
	
	void sumOfEvenNumber(int[] array) {
		int sum = 0;
		for(int index = 0 ; index < array.length ; index++) {
			if(array[index] % 2 == 0) {
				sum = sum + array[index];
				}
		}
		System.out.println("Sum of Even numbers is : " +sum);
	}
	
	
	public static void main(String[] args) {
		EvenNumberSum evenNumSum = new EvenNumberSum();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = scan.nextInt();
		
		int[] number = new int[size]; //int[] array
		
		for(int index = 0 ; index < number.length ; index++) {
			System.out.println("Enter number " +(index+1)+ " : " );
			 number[index] = scan.nextInt();
		}
		evenNumSum.sumOfEvenNumber(number);
		scan.close();
	}

}
