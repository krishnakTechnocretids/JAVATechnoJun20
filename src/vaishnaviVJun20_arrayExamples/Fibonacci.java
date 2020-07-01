package vaishnaviVJun20_arrayExamples;

//To print first n Fibonacci Numbers

public class Fibonacci {
	
	void printFibonacciNumbers(int input) {
		int sum=0,num1=0,num2=1;
		System.out.println("Input number is:" +input);
		for(int index=1;index<=input;index++) {
			System.out.print(num2 +" ");
			sum = num1+num2;
			num1=num2;
			num2=sum;			
		}
	}
	
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacciNumbers(10);
	}
}
