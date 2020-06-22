package madhuraMJun20.scannerClass;

import java.util.Scanner;

public class CharFrequency {
		
	void findCharFreq(String[] input, char ch) {
		int count=0;
		for(int arrIndex =0;arrIndex < input.length ;arrIndex++) {
			for(int index=0; index < input[arrIndex].length();index++) {
				if(input[arrIndex].charAt(index) == ch) 
					count++;
			}
		}
		System.out.println("Frquency of " +ch+ " is : " +count);
	}
	
	public static void main(String[] args) {
		CharFrequency charFrequency = new CharFrequency();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many names you want to consider? : ");
		int arrayLength = scanner.nextInt();
		
		String[] input = new String[arrayLength];
		
		for(int index=0; index<arrayLength; index++) {
			System.out.println("Enter name " +(index+1)+ ":");
			input[index] = scanner.next();
		}
		System.out.println("Please enter the character : ");
		char findCh = scanner.next().charAt(0);
		charFrequency.findCharFreq(input,findCh);
		
		scanner.close();
	}
}
