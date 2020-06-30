package rajAJun20;

public class FibonacciNumbers {
	
	void findFibonacciNumbers(int input) {
			int sum = 0;
			int firstNum = 0  , nextNum = 1 ;
			System.out.println("Fibonacci series for input " +input+ " is :");
			for(int index = 0 ; index < input ; index++ ) {
				sum = firstNum + nextNum;
				System.out.println(nextNum);
				firstNum = nextNum;
				nextNum = sum;
		}
	}
	
	public static void main(String[] args) {
		FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
		fibonacciNumbers.findFibonacciNumbers(5);
		fibonacciNumbers.findFibonacciNumbers(10);
	}
}
