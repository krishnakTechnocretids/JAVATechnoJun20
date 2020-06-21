package palakSJun20;

import java.util.Scanner;

public class ArrayMaxMinNumber {
	
	void MaximumNumber(int[] array){
		int max = array[0];
		for (int index = 0; index < array.length; index++) {
				if( array[index] > max )
					max = array[index];
		}
		System.out.println("Maximum Number is "+ max);
	 }
	
	void MinimumNumber(int[] array){
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i] < min)
				min = array[i];
		}
		System.out.print("Minimum Number is "+ min);
	}
	
	public static void main(String[] args) {
		ArrayMaxMinNumber maxMinNumber = new ArrayMaxMinNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		for (int index = 0; index < array.length; index++) {
			System.out.println("Enter the Number");
			array[index] = sc.nextInt(); 
		}
		maxMinNumber.MaximumNumber(array);
		maxMinNumber.MinimumNumber(array);
		sc.close();
		

	}

}
