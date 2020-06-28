package rajAJun20;

import java.util.Scanner;

public class CharacterFrequency {
	
		int getCharFrequency(String[] input , char ch) {
			int count=0;
			for(int index = 0; index < input.length; index++) {
				for(int i = 0; i <input[index].length(); i++) {
				if(input[index].charAt(i) == ch)
					count++;
			    }
			}
			return count;
		}
	
	
		public static void main(String[] args) {
			CharacterFrequency characterFrequency = new CharacterFrequency();
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Please enter size of an array: ");
			int size = scanner.nextInt();
			
			System.out.print("Enter character to find its frequency : ");
			char ch = scanner.next().charAt(0);
			
			String[] name = new String[size];
			
			for(int index = 0; index < size; index++) {
				System.out.print("Enter name " + (index+1) + ":");
				name[index] = scanner.next(); 
			}
			System.out.println("Frequency of " +ch+ " in strings of array is : " +characterFrequency.getCharFrequency(name,ch));
			scanner.close();
		}


}
	