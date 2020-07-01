package aasthaJJun20;

public class FibonacciNumbers {
	void diplayFibonacciSeries(int range){
		System.out.println("\nFibonacci series for first "+range+" numbers:");
		int prev = 0, next = 1, addition = 0;
		for(int index=0; index<=range; index++){
			System.out.print(next + " ");
			addition = prev + next;
			prev = next;
			next = addition;
		}
	}
	
	public static void main(String[] args){
		FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
		fibonacciNumbers.diplayFibonacciSeries(5);
		fibonacciNumbers.diplayFibonacciSeries(10);
	}
}