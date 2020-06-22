/*Assigment 2 : 
A) Find the name having maximum length from user given array [use scanner class to take names and size of an array].*/
package amitaRJun20;

import java.util.Scanner;

public class MaximumLengthInArray {
	
	void maxLengthWordInArray(String[] array) {
		String max=array[1];
		int maxlength=array[0].length();
		for(int index=0;index<array.length;index++) {
			if(array[index].length()>max.length())
				max=array[index];
		}
		System.out.println("The largest word inside the array is :"+max);			
		}

	public static void main(String[] args) {
		MaximumLengthInArray maximumlengtharray=new MaximumLengthInArray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter how many elements you want in the array");
		int input=scanner.nextInt();
		String[] array = new String[input];
		
		for(int index=0;index<array.length;index++) {
			System.out.println("Please enter the word "+(index+1));
			array[index]=scanner.next();
		}
		maximumlengtharray.maxLengthWordInArray(array);

	}

}
