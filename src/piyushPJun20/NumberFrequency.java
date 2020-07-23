package piyushPJun20;
import java.util.Scanner;

public class NumberFrequency {

	void number(int input[], int num)	{
		int count=0;
		for (int index=0; index<input.length;index++)	{
			if(input[index] == num)
				count++;			
		}
		if (count>0)
			System.out.println(" Given number "+ num +" is present in predefined array with frequency " + count);
		else
			System.out.println(" Given number "+ num +" is not present in predefined array");
	}

	public static void main(String[] args) {
		NumberFrequency numberfrequency = new NumberFrequency();
		Scanner scanner = new Scanner(System.in);

		int array[]= {10,3,9,-99,81,3,-11};

		System.out.println(" Enter the number you want to search in array : ");
		int num = scanner.nextInt();
		
		numberfrequency.number(array,num);
		scanner.close();
	}
}