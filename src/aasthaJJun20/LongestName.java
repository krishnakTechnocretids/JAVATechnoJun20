package aasthaJJun20;
import java.util.Scanner;

public class LongestName {
	
	String findLongestName(String[] name) {
		int maxLength = 1;
		String longName = "";
		for(int index = 1; index < name.length; index++) {
			if(name[index].length() > maxLength) {
				maxLength = name[index].length();
				longName = name[index];
			}
		}
		return longName;
	}
	
	
	public static void main(String[] args) {
		LongestName longestName = new LongestName();
		Scanner scanner = new Scanner(System.in);
		String status = "";
		
		do{
			int size ;
			do {
				System.out.println("How many NAMES you will enter, to get longest name");
				size = scanner.nextInt();
				if(size<=0)
					System.out.println("Please enter a valid number");
			}while(size<=0);
			
			String[] name = new String[size];
			for(int index=0 ; index < size ; index++) {
				System.out.println("Enter name : "+ (index+1));
				name[index] = scanner.next();
			}
			
			System.out.println("The longest name is: " + longestName.findLongestName(name));
			
			System.out.println("Press y if you wish to continue, else press n");
			status = scanner.next();
		}while(status.equals("y"));
		
		
		scanner.close();
	}
}
