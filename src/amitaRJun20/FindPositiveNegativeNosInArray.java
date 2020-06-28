package amitaRJun20;

import java.util.Scanner;

public class FindPositiveNegativeNosInArray {
	
	int countPos=0;
	int countNeg=0;
	int diff=0;
	
	//method to find positive numbers count and negative numbers count
	void findPositiveandNegative(int[] array) {
		for(int index=0;index<array.length;index++) {
			if(array[index]>=0) {
				countPos++;
			}else
				countNeg++;
		}
		System.out.println("Positive numbers count--> "+countPos+"\nNegative numbers count--> "+countNeg);
	}
	
	//method to find Difference of positive number sum and negative number sum
	void diffOfPosSumNegSum(int[] array) {
		for(int index=0;index<array.length;index++) {
			if(array[index]>=0) {
				diff+=array[index];
			}else
				diff+=array[index];
		}
		System.out.println("difference of positive number sum and negative number sum is :-->"+diff);
	}
	
	public static void main(String[] args) {
		FindPositiveNegativeNosInArray findpositivenegative=new FindPositiveNegativeNosInArray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter how many numbers you want in the array");
		int input=scanner.nextInt();
		int[] array = new int[input];
			
		for(int index=0;index<array.length;index++) {
			System.out.println("Please enter number "+(index+1));
			array[index]=scanner.nextInt();						
		}		
		scanner.close();
		
		findpositivenegative.findPositiveandNegative(array);
		findpositivenegative.diffOfPosSumNegSum(array);
	}
}
