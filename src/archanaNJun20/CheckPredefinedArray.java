package archanaNJun20;

import java.util.Scanner;

public class CheckPredefinedArray {

	void checkNumberFrequency(int number, int array[]) {
		int fCount=0; 
		boolean found=false;
		for (int index=0;index<array.length;index++){
			if (array[index]==number){
				fCount++;
				found=true;
			}
		}
		if (found==true) 
			System.out.println("Given number "+ number +" is present in predefined array and frequency is "+fCount);
		else
			System.out.println("Given number "+ number +" is not present in predefined array.");
	}
	public static void main(String[] args) {
		CheckPredefinedArray checkPredefinedArray = new CheckPredefinedArray();
		Scanner scanner =new Scanner(System.in);
		int [] array= {10,3,9,-99,81,3,-11};
		System.out.println("Enter the count of input ");
		int input = scanner.nextInt();
		for (int index=0;index<input;index++) {
			System.out.println("Enter number "+ (index+1));
			int number=scanner.nextInt();
			checkPredefinedArray.checkNumberFrequency(number, array);
		}
		scanner.close();
	}
}