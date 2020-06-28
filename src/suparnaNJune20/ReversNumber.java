
/*Assignment 20 : 28th Jun 2020
 * Program 3: WAP to revers number (Consider Input as Integer not as String).
Example:-
Input:- 12345
Output:- 54321*/
  package suparnaNJune20;
 public class ReversNumber {
	void reversNumberint(int input) {
		int reversNo = 0;
		System.out.println("Orignal  number " + input);
		while (input !=0) {
			reversNo = reversNo * 10 + (input % 10);
			input = input/10;
		}
			System.out.println("Revers number " + reversNo );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 12355;
		ReversNumber reversNo = new ReversNumber();
		reversNo.reversNumberint(input);
			}
}
