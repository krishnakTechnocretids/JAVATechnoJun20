package madhuraMJun20.scannerClass;

import java.util.Scanner;

/*Assigment 2 :
A) Find the name having maximum length from user given array [use scanner class to take names and 
size of an array].*/
public class MaxLengthString {
	void maxLength(String[] name) {
		String str = name[0];
				
		for(int index=0; index < name.length;index++) {
			if(name[index].length() > str.length())
				str = name[index];
		}
		System.out.println("Name having maximum length is : " +str);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		MaxLengthString maxLengthString = new MaxLengthString();
		
		System.out.println("Enter the length of an Array: ");
		int arrayLength = scanner.nextInt();
		
		String[] name = new String[arrayLength];
		
		for(int index=0; index < arrayLength ; index++) {
			System.out.println("Enter name " +(index+1)+ ": ");
			name[index] = scanner.next();
		}
		maxLengthString.maxLength(name);
		scanner.close();
	}
}
