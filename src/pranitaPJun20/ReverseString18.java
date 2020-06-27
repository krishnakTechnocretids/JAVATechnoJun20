/*
 * Program 4 : 
Print given string in reverse order.

Input : Hello this is technocredits
Output : stiderconhcet si siht olleH
 */
package pranitaPJun20;

public class ReverseString18 {
	
	void displayReverseString(String input) {
		String reverse = "";
		for(int index=input.length()-1;index>=0;index--) {
			
			reverse=reverse+input.charAt(index);
			
		}
		System.out.println("Reverse order of the input string--> "+input+ "\n is-->"+reverse);
		
	}
	public static void main(String[] args) {
		String input = "Hello this is technocredits";
		ReverseString18 reverseString1 = new ReverseString18();
		reverseString1.displayReverseString(input);
	}

}
