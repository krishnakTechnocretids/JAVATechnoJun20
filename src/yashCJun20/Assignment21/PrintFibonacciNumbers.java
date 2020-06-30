package yashCJun20.Assignment21;

public class PrintFibonacciNumbers {
	
	void toPrintFibonacciNumbers(int n) {
		
		int num1=0;
		int num2=1;
		System.out.println("The Fibonacci series for count " +n + " is");
		for (int index=0;index<n;index++) {
			
		    num1 =num1 +num2;
			num2=num1-num2;
			System.out.print(num1 +" ");
		
	}
		System.out.println();
	}

	public static void main(String[] args) {
		
		PrintFibonacciNumbers printFibonacciNumbers = new PrintFibonacciNumbers();
		printFibonacciNumbers.toPrintFibonacciNumbers(6);
		printFibonacciNumbers.toPrintFibonacciNumbers(10);
		
			
		}

}
