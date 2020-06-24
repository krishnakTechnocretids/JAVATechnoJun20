package technoCredits.scannerDemo;

import java.util.Scanner;

import suparnaNJune20.Emp;

public class Example5 {
	int balance = 10000;
	
	void add(int x, int y) {
		System.out.println("Addition is " + (x+y));
	}
	
	void sub(int x, int y) {
		System.out.println("Sub is " + (x-y));
	}
	
	public static void main(String[] args) {
		Example5 example3 = new Example5();
		Scanner scanner = new Scanner(System.in);
		String status="";
		do{
			System.out.println("Which op you want to perform ? add/sub");
			String operation= scanner.next();
			
			System.out.println("Enter first number :");
			int number1 = scanner.nextInt();
			System.out.println("Enter second number :");
			int number2 = scanner.nextInt();
			
			
			if(operation.equals("add"))
				example3.add(number1, number2);
			else if(operation.equals("sub"))
				example3.sub(number1, number2);
			else
				System.out.println("Invalid selection");
			
//			switch(operation) {
//				case "add":
//					example3.add(number1, number2);
//					break;
//				case "sub":
//					example3.sub(number1, number2);
//					break;
//				default:
//					System.out.println("Invalid selection");				
//			}
			
			System.out.println("Would you like to continue?Y/N");
			status = scanner.next(); // Y
			
		}while(status.equals("Y"));
		
	}
}
