package anupSJun20;

import java.util.Scanner;

/*Assigment 2 :
A) Find the name having maximum length from user given array [use scanner class to take names and size of an array].
*/
public class MaxLengthName {
	void maxName(String[] name) {
		String maxNamearray = name[0];
		int maxlength = name[0].length();
		for(int index = 0;index<name.length;index++) {
			if(name[index].length() > maxNamearray.length())
				maxNamearray = name[index];
		}
		System.out.println("The maximum length name is " + maxNamearray + " and the length is :" +maxNamearray.length());
	}
	
	public static void main(String[] args) {
		MaxLengthName maxLengthName = new MaxLengthName();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how many names to enter");
		int input = sc.nextInt();
		String[] name = new String[input];
		for(int index = 0;index<name.length;index++) {
			System.out.println("Please enter the name "+ (index+1));
			name[index] = sc.next();
		}
		maxLengthName.maxName(name);
	}

}
