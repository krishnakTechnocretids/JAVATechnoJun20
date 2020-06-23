package kartikeyDJune20;

import java.util.Scanner;

public class FrequencyStringArray {
	
	void frequency(String[] input, char ch){
		int cnt=0;
		for(int indexOfArray=0;indexOfArray<input.length;indexOfArray++) {
			int count=0;
			
			for(int indexofString=0;indexofString<input[indexOfArray].length();indexofString++) {
				
				if(input[indexOfArray].charAt(indexofString)==ch) {
					count++;
					cnt++;
				}
					
				
			}System.out.println("\n"+"Frequency of Character "+ch+ " in the "+input[indexOfArray]+" is "+count);
			
		}
		System.out.println("Frequency of selected character "+ch+" in whole array is "+cnt);
		
	}
	public static void main(String[] args) {
		FrequencyStringArray frequencyStringArray= new FrequencyStringArray();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Provide the size of the array: ");
		int size= scanner.nextInt();
		System.out.println("Please provide the character: ");
		char ch=scanner.next().charAt(0);
		
		if(size==0)
			System.out.println("Size of an array can't be Zero or -ive...");
		else {
			System.out.println("Please provide the String to be included in the array"+"\n"+"Please seperate one Strng with other by pressing 'Enter' ");
			String[] input=new String[size];
			for(int indexOfArray=0;indexOfArray<size;indexOfArray++) {
				input[indexOfArray]=scanner.next();
				
			}
			System.out.println("Contents in the Array: ");
			for(int indexOfArray=0;indexOfArray<size;indexOfArray++) {
				System.out.println("input["+indexOfArray+"]= "+input[indexOfArray]);
			}
			
			frequencyStringArray.frequency(input, ch);
		}
		
		
	}

}
