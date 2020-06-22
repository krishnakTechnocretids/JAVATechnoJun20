package sweetyMJun20;

import java.util.Scanner;

public class FreqCharacter {
	void frequencyChar(String[] input, char ch){
		int count=0;
		for(int i=0; i < input.length; i++){
			for(int index=0;index<input[i].length();index++){
				if(input[i].charAt(index) == ch){
					count++;
				}
			}
		}
		if(count==0){
		System.out.println("You enter a invalid character: " + ch);
		}
		else {
		System.out.println("Frequency of character in input is: " + count);
		}
	}
	
	public static void main(String[] args){
		FreqCharacter freqcharacter=new FreqCharacter();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many times you want to configure?");
		int size=scanner.nextInt();
		String []input=new String[size];
		for(int index=0;index<input.length;index++){
			System.out.println("Enter input " +(index+1) + ":");
			input[index]=scanner.next();
		}
		System.out.println("Enter Character which you want to find from input: " );
		char ch=scanner.next().charAt(0);			
		freqcharacter.frequencyChar(input,ch);
	}
}
