package amitaRJun20;

import java.util.Scanner;

public class FindCharacterFrequencyInArray {
	
	//method to get the input character count from selected string
	void getFrequencyOfChar(String name,char ch) {
		int count=0;
		String freq=String.valueOf(ch);
		
		for(int index=0;index<name.length();index++) {
			if(String.valueOf(name.charAt(index)).equalsIgnoreCase(freq))
				count++;
		}
		System.out.println(ch+"------> "+count+" times");
	}
	
	//method to display all characters count from given string
	void allCharFrequency(String inputName) {
		for(int index=0;index<inputName.length();index++) {
			getFrequencyOfChar(inputName,inputName.charAt(index));	
		}
		System.out.println("********************************************************");
	}
	
	//method to display all character frequency from a array of string
	void allCharFrequencyInArray(String[] array) {
		for(int index=0;index<array.length;index++) {
			allCharFrequency(array[index]);
		}
	}

	public static void main(String[] args) {
		FindCharacterFrequencyInArray findFrequency=new FindCharacterFrequencyInArray();
		Scanner scanner=new Scanner(System.in);
			
		//select one character from a given string
		System.out.println("Enter a String");
		String name=scanner.next();
		System.out.println("Select one character to see the frequency ");
		char character=scanner.next().charAt(0);
		
		//call method to see the frequency of character from given string
		findFrequency.getFrequencyOfChar(name,character);
		
		//call method to see all character frequency from given string
		System.out.println("****************************************************************");
		System.out.println("Enter a String to see all character frequency in the String");
		String inputName=scanner.next();
		findFrequency.allCharFrequency(inputName);
		
		//No of strings to enter in array
		System.out.println("***************************************************************");
		System.out.println("Enter how many Strings you want in the Array ");
		int input=scanner.nextInt();
		
		//Enter all strings in array
		String[] array=new String[input];
		for(int index=0;index<array.length;index++) {
			System.out.println("Enter string number "+(index+1));
			array[index]=scanner.next();
		}
		findFrequency.allCharFrequencyInArray(array);

	}

}
