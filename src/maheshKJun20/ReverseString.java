/*
 * Print given string in reverse order.
 * Input : Hello this is technocredits
 * Output : stiderconhcet si siht olleH
 */

package maheshKJun20;

public class ReverseString {
	
	void displayStrReverse(String str) {
		//Method is Display the Input String value in Reverse
		System.out.print("Input Value: " + str + "\nOutput Value: " );
		for(int index=(str.length()-1);index>=0;index--) {
			System.out.print(str.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String str = "Hello this is technocredits";
		reverseString.displayStrReverse(str);
	}

}
