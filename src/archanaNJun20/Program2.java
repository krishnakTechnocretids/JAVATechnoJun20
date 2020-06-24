package archanaNJun20;

import java.util.Scanner;

public class Program2 {

	void findPositiveNegative(int []array){
		int pCount=0;
		int nCount=0;
		for(int index=0;index<array.length;index++){
			if(array[index]>0){
				pCount++;
			}
			else if(array[index]<0){
				nCount++;
			}
		}
		System.out.println("Positive numbers in array is  "+pCount);
		System.out.println("Negative numbers in array is "+nCount);
	}
	int positiveNegativeSumDiff(int[] array){
		int pSum=0;
		int nSum=0;
		for(int index=0;index<array.length;index++){
			if(array[index]>0){
				pSum +=array[index];
			}
			else if(array[index]<0){
				nSum +=array[index];
			}
		}
		System.out.println("sum of positive number is "+pSum);
		System.out.println("sum of negative number is "+nSum);
		int diff=(pSum)+(nSum);
		return diff;
	}
	public static void main(String[] args) {
		Program2 program2=new Program2();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=scanner.nextInt();
		int[] array=new int[size];
		for(int index=0;index<array.length;index++ ){ 
			System.out.println("Enter number");
			array[index]=scanner.nextInt();
		}
		program2.findPositiveNegative(array);
		System.out.println("Differnce between Positive and negative is "+program2.positiveNegativeSumDiff(array));
		scanner.close();
	}
}


