/*
 Assigment 2 :
A) Find the name having maximum length from user given array [use scanner class to take names and size of an array]
 */
package kARAN1595;

import java.util.Scanner;

public class MaximumLength {
	
	String getMaximumLength(String[] input) {
		int maximum = input[0].length();
		String name = input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index].length()>maximum) {
				maximum = input[index].length();
				name= input[index];
			}
		}
		return name;
	}

	public static void main(String[] args) {
		MaximumLength maxLength=new MaximumLength();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = scan.nextInt();
		String[] name = new String[size];
		for(int index=0;index<size;index++)
		{
			System.out.println("Entre name:"+(index+1)+":");
			name[index]=scan.next();
		}
		System.out.println("Maximum Length of the name:"+maxLength.getMaximumLength(name));
		scan.close();
	}

}

/*Output:Enter size of array :
3
Entre name:1:
karan
Entre name:2:
karankumar
Entre name:3:
dasdda
Maximum Length of the name:karankumar
*/
