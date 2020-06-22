package pranitaPJun20;

import java.util.Scanner;

public class ArrayStringCharFreq {
	
	void findArrayCharFreq(String[] input,char ch) {
		int totalCount=0;
		
		//first for loop is for selecting string element(name/word) index-wise
		for(int index=0;index<input.length;index++) {
			//second for loop is for finding char using the length of the name entered
			int count=0;
			for(int i=0;i<input[index].length();i++) {
				
				if(input[index].charAt(i)==ch) {
					count++;
					totalCount++;
				}		
			}
			System.out.println("\nFrequency of "+ch+" in name "+input[index]+" is :"+count);
		}
		System.out.println("\nFrequency of "+ch+" in array is :"+totalCount);
	}
		
		/*not working properly
		 * void findArrayCharFreqOther(String[] input,char ch) {
			int finalCount=0;
			String findCh = String.valueOf(ch);
			
			for(int index=0;index<input.length;index++) {
				int count=0;
				for(int i=0;i<input[index].length();i++) {
					
					if((input[index].charAt(i)).equalsIgnoreCase(findCh));
						count1++;	
						totalCount++;
			}
		}
			System.out.println("\nFrequency of "+ch+" is: "+count1);	
	}*/
	
	public static void main(String[] args) {
		ArrayStringCharFreq arrayStringCharFreq = new ArrayStringCharFreq();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of string array");
		int size = scanner.nextInt();
		String[] name = new String[size];	//declare the array
		
		for(int index=0;index<name.length;index++) {
			System.out.println("Enter name "+(index+1)+":"); //initialize the array
			name[index] = scanner.next();	
		}
		
		System.out.println("Please enter the character whose frequency you want to calculate");
		char findChar= scanner.next().charAt(0);
		
		arrayStringCharFreq.findArrayCharFreq(name,findChar);
		//arrayStringCharFreq.findArrayCharFreqOther(name,findChar);
		
		scanner.close();
	}

}
