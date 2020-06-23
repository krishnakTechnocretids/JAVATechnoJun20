package archanaNJun20;

import java.util.Scanner;

public class CharFrequency {

	void findCharFrequency(String input,char ch){
		int count = 0;
		for(int index=0;index<input.length();index++){
			if(input.charAt(index)==ch){
				count++;
		}
		}
	
		System.out.println("Frequency of charcater "+ch+ " in "+ input +" is "+count);
	}
	
	public static void main(String[] args) {
		CharFrequency charfrequency=new CharFrequency();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length of array");
		int length=scanner.nextInt();
		String array[]=new String[length];
		for(int index=0;index<length;index++){
			System.out.println("Enter Name " +(index+1));
			array[index]=scanner.next();
		}
		System.out.println("Enter character");
		char find=scanner.next().charAt(0);
		
		System.out.println("*********************************");
		for(int index=0;index<length;index++){
			charfrequency.findCharFrequency(array[index],find);
		}
		scanner.close();
	}
}
