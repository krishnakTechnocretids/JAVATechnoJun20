/*
 * Assignment_13
 * Find the name having maximum length from user given array [use scanner class to take 
 * names and size of an array].
 */

package aditiGJUN20;

import java.util.Scanner;

public class MaxLengthOfString {

	String[] name;
	int arraySize;
	
	// Method to take names from user..
	void getString() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How many Names do you want to Enter?");
		arraySize=scanner.nextInt();
		name= new String[arraySize];
		
		System.out.println("---------------");
		for(int index=0;index<arraySize;index++) {
			
			System.out.println("Enter Name"+(index+1)+": ");
			name[index]=scanner.next();
			name[index]=name[index].trim();
		}
		scanner.close();
	}
	
	String stringMaxLength() {
		String longestString=name[0];
		for(int index=1;index<arraySize;index++) {
			if(longestString.length() < name[index].length())
				longestString=name[index];
		}
		
		return longestString;
	}
	
	public static void main(String[] args) {
		MaxLengthOfString maxLengthOfString=new MaxLengthOfString();
		maxLengthOfString.getString();
		System.out.println("Entered name ->"+maxLengthOfString.stringMaxLength()+" is longest and it has "
		+maxLengthOfString.stringMaxLength().length()+" characters");
		

	}

}
