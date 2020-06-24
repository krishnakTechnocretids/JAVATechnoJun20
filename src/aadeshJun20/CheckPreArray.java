package aadeshJun20;

import java.util.Scanner;

public class CheckPreArray {

	void findFreqOfNumber(int[] input,int findNum) {
		int count = 0;
		for (int index=0;index<input.length;index++) {
			if(input[index]==findNum) {
				count++;	
			}
		}
		if(count>0) {
			System.out.println("\nGiven number "+findNum+" is present in predefined array and have frequency " +count);
		}
		else
			System.out.println("\nGiven number "+findNum+" is not present in predefined array ");
}
	public static void main(String[] args) {
		CheckPreArray checkPreArray = new CheckPreArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int[]num= new int[size];

		for(int index=0;index<num.length;index++) {
			System.out.println("Enter Number "+(index+1)+ " in array");
			num[index] =scanner.nextInt();
		}

		String status="";
		do {

		System.out.println("Enter the number that you want to search");
		int findNum =scanner.nextInt();

		checkPreArray.findFreqOfNumber(num,findNum);

		System.out.println("\nDo you want to search the number again?(Y/N)");
		status = scanner.next();
		}while(status.equals("Y"));
		System.out.println("Program End Thank You");
		scanner.close();
	}

}