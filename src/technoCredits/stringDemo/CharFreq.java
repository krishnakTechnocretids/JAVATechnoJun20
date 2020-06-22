package technoCredits.stringDemo;

import java.util.Scanner;

public class CharFreq {

	void findCharFreq(String input,char ch) {
		int count = 0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == 'e')
				count++;
		}
		System.out.println(ch + " --> "+ count);
	}
	
	void findCharFreqOther(String input,char ch) {
		int count = 0;
		String findchar = String.valueOf(ch); // ch + "";
		for(int index=0;index<input.length();index++) {
			if(input.equalsIgnoreCase(findchar)) // 
				count++;
		}
		System.out.println(ch + " --> "+ count);
	}
	
	public static void main(String[] args) {
		CharFreq charFreq = new CharFreq();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Input :");
		String input = scanner.next();
		System.out.println("Please enter character:");
		char findCh = scanner.next().charAt(0); // 'e'<--"e".charAt(0)
		charFreq.findCharFreq(input, findCh);
	}
}
