/*
 * Program 2 : 
Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
              u is middle character in Maulik 
 

 */
package pranitaPJun20;

public class PrintMiddleCharOfAllWords18 {
	
		void displayMiddleChar(String[] input) {
			int middleCharIndex = 0;
			for(int index=0; index<input.length; index++) {
				
				if(input[index].length()%2 == 0)
					middleCharIndex = (input[index].length())/2 - 1;
				else
					middleCharIndex = (input[index].length())/2;
				System.out.println("Middle chracter of String "+input[index]+": "+input[index].charAt(middleCharIndex));
			}
			
		}

		public static void main(String[] args) {
			PrintMiddleCharOfAllWords18 printMiddleCharOfAllWords18 = new PrintMiddleCharOfAllWords18();

			String input = "Harsh Maulik";

			String[] StringArray = input.split(" ");
			
			printMiddleCharOfAllWords18.displayMiddleChar(StringArray);
		}
	
}
