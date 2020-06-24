package vaishnaviVJun20_arrayExamples;

import java.util.Scanner;

public class FreqChar {
	
	int getFrequencyOfCharacter(String[] input,char ch) {
		int count=0;
		for(int index=0;index<input.length;index++) {
			for(int i=0;i<input[index].length();i++) {
			if(input[index].charAt(i) == ch)
				count++;
		    }
		}
		return count;
	}

	public static void main(String[] args) {
		FreqChar freqChar = new FreqChar();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter size of an array: ");
		int size = scanner.nextInt();
		System.out.print("Please enter character for which you want to find frequency in a given string array:");
		char ch = scanner.next().charAt(0);
		String[] name = new String[size];
		for(int index=0;index<size;index++) {
			System.out.print("Please enter name: "+(index+1) +":");
			name[index] = scanner.next(); 
		}
		System.out.println("Frequency of " +ch+ " in given array is: "+freqChar.getFrequencyOfCharacter(name,ch));
		scanner.close();
	}
}
