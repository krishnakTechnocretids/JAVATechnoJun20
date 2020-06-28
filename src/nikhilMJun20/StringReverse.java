/*Print given string in reverse order.

Input : Hello this is technocredits
Output : stiderconhcet si siht olleH
*/

package nikhilMJun20;

public class StringReverse {
	void displayReversedString (String str) {
		System.out.println("Given String:\n"+str+"\n\nReversed String:- ");
		for(int index=str.length()-1; index>=0; index--)
			System.out.print(str.charAt(index));
	}
	
	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		
		String str = "Hello this is technocredits";
		stringReverse.displayReversedString(str);
	}
}
