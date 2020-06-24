package vireshJJun20;

import java.util.Scanner;

class IdentifyPositiveNegative{
	int pSum;
	int nSum;
	void displayPosNeg(int[] arr){
		int pCnt=0;
		int nCnt=0;
		
		for (int i=0; i< arr.length; i++){
			if (arr[i]>0){
				pSum= pSum+ arr[i];
				pCnt++;
			}	
			else if(arr[i]<0){
				nSum= nSum + arr[i];
				nCnt++;	
			}
		}
		System.out.println(pCnt+ " positive & " + nCnt + " negative numbers.");	
		System.out.println("Sum of positive numbers: " + pSum + " . Sum of Negative numbers: " + nSum);
	}
	
	int displayDiff(int[] arr){
		int diff= pSum+ nSum;
		return diff;
	}
	
	public static void main(String[] args){
	
		IdentifyPositiveNegative ipn= new IdentifyPositiveNegative();
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int aSize= scanner.nextInt();
		int[] arr= new int[aSize];
		for (int i= 0; i<arr.length;i++){
			System.out.print("Enter number : ");
			arr[i]= scanner.nextInt();
		}	
		ipn.displayPosNeg(arr);
		int diff= ipn.displayDiff(arr);
		System.out.print("Difference of positive and Negative numbers from given array is: " +diff);
		scanner.close();
	}
}