package vaishnaviVJun20_arrayExamples;

import java.util.Scanner;

public class StringArray {
	
	String getNameWithMaximumLength(String[] input) {
		int max = input[0].length();
		String name= input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index].length()>max) {
				max = input[index].length();
			    name = input[index];
			}
		}
		return name;				
	}

	public static void main(String[] args) {
		StringArray stringArray = new StringArray();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter size of an array: ");
		int size = scanner.nextInt();
		String[] name = new String[size];
		for(int index=0;index<size;index++) {
			System.out.print("Please enter name " +(index+1) +":");
			name[index] = scanner.next();
		}
    System.out.println("Out of given names: name with a maximum length is: "+stringArray.getNameWithMaximumLength(name));
    scanner.close();
	}

}
