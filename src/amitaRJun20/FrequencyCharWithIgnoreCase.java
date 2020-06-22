package amitaRJun20;

import java.util.Scanner;

public class FrequencyCharWithIgnoreCase {
	
	//method to see frequency of character in string
		void findCharFrequency(String[] input,char ch) {
			int totalCharCount=0;
			String c = String.valueOf(ch);
			
			for(int index=0;index<input.length;index++) {
				int counter=0;			
				for(int frequency=0;frequency<input[index].length();frequency++) {
					if(String.valueOf(input[index].charAt(frequency)).equalsIgnoreCase(c)){
						counter++;
						totalCharCount++;
					}					
				}			
				System.out.println("The frequency of "+ch+" in "+input[index]+" is "+counter+" times");			
			}
			System.out.println("The frequency of "+ch+" in the array is "+totalCharCount);		
		}
		
		public static void main(String[] args) {
			FrequencyCharWithIgnoreCase charFreq=new FrequencyCharWithIgnoreCase();
			Scanner scanner=new Scanner(System.in);
			System.out.println("How many elements do you need in your array?");
			int elementSize=scanner.nextInt();
			String[] input=new String[elementSize];
			
			for(int index=0;index<elementSize;index++) {
				System.out.println("Enter name :"+(index+1));
				input[index]=scanner.next();			
			}
			
			System.out.println("Enter which character you want to see ?");
			char character=scanner.next().charAt(0);
			charFreq.findCharFrequency(input,character);			
		}
}
