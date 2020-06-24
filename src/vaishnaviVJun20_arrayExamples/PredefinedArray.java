package vaishnaviVJun20_arrayExamples;

import java.util.Scanner;

public class PredefinedArray {
	
	void findFrequencyOfNumber(int[] input, int num) {
		int count=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]==num)
				count++;
		}
		if(count==0)
			System.out.println("Given number "+num +" is not present in predefined array");
		else
		System.out.println("Given number "+num +" is present in predefined array with frequency "+count);
	}

	public static void main(String[] args) {
		PredefinedArray predefinedArray = new PredefinedArray();
		int[] array = {10,3,9,-99,81,3,-11};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please provide number for which you want to find frequency: ");
		int num = scanner.nextInt();
		predefinedArray.findFrequencyOfNumber(array, num);
		scanner.close();
	}

}
