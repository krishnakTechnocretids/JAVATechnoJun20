package kartikeyDJune20;

import java.util.Scanner;

public class CharacterFrequencyInArray {
	Scanner scanner = new Scanner(System.in);
	int sizeOfArrray = 0;

	int sizeOfArray() {
		System.out.println("Provide the size of the array: ");
		sizeOfArrray = scanner.nextInt();
		boolean flag = true;
		do {
			if (sizeOfArrray <= 0) {
				System.out.println("Size cant be zero or negative.. Please provide again ..");
				sizeOfArrray = scanner.nextInt();
			} else
				flag = false;

		} while (flag == true);

		return sizeOfArrray;
	}

	String[] setValuesinArray(int size) {
		String[] input = new String[size];
		System.out.println("Provide the values in the array: ");
		for (int index = 0; index < input.length; index++) {
			input[index] = scanner.next();
			

		}
		System.out.println("Array provided: ");
		for (int index = 0; index < input.length; index++) {
			System.out.println("input[" +index+ "]= " + input[index]);
		}

		return input;
	}
	
	void getElementFromArray(String[] input ) {
		
		for(int index=0;index<input.length;index++) {
			
			String 	s1=input[index];
			characterFrequencyInElement(s1);
			System.out.println("**********************************");
			
		}
		
	}
	void characterFrequencyInElement(String element) {
		for(int index=0;index< element.length();index++) {
			int cnt=0;
			
			char ch=element.charAt(index);
			
			for(int indexOFString=0;indexOFString<element.length();indexOFString++) {
			
			if(element.charAt(indexOFString)==ch)
				cnt++;
			}
			System.out.println("Frequency of character: "+ch+" in element "+element+" is "+cnt);
		}
		
	}
	public static void main(String[] args) {
		
		CharacterFrequencyInArray characterFrequencyInArray= new CharacterFrequencyInArray();
		characterFrequencyInArray.characterFrequencyInElement("aakanksha");
		characterFrequencyInArray.getElementFromArray(characterFrequencyInArray.setValuesinArray(characterFrequencyInArray.sizeOfArray()));
		
				}

}
