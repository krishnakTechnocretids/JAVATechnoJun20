/*Program 3: WAP to revers number (Consider Input as Integer not as String).
Example:-
Input:- 12345
Output:- 54321 */
package jagadeeshMJun20;

import java.util.Scanner;

public class ReversNumber {
	void displayReverseInput(int num) {
		String sum="";
		while(num>0) {
			sum = sum+num%10;
			num=num/10;
		}
			System.out.println("Output : - "+Integer.valueOf(sum));
	}
	public static void main(String[] agrs) {
		ReversNumber reversNumber = new ReversNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scanner.nextInt();
		reversNumber.displayReverseInput(num);
		scanner.close();
	}
}
