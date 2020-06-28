package aditiGJUN20;
/*

Write a program which print first and last index of every characters only if character has multiple occurrence.

Input : technocredits
Output :
t -> first index = 0 Last index = 11
e -> first index = 1 Last index = 8
c -> first index = 2 Last index = 6

Hint : To find first index of character --> indexOf() method
            To find last index of character --> lastIndexOf() method.
*/

class PrintIndex{

	// Method to check multiple occurance of character in string and print it's first and last Index.
	void printIndexForRepeatedChar(String input) {
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(index==input.indexOf(ch) && index!=input.lastIndexOf(ch))
				System.out.println(ch+"--> first index = "+input.indexOf(ch)+" Last index = "+input.lastIndexOf(ch));
		}		
	}
	
	public static void main(String[] args) {
		PrintIndex printIndex= new PrintIndex();

		String name="technocredits";
	//	String name="AditiAddddddiiitttiiiii";
		printIndex.printIndexForRepeatedChar(name);
	}
}