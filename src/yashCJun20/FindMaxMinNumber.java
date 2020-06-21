package yashCJun20;

import java.util.Scanner;

public class FindMaxMinNumber {
	
	int max;
	int min;
	
void findMaxNumber(int[] num){
		max=num[0];
		for(int index=1;index<num.length;index++){
			
			if(num[index]>max)
			max=num[index];
			
				
		}
		System.out.println("The Max No is "+max);
		
	}

void findMinNumber(int[] num){
	
	min=num[0];
	for(int index=1;index<num.length;index++){
		
		if(num[index]<min)
			min=num[index];
		
	
}
	System.out.println("The Min No is "+min);
}


	public static void main(String[] args) {
		
		int size=0;
		
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("How many numbers you want to pass?");
		size=scanner.nextInt();
		int[] num = new int[size];
		for (int i=0;i<size;i++) {
			System.out.println("Please enter the numbers");
			num [i]=scanner.nextInt();
			
		}
		FindMaxMinNumber findMaxMinNumber = new FindMaxMinNumber();
		findMaxMinNumber.findMaxNumber(num);
		findMaxMinNumber.findMinNumber(num);
		

	}

}
