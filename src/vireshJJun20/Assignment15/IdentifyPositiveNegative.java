package vireshJJun20.Assignment15;

import java.util.Scanner;

class IdentifyPositiveNegative{
	int pSum;
	int nSum;
	void displayPosNeg(int[] arr){ // displays number of positive and negative numbers with the individual count
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
		System.out.println("Sum of positive numbers: " + pSum + " and Sum of Negative numbers: " + nSum);
		
	}
	
	int displayDiff(int[] arr){ // returns the difference to main method
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
		int diff= ipn.displayDiff(arr); //will get the difference here.
		System.out.print("Difference of positive and Negative numbers from given array is: " +diff);
		scanner.close();
	}
}
