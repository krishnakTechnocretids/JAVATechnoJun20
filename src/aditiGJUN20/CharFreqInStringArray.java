/*
Create a class with following functionality. [Estimated time: 35 mins]
a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits

b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
               a -> 4
                   k -> 2
                   a -> 4
                   n -> 1
                   k -> 2
                   s -> 1
                   h -> 1
                   a -> 4
c) Find all character frequency from each name given in String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
                   a -> 1 time in raj
                   j -> 1 time in raj
         =====================
           a -> 3 time in aarya
           a -> 3 time in aarya
           r -> 1 time in aarya
                   y -> 1 time in aarya
                   a -> 3 time in aarya   
*/

package aditiGJUN20;

import java.util.Scanner;

public class CharFreqInStringArray {
	// Method to check frequency of given character for input String
	void findCharFreqInString(String name, char ch) {
		String freqChar=String.valueOf(ch);
		int count=0;
		for(int charIndex=0;charIndex<name.length();charIndex++) {
			if(String.valueOf(name.charAt(charIndex)).equalsIgnoreCase(freqChar))
			count++;
		}
		System.out.println(ch+"---> "+count);	
	}
	
	// Method to check frequency of all characters for given input String
	void findAllCharFreqinString(String name) {
		for(int strIndex=0;strIndex<name.length();strIndex++) {
			findCharFreqInString(name,name.charAt(strIndex));
		}
		System.out.println("-----------------------------------");
	}
	
	// Method to check frequency of all characters for given input String Array
	void findAllCharFreqInStringArray(String[] inputArray) {
		System.out.println("Input Array is:");
		System.out.print("{ ");
		for(int index=0;index<inputArray.length;index++) {
			System.out.print(inputArray[index]+"  ");
		}
		System.out.println(" }");
		for(int arrayIndex=0;arrayIndex<inputArray.length;arrayIndex++) {
			findAllCharFreqinString(inputArray[arrayIndex]);
		}
		
	}
	
	public static void main(String[] args) {
		CharFreqInStringArray charFreqInStringArray= new CharFreqInStringArray();
		Scanner scanner=new Scanner(System.in);
		
		// Taking String input and character to find from user
		System.out.println("Please enter String:");
		String name=scanner.next();
		System.out.println("Enter character for which you want to find frequency: ");
		char freqChar=scanner.next().charAt(0);
		charFreqInStringArray.findCharFreqInString(name, freqChar);
		
		// Taking String input from user to find frequency of all characters
		System.out.println("Please enter String to find frequency of all characters:");
		String str=scanner.next();
		charFreqInStringArray.findAllCharFreqinString(str);
		
		// Taking String Array input from user to find frequency of all characters.
		System.out.println("How many Names/Value you want to enter in Array?");
		int arraySize=scanner.nextInt();
		String[] strArray= new String[arraySize];
		
		for(int index=0;index<arraySize;index++) {
			System.out.println("Enter Name "+(index+1));
			strArray[index]=scanner.next();
		}
		charFreqInStringArray.findAllCharFreqInStringArray(strArray);
		scanner.close();
	}

}
