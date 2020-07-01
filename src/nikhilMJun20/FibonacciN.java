/*To print first n Fibonacci Numbers.
Input n = 5
Output = 1 1 2 3 5 8

Input: n = 10
Output : 1 1 2 3 5 8 13 21 34 55

Hint :
The next number is found by adding up the two numbers before it:
the 2 is found by adding the two numbers before it (1+1),
the 3 is found by adding the two numbers before it (1+2),
the 5 is (2+3),
and so on!
*/

package nikhilMJun20;

import java.util.Scanner;

public class FibonacciN {
	void displayFibonacci(int order) {
		System.out.println("\nFibonacci Series of Order "+order+":-\n");
		int num1=1,num2=1,num3=0;
		for(int index=0; index<=order; index++) {
			if(index<2)
				System.out.print(num1+" ");
			else {
				num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
				System.out.print((num3)+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("This prgram will display Fibonacci series of the order you have asked.\nPlease enter order of the Fibonacci series:-");
		new FibonacciN().displayFibonacci(scanner.nextInt());
		scanner.close();
	}
}
