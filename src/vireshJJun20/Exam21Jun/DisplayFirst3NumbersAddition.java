package vireshJJun20.Exam21Jun;

import java.util.Scanner;

public class DisplayFirst3NumbersAddition {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);	
		
		int cnt=1;
		int sum=0;
		while (cnt<=3) {
		System.out.println("enter a number:");
		int num=scanner.nextInt();
		if (num<=0) 
			System.out.println("Please enter a positive number other than 0");
		if(num>0) {
			sum = sum+ num;
			cnt++;
		}
		}
		scanner.close();
		System.out.println("Sum of all positive numbers:" + sum);
		
		
	}
}
