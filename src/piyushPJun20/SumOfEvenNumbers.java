package piyushPJun20;
import java.util.Scanner;

public class SumOfEvenNumbers {
	void sum(int [] num){ 
		int sum = 0;
		for(int i= 0; i<num.length; i++){
			if (num[i]%2 == 0){
				sum= sum + num[i];
			}
		}	
		System.out.println(" Sum of Even Numbers is: " + sum);
	}

	public static void main(String[] args){
		SumOfEvenNumbers sumeven = new SumOfEvenNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Enter array size: ");
		int size= scanner.nextInt();
		int[] num = new int[size];
		for(int i= 0; i<num.length; i++){ 
			System.out.print(" Enter number " + (i+1) + " : ");
			num[i]= scanner.nextInt();
		}
		sumeven.sum(num);
		scanner.close();
	}	
}