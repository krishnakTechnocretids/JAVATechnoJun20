/*Program 2: To print first n Fibonacci Numbers.
Input n = 6
Output = 1 1 2  3  5  8

Input: n = 10 
Output :  1 1 2  3  5  8 13  21 34 55*/
package archanaNJun20;

public class FibonacciNumbers {
	void printFibonacciNumbers(int input){
		int num1=1;
		int num2=1;
		int sum=0;
		System.out.print("\n"+num1 + "  "+num2+" ");
		for(int index=2;index<input;index++){
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(+sum+" ");
		}
	}
	public static void main(String[] args) {
		FibonacciNumbers fibonacciNumbers=new FibonacciNumbers();
		fibonacciNumbers.printFibonacciNumbers(6);
		fibonacciNumbers.printFibonacciNumbers(10);
	}
}