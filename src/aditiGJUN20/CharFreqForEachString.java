/*
* Assignment 14 : 22nd Jun 2020
*
* Find the frequency of character from a given String array for each each Array Input.
* Note: Take String array and character from the user.
*/


package aditiGJUN20;

import java.util.Scanner;

public class CharFreqForEachString {
	String[] strArray;
	int arraySize;
	char freqChar;
	
	// Method to take array input from user.
	void setStrArrayValue() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many Names/Value you want to enter in Array?");
		arraySize=scanner.nextInt();
		strArray= new String[arraySize];
		
		for(int index=0;index<arraySize;index++) {
			System.out.println("Enter Name "+(index+1));
			strArray[index]=scanner.next();
		}
		System.out.println("Enter the character for which you want to find frequency. ");
		freqChar=scanner.next().charAt(0);
		scanner.close();
	}
	
	// Find the character occurrence for each array element
	void findCharFreq(String[] strArrayValue, char freqCh) {
		String freqChar=String.valueOf(freqCh);
		System.out.println("Frequency of char '"+freqCh+"' for :");
		for(int index=0;index<strArrayValue.length;index++) {
			int freqCount=0;
			for(int j=0;j<strArrayValue[index].length();j++) {
				String name=String.valueOf(strArray[index].charAt(j));
				if(name.equalsIgnoreCase(freqChar)) 
					freqCount++;
			}
			System.out.println(strArrayValue[index]+" is: "+freqCount);
		}
	}
	
	public static void main(String[] args) {
		CharFreqForEachString charFrequencyForEachString = new CharFreqForEachString();
		
		charFrequencyForEachString.setStrArrayValue();
		charFrequencyForEachString.findCharFreq(charFrequencyForEachString.strArray,charFrequencyForEachString.freqChar);
		
	}

}
