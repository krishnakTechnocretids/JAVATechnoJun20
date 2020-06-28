/*
* Assignment 14 : 22nd Jun 2020
*
* Find the frequency of character from a given String array.
* Note: Take String array and character from the user.
*/


package aditiGJUN20;

import java.util.Scanner;

public class CharFrequency {
	
	String[] strArray;
	int arraySize;
	char freqChar;
	
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
	
	/* Written this block for Reference - Working Code
	 * int findCharFreq(String[] strArrayValue, char freqCh) {
		String freqChar=String.valueOf(freqCh);

		for(int index=0;index<strArrayValue.length;index++) {
			String name=strArray[index];
			for(int j=0;j<name.length();j++) {
				if(name.charAt(j)==freqCh) {
					System.out.println("In if loop");
					freqCount++;
				}
			}
		}
		return freqCount;
	}*/
	
	
	int findCharFreq(String[] strArrayValue, char freqCh) {
		String freqChar=String.valueOf(freqCh);
		int freqCount=0;
		for(int i=0;i<strArrayValue.length;i++) {
			
			for(int j=0;j<strArrayValue[i].length();j++) {
				String name=String.valueOf(strArray[i].charAt(j));
				//if(String.valueOf(strArrayValue[i].charAt(j)).equalsIgnoreCase(freqChar)) {
				if(name.equalsIgnoreCase(freqChar)) 
					freqCount++;
			}
		}
		return freqCount;
	}
	
	public static void main(String[] args) {
		CharFrequency charFrequency = new CharFrequency();
		
		charFrequency.setStrArrayValue();
		
		//System.out.println("Frequency count for char '"+charFrequency.freqChar+"' is: "+count);
		
		System.out.println("For given String Array Freq count for '"+charFrequency.freqChar+"' is:"
				+charFrequency.findCharFreq(charFrequency.strArray,charFrequency.freqChar));
		
		
		
	}

}
