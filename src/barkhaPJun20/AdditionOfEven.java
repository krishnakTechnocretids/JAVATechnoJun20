package barkhaPJun20;

import java.util.Scanner;

public class AdditionOfEven {
	
	int sum=0;
	void sumOfEvenNum(int[] num) {
		for (int i=0; i<num.length; i++) {
			int number=num[i];
			if (number%2==0)
				sum=sum+number;
		}
		
		System.out.println("Addition of only Even Nos in given Array is:"+sum);
	}
	
	public static void main(String[] args) {
		AdditionOfEven addition =new AdditionOfEven();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter Length of array for which you want addition of EVEN nos:");
		int length=scanner.nextInt();
		int[] input=new int[length];
		
		System.out.println("Pleas enter nos in array:");
		for(int index=0; index<input.length; index++)
			input[index]=scanner.nextInt();
		scanner.close();
		
		addition.sumOfEvenNum(input);
	}	
		
}		
	


