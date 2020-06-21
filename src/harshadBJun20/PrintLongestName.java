package harshadBJun20;

/*Assigment 2 :
A) Find the name having maximum length from user given array [use scanner class to take names and size of an array].*/

import java.util.Scanner;

public class PrintLongestName{

	void calculateNameLength(String[] name, int count){
		int maxNameLength=name[0].length();
		String longestName="";
		for(int index=1;index<count;index++){
			if(name[index].length()>=maxNameLength){
				maxNameLength =name[index].length();
				longestName = name[index];
			}
		}
		System.out.println("The Longest name from the array is: "+longestName+ " having length of "+maxNameLength+" characters");	
		System.out.println();
	}
	
	void printAllNamesWithLength(String[] name, int count){
		for(int index=0;index<count;index++){
			System.out.println("The name "+(index+1)+" is: "+name[index]+" having length of "+name[index].length()+ " characters");	
			System.out.println();	
		} 
		System.out.println();	
	}
	
	public static void main(String[] args) {
		PrintLongestName printLongestName = new PrintLongestName();
		
		Scanner sc = new Scanner(System.in);
		int size=0;
		System.out.println("Enter how many names you want to store in array: ");
		size = sc.nextInt();
		String[] names = new String[size];
		
		for(int index=0;index<size;index++){
			System.out.println("Enter Name "+(index+1)+ ": ");
			names[index]=sc.next();
		}
		
		printLongestName.printAllNamesWithLength(names,size);
		printLongestName.calculateNameLength(names,size);
		
		sc.close();
		
	}
}