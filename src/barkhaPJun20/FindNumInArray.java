package barkhaPJun20;

import java.util.Scanner;

public class FindNumInArray {
	

	void findExactNumInArray(int []  input, int num) {
		int count=0;
		for (int i=0; i<input.length; i++) {
			if(input[i]==num) {
				count++;
			}//else 
				//System.out.println("Given number "+num+" is not present in predefined Array");	
		}
		System.out.println("Given number "+num+" is present in predefined Array with frequency "+count+" times.");	
	}
	public static void main(String[] args) {
		FindNumInArray findNum=new FindNumInArray();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter Length of array you want:");
		int length=scanner.nextInt();
		
		int[] numArray=new int[length];
		
		System.out.println("Enter Numbers in Array to find desire number in it:");
		for (int index=0; index<length; index++) {
			numArray[index]=scanner.nextInt();
		}
		System.out.println("Enter the Number you want to match in array:");
		int number=scanner.nextInt();
		
		scanner.close();
		findNum.findExactNumInArray(numArray, number);
		
		}
}	

	
	
		
			
	
	
		
			
	
			 
	
			
			
		
	
		
			
		
		
		
	
			
	

	
	
