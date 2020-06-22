package nikhilMJun20;

import java.util.Scanner;

public class FindCharFreqInStrArray {
	
	void displayCharFreqInArr(String[] strArray, char ch) {
		int chFreq = 0;
		String findCh = String.valueOf(ch);
		
		for(int arrElementIndex=0; arrElementIndex < strArray.length; arrElementIndex++) {
			//String buffStr = strArray[arrElementIndex];
			for(int index=0; index < strArray[arrElementIndex].length(); index++) {
				//String strCh = String.valueOf(strArray[arrElementIndex].charAt(index));
				if(String.valueOf(strArray[arrElementIndex].charAt(index)).equalsIgnoreCase(findCh))
					chFreq++;
			}
		}
		System.out.println("Frequency of "+findCh+" Character in the String Array = "+chFreq);
	}
	
	public static void main(String[] args) {
		FindCharFreqInStrArray findCharFreqInStrArray = new FindCharFreqInStrArray();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many Strings do you want to enter?");
		int strArrayLength = scanner.nextInt();
		String[] strArray = new String[strArrayLength];
		for(int index=0; index<strArrayLength; index++) {
			System.out.println("Please enter String "+(index+1)+":");
			strArray[index] = scanner.next();
		}
		
		System.out.println("What character you want to search in the String array that you have entered?");
		char findCh = scanner.next().charAt(0);
		
		findCharFreqInStrArray.displayCharFreqInArr(strArray, findCh);
		scanner.close();
	}
}
