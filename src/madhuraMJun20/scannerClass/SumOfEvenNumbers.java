package madhuraMJun20.scannerClass;

import java.util.Scanner;

public class SumOfEvenNumbers {
	void findEvenNum(int[] num) {
		int sum = 0;
		for(int index=0; index<num.length;index++) {
			if(num[index]%2==0)
				sum += num[index];
						
		}System.out.println("Sum of even numbers in an array is : " +sum);
	}
	public static void main(String[] args) {
		SumOfEvenNumbers sumOfEvenNumbers = new SumOfEvenNumbers();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of an Array : ");
		int size = scanner.nextInt();
		
		int[] num = new int[size];
		for(int i=0;i<num.length;i++) {
			System.out.println("Enter number "+(i+1)+ " : " );
			num[i] = scanner.nextInt();
		}
		
		sumOfEvenNumbers.findEvenNum(num);
		scanner.close();
	}

	
	
}
