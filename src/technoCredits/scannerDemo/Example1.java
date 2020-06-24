package technoCredits.scannerDemo;

import java.util.Scanner;

public class Example1 {

	void add(int number1, int number2) {
		System.out.println("Answer is " + (number1+number2));
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int x = sc.nextInt();
		System.out.println("Enter second number : ");
		int y = sc.nextInt();
		example1.add(x,y);
	}
}
