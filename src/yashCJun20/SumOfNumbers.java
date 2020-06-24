package yashCJun20;

import java.util.Scanner;

public class SumOfNumbers {
	
	void SumOfArray(int[] num){

		int positiveCnt=0;
		int negativeCount=0;
		for(int index=0;index<num.length;index++) {
			
			if (num[index]>=0)
				positiveCnt++;
			else
				negativeCount++;
		}
		System.out.println(positiveCnt+" positive"+ " & " +negativeCount +" negative numbers");
		
	} 
	
	int DifofPostvAndNegtvNumberSum(int[] num) {
		int sum=0;
    for(int index=0;index<num.length;index++) {
			
			if (num[index]>=0)
				sum=sum+num[index];
			else
				sum=sum+num[index];
			
    }
     return sum;
	}
	
	public static void main(String[] args) {
		
		int size=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to pass?");
		size=scanner.nextInt();
		int[] num = new int[size];
		for (int i=0;i<size;i++) {
			System.out.println("Please enter the numbers");
			num [i]=scanner.nextInt();
		}
		
		int diff=0;
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
	    sumOfNumbers.SumOfArray(num);
	    diff=sumOfNumbers.DifofPostvAndNegtvNumberSum(num);
        System.out.println("Output :"+diff);
	}	
}