//Count Characters frequency in the given string using Scanner and Array

package aavrutiDJun20;

import java.util.Scanner;

public class CharFreqInString {
	
	void charFreqCount(String[] input,char ch) {
		System.out.println("\nCount of the character '" + ch + "' is : ");
		for(int index=0;index<input.length;index++) {
			int count = 0;
			for(int index2=0;index2<input[index].length();index2++) {
				if(input[index].charAt(index2) == ch)
					count++;
			}
			System.out.println(input[index] + " --> " + count);
		}
	}
		
	public static void main(String[] args) {
		CharFreqInString charFreqInString = new CharFreqInString();
		Scanner scanner = new Scanner(System.in);
		
		int arraySize;
		boolean flag = false;
		
		do{
			System.out.println("Please Enter the number between 1-10 : ");
			arraySize = scanner.nextInt();
			if(arraySize>0 && arraySize<=10)
				flag = true;
		}while(flag==false);
		
		String[] inputString = new String[arraySize];
		
		for(int index=0;index<inputString.length;index++) {
			System.out.println("Please enter string " + (index+1) + " : ");
			inputString[index] = scanner.next().toLowerCase();
		}
		
		System.out.println("Enter the character for which you want to find frequency : ");
		char ch = (scanner.next().toLowerCase()).charAt(0);
				
		charFreqInString.charFreqCount(inputString,ch);
		
		scanner.close();
	}
}