package harshadBJun20;
/*Program 4 : 
Print given string in reverse order.

Input : Hello this is technocredits
Output : stiderconhcet si siht olleH*/
public class PrintReverseString {
	
	void displayReverseString(String str) {
		
		System.out.println("Reversed String is:");
		for(int index=str.length();index>0;index--) {
			System.out.print(str.charAt(index-1));
		}
		
	}
	public static void main(String[] args) {
		PrintReverseString printReverseString = new PrintReverseString();
		String str = "Hello this is technocredits";
		System.out.println("Original String: "+str);
		printReverseString.displayReverseString(str);
	}
}
