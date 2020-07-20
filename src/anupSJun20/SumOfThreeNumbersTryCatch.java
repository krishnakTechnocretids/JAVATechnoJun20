package anupSJun20;
/*WAP to get first 3 numbers from user. Print 3 numbers and their sum.(Use exception handling concept. )
Note : User may enter wrong inputs, make sure program should not break.

Input :
10
TechnoCredits
2tech3
30
40
Output : values are 10,30,40 and total is 80*/

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfThreeNumbersTryCatch {
	void findSumofThreeNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of digits to add :");
		int totalcount = sc.nextInt();
		int count = 0;
		int sum = 0;
		int[] input = new int[totalcount];
		
		while(count<totalcount)
			try {
				System.out.println("Please enter the number :" + (count+1));
				input[count] = sc.nextInt();
				sum+=input[count];
				count++;
		}
		catch(InputMismatchException ie){
			System.out.println("This is not a valid entry");
			String num = sc.nextLine();
		}
		System.out.println("Output Numbers are : "+ Arrays.toString(input));
		System.out.println("Total Sum "+ sum);
		
	}
	public static void main(String[] args) {
		SumOfThreeNumbersTryCatch sumOfThreeNumbersTryCatch = new SumOfThreeNumbersTryCatch();
		sumOfThreeNumbersTryCatch.findSumofThreeNumbers();
		
	}
}
