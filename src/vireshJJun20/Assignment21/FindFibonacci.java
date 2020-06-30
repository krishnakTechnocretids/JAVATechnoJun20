/*
Program 2: To print first n Fibonacci Numbers.
Input n = 5
Output = 1 1 2  3  5  8 

Input: n = 10 
Output :  1 1 2  3  5  8 13  21 34 55

Hint :
The next number is found by adding up the two numbers before it:
the 2 is found by adding the two numbers before it (1+1),
the 3 is found by adding the two numbers before it (1+2),
the 5 is (2+3),
and so on! 
*/

package vireshJJun20.Assignment21;

public class FindFibonacci {

	void getFibonacci(int input) {
		int cnt1 = 0;
		int cnt2 = 1;
		int output = 0;
		for (int i = 1; i <= input; i++) {
			output = cnt1 + cnt2;
			cnt1 = cnt2;
			cnt2 = output;
			System.out.print(cnt1 + " ");
		}
	}

	public static void main(String[] args) {
		new FindFibonacci().getFibonacci(10);
	}
}
