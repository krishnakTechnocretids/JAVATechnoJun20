package barkhaPJun20;

import java.util.Scanner;

public class MaxLength {
	
	String longName;
	
	void getMaxLengthOfString (String[] array) {
	
		int maxNameLength=array[0].length();
		for (int index=0; index<array.length; index++) {
			if (array[index].length()>maxNameLength) {
				maxNameLength=array[index].length();
				longName=array[index];
			}	
		}	
		System.out.println("Longest Name enter is: "+longName);
		System.out.println("Length of Longest Name enter is: "+maxNameLength);
	}
	public static void main(String[] args) {
		MaxLength maxlength=new MaxLength();
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Plaese let us know how many names you want to enter to check total numbers of letters: ");
		int size= scanner.nextInt();
		String[] array= new String [size];
		for (int index=0; index<size; index++) {
			System.out.print("Hey! enter " +(index+1) +" name in order to check which have max nos.of letters:");
		array[index]=scanner.next();
		}	
		scanner.close();
		maxlength.getMaxLengthOfString(array);
	}
		
		
		
		
		
	
		
	
}
