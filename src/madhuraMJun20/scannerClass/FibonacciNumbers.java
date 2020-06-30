package madhuraMJun20.scannerClass;

/*Program 2: To print first n Fibonacci Numbers.
Input n = 6
Output = 1 1 2  3  5  8

Input: n = 10 
Output :  1 1 2  3  5  8 13  21 34 55*/
public class FibonacciNumbers {
	void findFibonacciNumber(int n) {
		int firstNum = 0;
		int nextNum = 1;
		System.out.print("\nFirst " + n + " Fibonacci numbers :- \n");

		for (int index = 0; index < n; index++) {
			int sum = firstNum + nextNum;
			System.out.print(nextNum + " ");
			firstNum = nextNum;
			nextNum = sum;
		}
	}

	public static void main(String[] args) {
		FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
		fibonacciNumbers.findFibonacciNumber(6);
		fibonacciNumbers.findFibonacciNumber(10);

	}
}