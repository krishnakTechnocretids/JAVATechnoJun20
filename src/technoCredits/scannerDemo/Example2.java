package technoCredits.scannerDemo;

import java.util.Scanner;

public class Example2 {

	void processData(String name, int number) {
		for(int index=1;index<=number;index++) {
			System.out.println(name + ":" + index);
		}
	}
	
	public static void main(String[] args) {
		Example2 example1 = new Example2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name :");
		String name = scanner.next(); // String // nextInt --> int // nextFloat() --> float
		System.out.println("Please enter last name :");
		String lname = scanner.next();
		System.out.println("Please enter number : ");
		int number = scanner.nextInt();
		example1.processData(name, number);
		
	}
}
