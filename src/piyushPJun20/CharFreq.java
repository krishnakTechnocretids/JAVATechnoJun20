package piyushPJun20;
import java.util.Scanner;

public class CharFreq {
	void charFreq(String[] input, char ch) {
		
		for(int i = 0; i < input.length ; i++) {
			int count=0;
			for(int index=0; index < input[i].length();index++) {
				if(input[i].charAt(index) == ch) 
					count++;
			}
			System.out.println("Frequency of " +ch+ " is : " +count);

			}
		}
		

	public static void main(String[] args) {
		CharFreq charFreq = new CharFreq();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number of String you want to Enter : ");
		int arrayLength = scanner.nextInt();
		
		String[] input = new String[arrayLength];
		
		for(int index=0; index<arrayLength; index++) {
			System.out.println("Enter name " +(index+1)+ ":");
			input[index] = scanner.next();
		}
		System.out.println("Enter the character : ");
		char findCh = scanner.next().charAt(0);
		charFreq.charFreq(input,findCh);
		
		scanner.close();
	}

}
