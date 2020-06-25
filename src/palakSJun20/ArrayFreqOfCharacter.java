package palakSJun20;

import java.util.Scanner;

public class ArrayFreqOfCharacter {

	//Find one character frequency from given name.
	void findOneCharFrequency(String name , char findCh){
		int count = 0;
			for (int index = 0; index < name.length(); index++) {
				if(name.charAt(index) == findCh )
					count++;
		}
			System.out.println("Charcter "+findCh +" --> "+count+ " times in " + name);
			
	}
	
	//Find all character frequency from given name.
	void findAllCharFrequencyFromName(String name){
		for (int i = 0; i < name.length(); i++) {
			findOneCharFrequency(name, name.charAt(i));
		}
		
		System.out.println("-------------------------------");
	}
	
	//find all character frequency from each name given in String array.
	void findAllCharFrequencyFromArray(String[] stringArray){
		for (int i = 0; i < stringArray.length; i++) {
			findAllCharFrequencyFromName(stringArray[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayFreqOfCharacter arrayFreqOfCharacter = new ArrayFreqOfCharacter();
		
		//Calling method 1 
		System.out.println("Enter the Name to find out frequency of one character");
		String name = sc.next();
		
		System.out.println("Enter the Character you want to search in "+ name +" name");
		char character = sc.next().charAt(0);
		
		arrayFreqOfCharacter.findOneCharFrequency(name , character );
		System.out.println("-------------------------------");
		
		//Calling method 2  
		System.out.println("Enter the Name to find out frequency of one character");
		String allFreqName = sc.next();
		arrayFreqOfCharacter.findAllCharFrequencyFromName(allFreqName);
		
		//Calling Method 3  
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		String[] stringArray = new String[size];
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println("Enter the Name");
			  stringArray[i] = sc.next();
		}
		arrayFreqOfCharacter.findAllCharFrequencyFromArray(stringArray);
	
		sc.close();
		

	}



}
