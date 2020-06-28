package sweetyMJun20;
import java.util.Scanner;
public class MaxMinNumbers {
	int max=0;
	int min=0;
	void maxnumbers(int[] input){
		for(int index=0;index<input.length;index++){
			if (input[index]>max){
				max=input[index];
			}
		}
		System.out.println("Max numer is: " +max);
	}
	void minnumbers(int [] input){
		min=max;
		for(int index=0;index<input.length;index++){
			if (input[index]<min){
				min=input[index];
			}
		}
			System.out.println("Minimum  number is: " + min);	
		 	
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many times you want to configure?");
		int size=scanner.nextInt();
		int []num=new int[size];
		for(int index=0;index<num.length;index++){
			System.out.println("Enter numbers " );
			num[index]=scanner.nextInt();
		}
		MaxMinNumbers maxminnumbers=new MaxMinNumbers();
		maxminnumbers.maxnumbers(num);
		maxminnumbers.minnumbers(num);
	}
}
