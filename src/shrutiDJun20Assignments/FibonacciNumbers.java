package shrutiDJun20Assignments;

public class FibonacciNumbers {

	void findFibonacciNumber(int num) {
		int num1 = 0;
		int num2 = 1;
		int sumNum;
		System.out.println("Fibonacci series of first "+num +" numbers is below");
		for(int i = 1; i <=num;i++){
			sumNum=num1+num2;
			num1=num2;
			num2=sumNum;
			System.out.print(num1+ "  ");
		}
	}
	public static void main(String[] args) {
		FibonacciNumbers FibonacciNumbers = new FibonacciNumbers();
		FibonacciNumbers.findFibonacciNumber(10);
	}
}
