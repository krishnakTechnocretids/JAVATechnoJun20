package aavrutiDJun20;

import java.util.*;

public class CharacterFrequency {
	
	//will count char for given name
	void charSearchInName(String name,String nameSearch) {
		int charCount = 0;
		for(int index=0;index<name.length();index++) {
			if(String.valueOf(name.charAt(index)).equalsIgnoreCase(nameSearch)) {
				charCount++;
			}
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(nameSearch + " --> " + charCount + " time in technocredits.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	//Will count every char for given name
	void allCharFreqInName(String name) {
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		for(int index=0;index<name.length();index++) {
			char ch = name.charAt(index);
			int charCount = 0;
			for(int index2=0;index2<name.length();index2++) {
				if(name.charAt(index2) == ch)
					charCount++;
			}
			System.out.println(ch + " --> " + charCount);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	//Will count char for given array of names
	void allCharFreqInArray(String[] nameArray) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		for(int index=0;index<nameArray.length;index++) {	
			String name = nameArray[index];
			for(int cIndex=0;cIndex<name.length();cIndex++) {
				char ch = name.charAt(cIndex);
				int charCount = 0;
				for(int index2=0;index2<name.length();index2++) {
					if(name.charAt(index2) == ch )
						charCount++;
				}
				System.out.println(ch + " --> " + charCount + " time in name " + nameArray[index]);
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");			
		}
	}
	
	public static void main(String[] args) {
		CharacterFrequency characterFrequency = new CharacterFrequency();
		Scanner scanner = new Scanner(System.in);
		
		String name = "technocredits";
		
		System.out.println("Please enter a character which you want to search in \"technocredits : \"");
		String nameSearch = scanner.next();
		
		String[] nameArray = {"aavruti","akanksha","aarti","viplove"};
		
		characterFrequency.charSearchInName(name,nameSearch);
		characterFrequency.allCharFreqInName(name);
		characterFrequency.allCharFreqInArray(nameArray);
		
		scanner.close();
	}

}
