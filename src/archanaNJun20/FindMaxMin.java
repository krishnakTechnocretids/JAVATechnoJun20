package archanaNJun20;

import java.util.Scanner;

public class FindMaxMin {

	void printMaximumNumber(int[] array){
		int max=array[0];
		for(int index=1;index<array.length;index++){
			if(array[index]>max) {
				max=array[index];
			}
		}
		System.out.println("Maximum number is "+max);
	}
	void printMimimumNumber(int[] array){
		int min=array[0];
		for(int index=0;index<array.length;index++){
			if(array[index]<min) {
				min=array[index];
			}
		}
		System.out.println("Minimum number is "+min);
	}

	public static void main(String[] args) {
		FindMaxMin FindMaxMin =new FindMaxMin();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=scanner.nextInt();
		int array[] =new int[size];

		for(int index=0;index<size;index++){
			System.out.println("Enter number "+ (index+1) + ":");
			array[index]=scanner.nextInt();	
		}
		FindMaxMin.printMimimumNumber(array);
		FindMaxMin.printMaximumNumber(array);
		scanner.close();
	}
	

}
