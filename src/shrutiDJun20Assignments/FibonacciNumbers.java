package shrutiDJun20Assignments;

public class FibonacciNumbers {

	void findFibonacciNumber(int num) {
		int a = 0;
		int b = 1;
		int c;
		System.out.println("Fibonacci series of first "+num +" numbers is below");
		for(int i = 1; i <=num;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(a+ "  ");
		}
	}
	public static void main(String[] args) {
		FibonacciNumbers FibonacciNumbers = new FibonacciNumbers();
		FibonacciNumbers.findFibonacciNumber(10);
	}
}
