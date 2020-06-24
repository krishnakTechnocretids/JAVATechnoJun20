package anupSJun20;

import java.util.Scanner;

/*Find the frequency of character from a given String array.
Note: Take String array and character from the user.*/
public class FindCharacterFrequency {
	void findOneCharacterFrequency(String[] word, char ch) {
		String charChange = String.valueOf(ch);
		for(int index =0;index < word.length;index++) {
			int charCount = 0;
			for (int charFreq = 0;charFreq<word[index].length();charFreq++) {
			if(String.valueOf(word[index].charAt(charFreq)).equalsIgnoreCase(charChange))
				charCount++;
		}
			System.out.println("The number of Character "+ ch + " in " + word[index] + " is " + charCount);
	}
		
	
	}	
	public static void main(String[] args) {
		FindCharacterFrequency findCharacterFrequency = new FindCharacterFrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of words :");
		int num = sc.nextInt();
		String[] word = new String[num] ;
		for(int index =0;index<num;index++) {
		System.out.println("Enter the word :" + (index+1));
		word [index]= sc.next();
		}
		System.out.println("Enter the character : ");
		char ch = sc.next().charAt(0);
		findCharacterFrequency.findOneCharacterFrequency(word,ch);
		
	}

}
