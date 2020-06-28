//word given by user has how many charecters asked by user--i
//shruti,ankit,aditi,nidhi
package shrutiDJun20;

import java.util.Scanner;

public class StringChar{
	
	void findchar(String[] word, char ch){
	
		for(int index=0;index<word.length;index++){
			String input = word[index];
			int count=0;
			for(int index2=0;index2<input.length();index2++){
			  if(input.charAt(index2)== ch)		
					count++;
			  // i will try this programm using  String.valueOf(c) method too.
			 
			}
			System.out.println("charecter "+ch+ " appears " +count+ " times in "+ word[index]);
			}
	}
	
	public static void main(String[] args) {
		StringChar stringChar = new StringChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many words you would like to enter?");
		int size = scanner.nextInt();
		String[] word = new String[size];
		
		for(int index=0;index<size;index++){
			System.out.println("Please enter word " +(index+1));
			word[index] = scanner.next();
		}
			System.out.println("Please enter charecter whose repetition count you whould like to know");
			char ch = scanner.next().charAt(0); //i
			stringChar.findchar(word, ch);
			scanner.close();
		}
}

