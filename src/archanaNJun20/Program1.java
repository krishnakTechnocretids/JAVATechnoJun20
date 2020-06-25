package archanaNJun20;

import java.util.Scanner;

public class Program1 {
	void additionOfEvenNumber(int[] array){
		int sum=0;
		for (int index=0;index<array.length;index++){
			if (array[index]%2==0) {
				sum=sum+array[index];
			}
		}
		System.out.println("Sum of even number of array is -> "+sum);
	}
	public static void main(String[] args) {
		Program1 program1=new Program1();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array length");
		int length=scanner.nextInt();
		int array[]=new int[length];
		for (int index=0;index<array.length;index++){
			System.out.println("Enter Number " +(index+1));
			array[index]=scanner.nextInt();
		}
		program1.additionOfEvenNumber(array);
		scanner.close();
	}
}


