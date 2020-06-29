/*WAP to reverse number (Consider Input as Integer not as String).
Example:-
Input:- 12345
Output:- 54321
*/

package nikhilMJun20;

public class ReverseInteger {
	void revInteger(int num) {
		int originalNum = num, revInt=0;
		
		while(num>0) {
			revInt = 10*revInt+(num % 10);
			num = num/10;
		}
		System.out.println("\nOriginal Integer : "+originalNum+"\nReversed Integer : "+revInt);
	}
	
	public static void main(String[] args) {
		int num = 12345;
		new ReverseInteger().revInteger(num);
	}
}
