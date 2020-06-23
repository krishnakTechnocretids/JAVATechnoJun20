package barkhaPJun20;

import java.util.Scanner;

public class PositiveNegativeNumbers {
	int positivecount=0;
	int negativecount=0;
	int sum;
	
	void countPosiveNo(int[] numPositive) {
		for (int i=0; i<numPositive.length; i++) {
			int positiveNumber=numPositive[i];
			if (positiveNumber>0)
				positivecount++;
		}
		System.out.println("Total Positive number in give array is:"+positivecount);

	}

	void countNegativeNo(int[] numNegative) {
		for (int j=0; j<numNegative.length; j++) {
			int negativeNumber=numNegative[j];
			if (negativeNumber<0)
				negativecount++;
		}
		System.out.println("Total Negative number in give array is:"+negativecount);

	}
	void additionOfArray(int[] add) {
		for (int index=0; index<add.length; index++) {
			sum=sum+add[index];
		}	
		
		System.out.println("Addition of all numbers(inclusing Positive and Negative nos) is:"+sum);
	}
public static void main(String[] args) {
	PositiveNegativeNumbers addition =new PositiveNegativeNumbers();
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Please enter Length of array for which you want addition of EVEN nos:");
	int length=scanner.nextInt();
	int[] input=new int[length];
	
	System.out.println("Pleas enter nos in array:");
	for(int index=0; index<input.length; index++)
		input[index]=scanner.nextInt();
	scanner.close();
	
	addition.countNegativeNo(input);
	addition.countPosiveNo(input);
	addition.additionOfArray(input);
	}
}




