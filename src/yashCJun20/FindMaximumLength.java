package yashCJun20;

import java.util.Scanner;

public class FindMaximumLength {
	
	void findLength(String[] name, int cnt){
		int maxLength=name[0].length();
		String longName="";
		for(int index=1;index<cnt;index++){
			if(name[index].length()>maxLength){
				
				maxLength =name[index].length();
				longName = name[index];
			}
		}
		System.out.println("The Longest name is: "+longName);
		System.out.println("The max name lenght is: "+maxLength);
		
	}

	public static void main(String[] args) {
		
		int size=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many names you want to pass?");
		size=scanner.nextInt();
		String[] name = new String[size];
		for (int i=0;i<size;i++) {
			System.out.println("Please enter the names");
			name [i]=scanner.next();
			
			
		}
		FindMaximumLength findMaximumLength =new FindMaximumLength();
		findMaximumLength.findLength(name, size);
	}

}
