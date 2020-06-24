package aadeshJun20;

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
