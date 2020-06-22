package swapnaWJun20;

import java.util.Scanner;

public class CharFrequency {

	void charAtArray(String[] arrayInput, char findCh) {
		String input = "";

		for(int index=0;index<arrayInput.length;index++) {
			int count = 0;
			input = arrayInput[index];

			for (int index2 = 0; index2 < input.length(); index2++) {
				if(input.charAt(index2) == findCh) 
					count++;
			}
			System.out.println("In the Name " + input +" the character "+ findCh + " occurence --> "+ count );
		}
	}

	public static void main(String[] args) {

		CharFrequency charFrequency = new CharFrequency();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Specify the length of Array of Names : ");
		int arraySize = scanner.nextInt();

		String arrayInput [] = new String[arraySize];

		for(int index=0; index<arrayInput.length; index++){
			System.out.println("Enter the values of Array at index [" +index +"] :");
			arrayInput[index] = scanner.next();
		}

		System.out.println("Please enter character to search in the strings provided :");
		char findCh = scanner.next().charAt(0); 
		charFrequency.charAtArray(arrayInput, findCh);
		scanner.close();
	}
}