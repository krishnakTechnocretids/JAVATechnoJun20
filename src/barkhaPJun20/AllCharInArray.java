package barkhaPJun20;

import java.util.Scanner;

public class AllCharInArray {
	
	void findCharFreq(String name, char ch) {
		int count=0;
		for (int index=0;index<name.length();index++) {
			if (name.charAt(index)==ch)
				count++;
		}	
		System.out.println("Number of character "+ch+" in "+"name "+" is "+count);
		
	}	
	void findAllCharFreq(String name1) {	
		for (int i=0; i<name1.length(); i++) {
			char chartomatch=name1.charAt(i);
			findCharFreq(name1, chartomatch);
		}
	}
	void findAllCharFreqOfArray(String[] input) {
		for (int j=0; j<input.length; j++) {
			String name2=input[j];
			findAllCharFreq(name2);
		}
	}	
	public static void main(String[] args) {
		AllCharInArray  allCharInArray=new  AllCharInArray();
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Please tell now many names you want to enter:");
		int size=scanner.nextInt();
		String[] array=new String[size];
		
		for(int index=0;index<size;index++) {
			System.out.print("Please enter name "+(index+1)+" to find char in it:");
			array[index]=scanner.next();
		}
		
		allCharInArray.findAllCharFreqOfArray(array);
		
		scanner.close();
		
			
	}

}	
	
	
	
		
	
	
	
