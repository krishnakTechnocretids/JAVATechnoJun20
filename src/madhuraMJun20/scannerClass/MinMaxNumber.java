package madhuraMJun20.scannerClass;

import java.util.Scanner;

/*Program 1 :
A) Find maximum number from user given array [use scanner class to take numbers and size of an array]
B) Find minimum number from user given array [use scanner class to take numbers and size of an array]*/

public class MinMaxNumber {
	
	void findMaxNum(int[] num) {
		int max=num[0];
		for(int index=0; index < num.length;index++) {
			if(num[index] > max)
				max = num[index];
		}
		System.out.println("Maximum number of array is : "+max);
	}
	void findMinNum(int[] num) {
		int min=num[0];
		for(int index=0; index<num.length;index++) {
			if(num[index] < min)
				min = num[index];
		}
		System.out.println("Minimum number of array is : "+min);
	}
	
	public static void main(String[] args) {
		MinMaxNumber minMaxNumber = new MinMaxNumber();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of an Array : ");
		int length = scanner.nextInt();
		
		int[] num = new int[length];
			
		for(int index=0; index < length ; index++) {
			System.out.println("Enter number " +(index+1)+ ": ");
			num[index] = scanner.nextInt();
		}
		
		minMaxNumber.findMaxNum(num);
		minMaxNumber.findMinNum(num);
		
		scanner.close();
	}

}
