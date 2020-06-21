package rajAJun20;

import java.util.Scanner;

public class MaxStringOfArray {
	
	void getMaxString(String[] name) {
		String max = name[0];
		for(int index = 0 ; index < name.length ; index++) {
			if(name[index].length() > max.length()) {
				max = name[index];
			}
		}
		System.out.println("String with maximum character is : " + max);
	}

	public static void main(String[] args) {
		MaxStringOfArray maxstringofarray = new MaxStringOfArray();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter number of strings you want in string array:");
		int strArraySize = scanner.nextInt();
		
		String[] name = new String[strArraySize];
		
		for(int index = 0 ; index < name.length ; index++) {
			System.out.println("Enter string " + (index+1) + ":" );
			name[index] = scanner.next(); 
			
		}
		scanner.close();
		
		maxstringofarray.getMaxString(name);
		
	}
}
