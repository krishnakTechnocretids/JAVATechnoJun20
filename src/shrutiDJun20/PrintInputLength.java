//Find the name having maximum length from user given array [use scanner class to
//take names and size of an array].

package shrutiDJun20;

import java.util.Scanner;

public class PrintInputLength {

	static void maxLengthName(String[] name){
		int maxlength=0;
		String longestname="";
		for(int index=0;index<name.length;index++){
			
			if (maxlength<name[index].length()){
			maxlength = name[index].length();
			longestname = name[index];
			}
		}
		
		System.out.println("The longest name in the list provided by user is "+longestname + " having length: "+ maxlength);
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many names do you want to enter?");
		int size = scanner.nextInt();
		String[] str = new String[size];
		for(int index = 0; index<size; index++){
			System.out.println("Please enter name "+ (index+1));
			str[index]= scanner.next();
		}
		PrintInputLength.maxLengthName(str);

		scanner.close();
	}

}
