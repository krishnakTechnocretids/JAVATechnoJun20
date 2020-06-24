package nikhilMJun20;

import java.util.Scanner;

public class CharFreqModular {
	void charFreqFrmString(String str, char ch) {
		int chrFreq = 0;
		String findCh = String.valueOf(ch);
		
		for(int index=0; index<str.length(); index++) {
			if(String.valueOf(str.charAt(index)).equalsIgnoreCase(findCh))
				chrFreq++;
		}
		System.out.println("String: "+str+"\nCharacter "+ch+" at frequecy = "+chrFreq);
	}
	
	void charFreqAllChars(String str) {
		for(int index=0; index<str.length(); index++) {
			charFreqFrmString(str, str.charAt(index));
		}
		System.out.println("**************************************************************");
	}
	
	void charFreqAllCharAllArray(String[] strArr) {
		for(int index=0; index<strArr.length; index++) {
			charFreqAllChars(strArr[index]);
		}
	}
	
	public static void main(String[] args) {
		CharFreqModular charFreqModular = new CharFreqModular();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This program is modularly developed.\nFirst you will be able to find frequency of a single chracter from a String.\nThen, you will be able to find out frequency of all the chracters in a given String.\nLastly, you will be able to find of frequency of all the chracters of all the array elements of a String array.");
		
		//Module # 1
		System.out.println("\nModule # 1:-\nPlease eneter a String: ");
		String input = scanner.next();
		System.out.println("Please eneter the char of which frequency you need to know: ");
		char findCh = scanner.next().charAt(0);
		charFreqModular.charFreqFrmString(input, findCh);
		
		//Module # 2
		System.out.println("\nModule # 2:-\nPlease eneter a String for which frequency of all its characters will be displayed: ");
		input = scanner.next();
		charFreqModular.charFreqAllChars(input);
		
		//Module # 3
		System.out.println("\nModule # 3:-\nPlease eneter the Strings for each which frequency of all their characters will be displayed.\nHow many Strings do you want to enter? ");
		int arrLength=  scanner.nextInt();
		String[] strArray = new String[arrLength];
		for(int index=0; index<arrLength; index++) {
			System.out.println("Please enter String "+(index+1)+":");
			strArray[index] = scanner.next();
		}
		charFreqModular.charFreqAllCharAllArray(strArray);
		
		scanner.close();
	}
}
