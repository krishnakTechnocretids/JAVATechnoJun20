package archanaNJun20;

import java.util.Scanner;

public class CharacterFrequency {

	void oneCharacterFrequency(String name,char ch){
		int count = 0;
		for(int index=0;index<name.length();index++){
			if(name.charAt(index)==ch)
				count++;
		}
		System.out.println(ch+" "+count+" times in --> "+name);
	}
	void allCharacterFrequency(String name){
		for(int index=0;index<name.length();index++){
			oneCharacterFrequency(name, name.charAt(index));
		}
	}
	void allCharacterFrequencyFromArray(String[] name){

		for(int index=0;index<name.length;index++){
			allCharacterFrequency(name[index]);
		}
	}
	public static void main(String[] args) {
		CharacterFrequency characterFrequency= new CharacterFrequency();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Name");
		String oneName=scanner.next();
		System.out.println("Enter character");
		char ch=scanner.next().charAt(0);
		characterFrequency.oneCharacterFrequency(oneName, ch);
		System.out.println("*************************");
		characterFrequency.allCharacterFrequency(oneName);
		System.out.println("*************************");	
		String array[]=new String[2];
		for(int index=0;index<2;index++){
			System.out.println("Enter Name " +(index+1));
			array[index]=scanner.next();
		}
		characterFrequency.allCharacterFrequencyFromArray(array);
		scanner.close();
	}
}
