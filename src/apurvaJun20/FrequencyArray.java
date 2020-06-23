package apurvaJun20;

import java.util.Scanner;

public class FrequencyArray {
	
	void displayCharFreqInArr(String[] strArray, char ch) {
		int charFreq = 0;
		String findChar = String.valueOf(ch);
		for(int arrElementIndex=0; arrElementIndex < strArray.length; arrElementIndex++) {
			
			charFreq = 0;
			for(int index=0; index < strArray[arrElementIndex].length(); index++) {
				
				if(String.valueOf(strArray[arrElementIndex].charAt(index)).equalsIgnoreCase(findChar))
					charFreq++;
			}
			System.out.println("Frequency of "+findChar+" Character in the String "+strArray[arrElementIndex]+" = " +charFreq);
		}
	}
	
	public static void main(String[] args) {
		
		FrequencyArray frequencyArray = new FrequencyArray();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many Strings do you want to enter?");
		
		int strArrayLength = scanner.nextInt();
		String[] strArray = new String[strArrayLength];
		for(int index=0; index<strArrayLength; index++) {
		System.out.println("Please enter String "+(index+1)+":");
		strArray[index] = scanner.next();
		}
		System.out.println("Which character you want to search?");
		char findChar = scanner.next().charAt(0);
	
		
		frequencyArray.displayCharFreqInArr(strArray, findChar);
		scanner.close();
		}
	}
