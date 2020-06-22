package kartikeyDJune20;

import java.util.Scanner;

public class MaximumLenghtInArray {

	void maximumAndMinimumLenghtElement(String[] input) {
		String smallestElement=input[0];
		String largestElement=input[0];
		
		for(int index=0;index<input.length;index++) {
			
			if(smallestElement.length()>input[index].length())
				smallestElement=input[index];
			if(largestElement.length()<input[index].length())
				largestElement=input[index];
		}
		
		System.out.println("Largest elenemt in the given array is: "+largestElement);
		System.out.println("Smallest element in the given array is: "+smallestElement);

	}

	public static void main(String[] args) {
		MaximumLenghtInArray maximumLenghtInArray = new MaximumLenghtInArray();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Provide the size of an array: ");
		int size = scanner.nextInt();

		if (size <= 0)
			System.out.println("Size of array should be greater than zero....");
		else {

			String[] input = new String[size];

			for (int index = 0; index < size; index++) {

				input[index] = scanner.next();
			}
			System.out.println("\n" + "Provided array is: ");
			for (int index = 0; index < size; index++) {
				System.out.println("input[" + index + "]= " + input[index]);
			}

			maximumLenghtInArray.maximumAndMinimumLenghtElement(input);

		}
	}
}
