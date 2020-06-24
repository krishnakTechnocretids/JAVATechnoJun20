//Find Max length of a given names using array and Scanner

package aavrutiDJun20;

import java.util.Scanner;

public class MaxLengthOfName {
	
	void maxLength(String[] listOfNames) {
		int max = 0;
		String maxLengthName = "";
		for(int index=0;index<listOfNames.length;index++) {
			if(listOfNames[index].length()>max) {
				max = listOfNames[index].length();
				maxLengthName = listOfNames[index];
			}
		}
		System.out.println("Maximum length of given name \"" + maxLengthName + "\" is: " + max);		
	}
	
	public static void main(String[] args) {
		MaxLengthOfName maxLengthOfName = new MaxLengthOfName();
		Scanner scanner = new Scanner(System.in);
		
		int arraySize = 0;
		boolean flag = false;
		do {
			System.out.println("Please Enter Number between 1-10 : ");
			arraySize = scanner.nextInt();
			if(arraySize>0 && arraySize<=10) {
				flag = true;
			}
		}while(flag==false);
		
		String[] name = new String[arraySize];
		
		for(int index=0;index<name.length;index++) {
			System.out.println("Enter Name " + (index+1) + " : ");
			name[index] = scanner.next();
		}
		
		maxLengthOfName.maxLength(name);
		scanner.close();
		
	}

}
