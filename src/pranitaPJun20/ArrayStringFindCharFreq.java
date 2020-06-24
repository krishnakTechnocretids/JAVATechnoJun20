/*Assignment 16 : 24th Jun 2020
 * 2) Create a class with following functionality. [Estimated time: 35 mins]
a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits

b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	           a -> 4
                   k -> 2
                   a -> 4
                   n -> 1
                   k -> 2
                   s -> 1
                   h -> 1
                   a -> 4
c) Find all character frequency from each name given in String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
                   a -> 1 time in raj
                   j -> 1 time in raj
         =====================
		   a -> 3 time in aarya
		   a -> 3 time in aarya
		   r -> 1 time in aarya
                   y -> 1 time in aarya
                   a -> 3 time in aarya	
         ====================
          And so on....		 
 */
package pranitaPJun20;

import java.util.Scanner;

public class ArrayStringFindCharFreq {
	
	void findCharFreq(String input,char ch) {
		int count =0;
		for(int i=0;i<input.length();i++) {
				if(input.charAt(i)==ch) {
					count++;
				}		
		}
		System.out.println(ch+"--->"+count+" times" );	
		
	}
	
	void findAllCharFreq(String name) {
		for(int j=0;j<name.length();j++) {	
			findCharFreq(name, name.charAt(j));
		}
		System.out.println(" ");
	}
	
	void findAllCharFreqFromArray(String[] input) {
		for(int k=0;k<input.length;k++) {
			findAllCharFreq(input[k]);
		}
		
	}
	
	public static void main(String[] args) {
		ArrayStringFindCharFreq arrayStringFindCharFreq = new ArrayStringFindCharFreq();
		
		/*//Find one character frequency from given name
		System.out.println("\nString input 1:-One character frequency");
		String name = "technocredits";
		char ch = 'e';
		arrayStringFindCharFreq.findCharFreq(name,ch);
		//Find all character frequency from given name.
		System.out.println("\nString input 2:-All character frequency");
		String name1 = "aakanksha";
		arrayStringFindCharFreq.findAllCharFreq(name1);
		//Find all character frequency from each name given in String array.
	     //Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
		System.out.println("\nInput String array:-All character frequency from each name");
		String[] names = {"raj", "aarya", "aavruti", "shruti"};
		arrayStringFindCharFreq.findAllCharFreqFromArray(names);*/
		
		System.out.println("\nString input 1:-One character frequency");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string input");
		String name= scanner.next();
		System.out.println("Please enter the character whose frequency you want to calculate");
		char findChar= scanner.next().charAt(0);
		arrayStringFindCharFreq.findCharFreq(name,findChar);
		
		System.out.println("\nString input 2:-All character frequency");
		System.out.println("Enter second string input");
		String name1= scanner.next();
		arrayStringFindCharFreq.findAllCharFreq(name1);
		
		System.out.println("Input String array:-All character frequency from each name");
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		String[] names = new String [size];
		
		for(int index=0;index<names.length;index++) {
			System.out.println("Enter name "+(index+1)+" :");
			names[index]=scanner.next();	
		}
		arrayStringFindCharFreq.findAllCharFreqFromArray(names);
		scanner.close();
			
			
		
		}
	}


