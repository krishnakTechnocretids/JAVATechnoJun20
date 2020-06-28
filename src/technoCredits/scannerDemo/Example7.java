package technoCredits.scannerDemo;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Month :");
		String bMonth = scanner.next();
		System.out.println("Enter full name :");
		String name = scanner.nextLine();
		System.out.println("------------");
		String name1 = scanner.nextLine();
		System.out.println("name is " + name1 + " and month is " + bMonth);
		
	}
}
