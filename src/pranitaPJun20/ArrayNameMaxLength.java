/*Assgnment 13 : 21st Jun 2020
Program 2:
 * Find the name having maximum length from user given array [use scanner class to take names and size of an array].*/
package pranitaPJun20;

import java.util.Scanner;

public class ArrayNameMaxLength {
	
	
	public static void main(String[] args) {
		ArrayNameMaxLength arrayNameMaxLength=new ArrayNameMaxLength();
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("To find the longest string of an array ,Enter the size of an input array");
		int sizeOfArray =scanner.nextInt();
		String[] name = new String[sizeOfArray];
		for(int index=0;index<name.length;index++) {
			System.out.println("Enter Name "+ (index+1)+":");
			name[index] = scanner.next();
		}
		scanner.close();
		arrayNameMaxLength.findLength(name);
	}
		
		void findLength(String[] input) {
			String max = input[0];
			for(int index=1; index<input.length; index++) {
				if(max.length()<input[index].length()) {
					 max= input[index]; 
				}
			}
			System.out.println("\nName having maximum length is:"+max);
		}	
	}