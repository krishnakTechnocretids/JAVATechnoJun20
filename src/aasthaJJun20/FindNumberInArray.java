package aasthaJJun20;
import java.util.Scanner;

public class FindNumberInArray {
	void findNumber(int[] input,int num){
		int count = 0;
		for(int index = 0; index<input.length; index++){
			if(input[index] == num)
				count++;
		}
		if(count == 0)
			System.out.println("Given number "+num+" is not present in predefined array");
		else
			System.out.println("Given number "+num+" is present in user defined array with frequency "+count);
	}
	
	public static void main(String[] args){
		FindNumberInArray findNumberInArray = new FindNumberInArray();
		Scanner scanner = new Scanner(System.in);
		String status = "";
		do{
			System.out.print("How many integers would you like to enter? : ");
			int size = scanner.nextInt();
			int[] numsArray = new int[size];
			for(int index = 0; index < numsArray.length; index++){
				System.out.print("Enter integer " + (index+1)+" : ");
				numsArray[index] = scanner.nextInt();
			}
			System.out.print("Which number would you like to find in above entered array? ");
			int num = scanner.nextInt();
			findNumberInArray.findNumber(numsArray,num);
			System.out.println("\nPress y if you want to continue");
			status = scanner.next();
		}while(status.equalsIgnoreCase("y"));
		scanner.close();
	}
}
