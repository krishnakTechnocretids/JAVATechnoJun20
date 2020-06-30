/*Program 2: To print first n Fibonacci Numbers.
Input n = 6
Output = 1 1 2  3  5  8

Input: n = 10 
Output :  1 1 2  3  5  8 13  21 34 55*/

package archanaNJun20;

public class FibonacciNumbers {
	void printFibonacciNumbers(int input){
		int num1=0;
		int num2=1;
		System.out.print("\n Output for number "+input +" : ");
		for(int index=0;index<input;index++){
			System.out.print(" "+num2);
			num2=num1+num2;
			num1=num2-num1;	
		}
	}
	public static void main(String[] args) {
		FibonacciNumbers fibonacciNumbers=new FibonacciNumbers();
		fibonacciNumbers.printFibonacciNumbers(6);
		fibonacciNumbers.printFibonacciNumbers(10);
	}
}