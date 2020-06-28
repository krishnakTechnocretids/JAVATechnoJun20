/*Print given string in reverse order.

Input : Hello this is technocredits
Output : stiderconhcet si siht olleH*/

package rachanaGJun20.String;

public class StringReverse {

	//method will print string in reverse order ---- Logic one----
	void reverseString1(String givenstr) {
		
		for(int i=givenstr.length()-1;i>=0;i--) {
			System.out.print(givenstr.charAt(i));
		}
		
	}
	
	//method will print string in reverse order ---Logic Two ----
	void reverseString2(String givenstr) {
		String revstr="";
		for(int i=givenstr.length()-1;i>=0;i--)
			 revstr= revstr + givenstr.charAt(i);
		System.out.println("\n"+revstr);
	}
	
	public static void main(String[] args) {
		StringReverse stringreverse = new StringReverse();
		String str = "Hello this is technocredits";
		System.out.println("Given String is : "+str);
		stringreverse.reverseString1(str);
		stringreverse.reverseString2(str);
	}

}
